package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.RefundService.IRefundService;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by joy12 on 2017/10/4.
 */
@Controller
public class RefundController {
    @Resource
    private IRefundService refundService;

    @RequestMapping(value = "/jsp/refund_check")
    public ModelAndView toRefundCheck(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("refund_check");
        mv.addObject("teacherCancelList",refundService.getTeacherCancelRequest());
        mv.addObject("parentCancelList",refundService.getParentCancelRequest());
        return mv;
    }

    @RequestMapping(value = "/jsp/refund_deal")
    public ModelAndView toRefundDeal(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("refund_deal");
        mv.addObject("refundToDealList",refundService.getAllRefundRequest());
        return mv;
    }

    //审核退款请求
    @RequestMapping(value = "/jsp/checkRefund")
    @ResponseBody
    public Map checkRefund(@RequestParam("orderId") String orderId, @RequestParam("requestSubject") String requestSubject, @RequestParam("isAccept") Boolean isAccept){
        refundService.checkRefundRequest(orderId,requestSubject,isAccept);
        return null;
    }

    //处理退款
    @RequestMapping(value = "/jsp/dealRefund")
    @ResponseBody
    public Map dealRefund(@RequestParam("orderId") String orderId,@RequestParam("refundAmount") Double refundAmount){
        //refundService.dealRefundRequest(orderId,refundAmount);

        return null;
    }
}
