package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserService.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
        mv.addObject("teachers",userService.getAllTeachersFromView());
        return mv;
    }

    @RequestMapping(value = "/jsp/teacher_detail")
    public ModelAndView toTeacherDetail(@RequestParam("id") Integer id){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher_detail");
        mv.addObject("teacher",userService.getTeacherById(id));
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
        System.out.println("saveParentInfo");
        System.out.println(name+' '+ground+" "+address);
        Map result=new HashMap();
        userService.modifyParentInfo(parentId,name,ground,address);
        result.put("retcode",0);
        return result;
    }
}
