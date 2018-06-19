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
        mv.addObject("statusP", orderService.getParentStatus(orders.getStatusP()));
        mv.addObject("statusT", orderService.getTeacherStatus(orders.getStatusT()));

        if (orders.getTrace() != null && !orders.getTrace().isEmpty()){
            String[] traces = orders.getTrace().split("#");
            List<Map<String,String>> trace= new ArrayList<>();
            if (traces != null && traces.length > 0){
                for (String str : traces){
                    String[] singleTrace = str.split("@");
                    Map<String,String> recordMap = new HashMap<>();
                    if (singleTrace.length == 2){
                        recordMap.put("time",singleTrace[0]);
                        recordMap.put("content",singleTrace[1]);
 //                       recordMap.put("isError","false");
                        trace.add(recordMap);
                    }
// else {
//                        recordMap.put("isError","true");
//                    }
                }
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


    @RequestMapping(value = "/jsp/deleteOrder", method = RequestMethod.POST)
    @ResponseBody
    public Map getOrderById(@RequestParam("orderId") String orderId) {
        Map result = new HashMap();
        if (orderService.deleteOrder(orderId)){
            result.put("retCode", 0);
            result.put("retMsg","删除成功");
        } else {
            result.put("retCode", 1);
            result.put("retMsg","该条数据不存在！");
        }
        return result;
    }

}
