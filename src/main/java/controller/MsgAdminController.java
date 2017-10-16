package controller;

import model.MessageAdmin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MsgAdminService.IMsgAdminService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joy12 on 2017/10/3.
 */
@Controller
public class MsgAdminController {
    @Resource
    private IMsgAdminService msgAdminService;

    @RequestMapping(value = "/jsp/msg_admin")
    public ModelAndView toMsgAdmin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("msg_admin");
        List<MessageAdmin> msgs = msgAdminService.getAllMsg();
        if (msgs == null) msgs = new ArrayList<>();
        mv.addObject("msgsAdmin",msgs);
        return mv;
    }
}
