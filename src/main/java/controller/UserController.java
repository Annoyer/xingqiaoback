package controller;

import com.sun.org.apache.regexp.internal.RE;
import model.Sysuser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserService.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 86761 on 2017/9/16.
 */
@Controller
public class UserController {
    @Resource
    protected IUserService userService;

    @RequestMapping(value = "/jsp/parents")
    public ModelAndView toParents() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("parents");

        mv.addObject("parents", userService.getAllParentFromView());
        return mv;
    }

    @RequestMapping(value = "/jsp/parent_teachers")
    public ModelAndView toParentTeachers(@RequestParam("parentId") Integer parentId){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("parent_teachers");
        mv.addObject("teachers",userService.getAllTeachersByParentId(parentId));
        return mv;
    }

    @RequestMapping(value = "/jsp/parent_demands")
    public ModelAndView toParentDemands(@RequestParam("userId") Integer userId){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("parent_demands");
        mv.addObject("demands",userService.getAllDemandsByUserId(userId));
        return mv;
    }

    @RequestMapping(value="/jsp/teachers")
    public ModelAndView toTeachers(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teachers");
        mv.addObject("teachers",userService.getAllTeachers());
        return mv;
    }

    @RequestMapping(value = "/jsp/teacher_detail")
    public ModelAndView toTeacherDetail(@RequestParam("id") Integer id){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher_detail");
        mv.addObject("teacher",userService.getTeacherById(id));
        return mv;
    }

    @RequestMapping(value = "/jsp/teacher_sysuser")
    public ModelAndView toTeacherSysuser(@RequestParam("userId") Integer userId){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher_sysuser");
        mv.addObject("user",userService.getSysuserById(userId));
        return mv;
    }

    @RequestMapping(value = "/jsp/parent_detail")
    public ModelAndView toParentDetail(@RequestParam("parentId") Integer parentId){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("parent_detail");
        mv.addObject("parent",userService.getParentById(parentId));
        return mv;
    }

    @RequestMapping(value = "/jsp/saveParentInfo",method = RequestMethod.POST)
    @ResponseBody
    public Map saveParentInfo(@RequestParam("parentId") Integer parentId,
                              @RequestParam("name") String name,
                              @RequestParam("ground") String ground,
                              @RequestParam("address") String address){
        Map result=new HashMap();
        userService.modifyParentInfo(parentId,name,ground,address);
        result.put("retcode",0);
        return result;
    }

    @RequestMapping(value="/jsp/deleteParent")
    @ResponseBody
    public Map deleteParent(@RequestParam("parentId") Integer parentId,
                             @RequestParam("userId") Integer userId){
        System.out.println("delete parentid="+parentId);
        Map result=new HashMap();
        userService.deleteParent(parentId,userId);
        result.put("retcode",0);
        return result;
    }

    @RequestMapping(value = "/jsp/saveTeacherInfo",method = RequestMethod.POST)
    @ResponseBody
    public Map saveTeacherInfo(@RequestParam("teacherId") Integer teacherId,
                               @RequestParam("name") String name,
                               @RequestParam("pid") String pid,
                               @RequestParam("address") String address,
                               @RequestParam("detailaddress") String detailaddress,
                               @RequestParam("abstractT") String abstractT,
                               @RequestParam("experienceAge") Integer experienceAge,
                               @RequestParam("school") String school,
                               @RequestParam("unit") String unit,
                               @RequestParam("domain") String domain,
                               @RequestParam("question") String question,
                               @RequestParam("object") String object,
                               @RequestParam("way") String way,
                               @RequestParam("priceT") Integer priceT,
                               @RequestParam("priceS") Integer priceS,
                               @RequestParam("priceO") Integer priceO,
                               @RequestParam("tGround") String tGround,
                               @RequestParam("sGround") String sGround
                               ){
        Map result=new HashMap();
        userService.modifyTeacherWithBLOB(teacherId,name,pid,address,detailaddress,abstractT,experienceAge,school,unit,
                domain,question,object,way,priceS,priceT,priceO,tGround,sGround);
        result.put("retcode",0);
        return result;
    }

    @RequestMapping(value="/jsp/deleteTeacher")
    @ResponseBody
    public Map deleteTeacher(@RequestParam("id") Integer userId){
        Map result=new HashMap();
        userService.deleteTeacher(userId);
        result.put("retcode",0);
        return result;
    }

    @RequestMapping(value = "/jsp/getSysuserInfo")
    @ResponseBody
    public Map getSysuserInfo(@RequestParam("userId") Integer userId){
        System.out.println("getSysuserInfo!");
        Map result =new HashMap();
        result.put("user",userService.getSysuserById(userId));
        return result;

    }

    @RequestMapping(value = "/jsp/modifyUser", method = RequestMethod.POST)
    @ResponseBody
    public Map modifyUser(@RequestParam("userId") Integer userId,
                            @RequestParam("phone") String phone,
                            @RequestParam("email") String email) throws UnsupportedEncodingException {
        System.out.println("modify user!");
       Map result=new HashMap();
       userService.modifySysuserInfo(userId,phone,email);
       result.put("retcode",0);
       return result;
    }

    @RequestMapping(value = "/jsp/modifyPw", method = RequestMethod.POST)
    @ResponseBody
    public Map modifyUser(@RequestParam("userId") Integer userId,
                          @RequestParam("pw") String pw) {
        System.out.println("modify password!");
        Map result=new HashMap();
        userService.modifySysuserPw(userId,pw);
        result.put("retcode",0);
        return result;
    }

    @RequestMapping(value = "/jsp/addTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Map addTeacher(@RequestParam("username") String  username,
                          @RequestParam("password") String  password,
                          @RequestParam("name") String name,
                          @RequestParam("pid") String pid,
                          @RequestParam("gender") String  gender,
                          @RequestParam("address") String address,
                          @RequestParam("phone") String phone,
                          @RequestParam("email") String email,
                          @RequestParam("school") String school,
                          @RequestParam("unit") String unit,
                          @RequestParam("tGround") String tGround,
                          @RequestParam("sGround") String sGround,
                          @RequestParam("domain") String  domain,
                          @RequestParam("question") String question,
                          @RequestParam("object") String object,
                          @RequestParam("way") String way,
                          @RequestParam("priceS") Integer priceS,
                          @RequestParam("priceT") Integer priceT,
                          @RequestParam("priceO") Integer priceO){
        Map result=new HashMap();
        userService.addTeacher(username,password,name,pid, gender,address, phone, email, school,
                unit, tGround, sGround, domain, question, object,way, priceS,priceT,priceO);
        result.put("retcode",0);
        return result;
    }

    @RequestMapping(value = "/jsp/addParent",method = RequestMethod.POST)
    @ResponseBody
    public Map addTeacher(@RequestParam("username") String  username,
                          @RequestParam("password") String  password,
                          @RequestParam("name") String name,
                          @RequestParam("pid") String pid,
                          @RequestParam("gender") String  gender,
                          @RequestParam("ground") String ground,
                          @RequestParam("address") String address,
                          @RequestParam("phone") String phone,
                          @RequestParam("email") String email){
        Map result=new HashMap();
        userService.addParent(username,password,name,pid, gender,ground,address, phone, email);
        result.put("retcode",0);
        return result;
    }

}
