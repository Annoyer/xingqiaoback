package controller;

import model.DemandWithBLOBs;
import model.Orders;
import model.OrdersWithBLOBs;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.OrderService.IOrderService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by joy12 on 2017/9/15.
 */
@Controller
public class OrderController {
    @Resource
    protected IOrderService orderService;

    @RequestMapping(value = "/jsp/orders")
    public ModelAndView toOrders() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("orders");
        mv.addObject("orders", orderService.getAllOrderFromView());
        return mv;
    }

    @RequestMapping(value = "/jsp/order_detail")
    public ModelAndView toOrderDetail(@RequestParam("orderId") String orderId,
                                      @RequestParam("teacherId") Integer teacherId,
                                      @RequestParam("parentId") Integer parentId,
                                      @RequestParam("demandId") Integer demandId) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("order_detail");
        OrdersWithBLOBs orders = orderService.getOrderById(orderId);
        mv.addObject("order",orders);
        mv.addObject("recoveryLog",orderService.getRecoveryLogById(orderId));
        mv.addObject("teacher",orderService.getTeacherById(teacherId));
        mv.addObject("parent",orderService.getParentById(parentId));
        DemandWithBLOBs demand = orderService.getDemandById(demandId);
        mv.addObject("demand", demand);

        switch (orders.getStatusP()){
            case 1: mv.addObject("statusP","待治疗师确认"); break;
            case 2: mv.addObject("statusP","待付款（治疗师已确认）"); break;
            case 3: mv.addObject("statusP","进行中"); break;
            case 11: mv.addObject("statusP","家长已取消订单"); break;
            case 12: mv.addObject("statusP","治疗师逾期未处理"); break;
            case 13: mv.addObject("statusP","治疗师拒绝的历史订单"); break;
            case 14: mv.addObject("statusP","家长中途终止的历史订单"); break;
            case 15: mv.addObject("statusP","订单已完成"); break;
            case 16: mv.addObject("statusP","治疗师拒绝的订单"); break;
            default: mv.addObject("statusP","订单状态异常");
        }

        switch (orders.getStatusT()){
            case 1: mv.addObject("statusT","待处理"); break;
            case 2: mv.addObject("statusT","治疗师已确认"); break;
            case 3: mv.addObject("statusT","进行中"); break;
            case 11: mv.addObject("statusT","家长已取消订单"); break;
            case 12: mv.addObject("statusT","治疗师逾期未处理"); break;
            case 13: mv.addObject("statusT","治疗师拒绝的历史订单"); break;
            case 14: mv.addObject("statusT","家长中途终止的历史订单"); break;
            case 15: mv.addObject("statusT","订单已完成"); break;
            case 16: mv.addObject("statusT","治疗师拒绝的订单"); break;
            default: mv.addObject("statusT","订单状态异常");
        }

        if (orders.getTrace() != null && !orders.getTrace().isEmpty()){
            String[] traces = orders.getTrace().split("#");
            List<Map<String,String>> trace= new ArrayList<>();
            for (String str : traces){
                String[] singleTrace = str.split("@");
                Map<String,String> recordMap = new HashMap<>();
                if (singleTrace.length == 2){
                    recordMap.put("time",singleTrace[0]);
                    recordMap.put("content",singleTrace[1]);
                    recordMap.put("isError","false");
                } else {
                    recordMap.put("isError","true");
                }
                trace.add(recordMap);
            }
            mv.addObject("trace", trace);
        }

        if (demand.getRecoveryHis() != null && !demand.getRecoveryHis().isEmpty()){
            String[] recoveryArr = demand.getRecoveryHis().split("@");
            List<Map<String,String>> recoveryHis = new ArrayList<>();
            for (String str : recoveryArr) {
                String[] singleRecord = str.split("#");
                Map<String,String> recordMap = new HashMap<>();
                if (singleRecord.length == 4){
                    recordMap.put("organization",singleRecord[0]);
                    recordMap.put("period",singleRecord[1]);
                    recordMap.put("frequent",singleRecord[2]);
                    recordMap.put("content",singleRecord[3]);
                    recordMap.put("isError","false");
                } else {
                    recordMap.put("isError","true");
                }
                recoveryHis.add(recordMap);
            }
            mv.addObject("recoveryHis",recoveryHis);
        }

        return mv;
    }

    @RequestMapping(value = "/jsp/test/getOrderByOrderId", method = RequestMethod.POST)
    @ResponseBody
    public Map getOrderById(@RequestParam("orderId") String orderId) {
        Orders order = orderService.getOrderById("10999");
        Map result = new HashMap();
        result.put("order",order);
        return result;
    }


}
