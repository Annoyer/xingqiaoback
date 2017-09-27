package controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by joy12 on 2017/9/22.
 */
@Controller
public class LogInOutController{
    @RequestMapping(value = "/jsp/login")
    public ModelAndView login(@RequestParam(value = "state", required = false) String state){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        String logout = "none";
        String noAcc = "none";
        if (state!=null){
            if (state.equals("logout")){
                logout = "block";
            } else if (state.equals("noAccount")){
                noAcc = "block";
            }
        }
        mv.addObject("logoutMsg",logout);
        mv.addObject("noAccountMsg",noAcc);

        return mv;
    }

    @RequestMapping(value = "/jsp/logout")
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        mv.addObject("state","logout");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return mv;
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

    @RequestMapping(value = "/jsp/main")
    public String toMain(ModelMap modelMap) {
        modelMap.addAttribute("user", getPrincipal());
        return "main";
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

}
