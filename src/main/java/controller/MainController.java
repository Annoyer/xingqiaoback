package controller;

import net.sf.json.JSONObject;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.MsgAdminService.IMsgAdminService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joy12 on 2017/9/11.
 */
@Controller
public class MainController {
    @Resource
    private IMsgAdminService msgAdminService;

    @RequestMapping(value = "/jsp/main")
    public String toMain(ModelMap modelMap) {
        System.out.println();
        System.out.println();
        System.out.println("--------------!!!!!!!======== to main===============!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println();


        modelMap.addAttribute("user", getPrincipal());

        modelMap.addAttribute("unreadMsgNum",msgAdminService.countUnreadMsg());

        return "main";
    }

    @RequestMapping(value = "/jsp/access_err",method = RequestMethod.GET)
    public ModelAndView accessErr(@RequestParam(value = "errType", required = false) String errType){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("access_err");
        mv.addObject("user",getPrincipal());
        if (errType != null && errType.equals("loginErr")){
            mv.addObject("errMsg","账号密码错误");
        } else if (errType != null && errType.equals("noAuth")){
            mv.addObject("errMsg","您的账号不具备访问权限");
        } else {
            mv.addObject("errMsg","未知错误");
        }
        return mv;
    }

    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }


    @RequestMapping(value = "/jsp/saveImg")
    @ResponseBody
    public Map<String,String> imgToUpload(MultipartFile imgFile, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("aaaaaaaaaa");
        Map<String,String> result = new HashMap<>();
        //保存头像至服务器
        if (!imgFile.isEmpty()) {
            try {
                System.out.println("头像原始图片文件名：" + imgFile.getOriginalFilename());
                String originalName = imgFile.getOriginalFilename();
                String fileRelativePath = "/imgUpload";
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath(fileRelativePath);
                File f = new File(filePath);
                //若目录不存在，则创建
                if(!f.exists()){
                    f.mkdirs();
                }
                // 转存文件

                imgFile.transferTo(new File(filePath,originalName));

                result.put("success","true");
                result.put("file_path",filePath+"/"+originalName);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("文件为空");
            result.put("success","false");
        }

        return result;

    }

}
