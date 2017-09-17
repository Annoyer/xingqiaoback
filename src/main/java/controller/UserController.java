package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.UserService.IUserService;

import javax.annotation.Resource;

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
}
