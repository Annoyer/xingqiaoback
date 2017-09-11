package service.OrderService;

import model.Orders;

/**
 * Created by joy12 on 2017/9/11.
 */
public interface IOrderService {
    public Orders getOrderById(String orderId);
}
