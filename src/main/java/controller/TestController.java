package controller;

import model.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrderService.IOrderService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joy12 on 2017/9/11.
 */
@Controller
public class TestController {
    @Resource
    protected IOrderService orderService;

    @RequestMapping(value = "/jsp/test/getOrderByOrderId", method = RequestMethod.POST)
    @ResponseBody
    public Map getOrderById(@RequestParam("orderId") String orderId) {
        Orders order = orderService.getOrderById("10999");
        Map result = new HashMap();
        result.put("order",order);
        return result;
    }

    @RequestMapping(value = "/jsp/main")
    public String toRegister() {
        return "main";
    }

}
