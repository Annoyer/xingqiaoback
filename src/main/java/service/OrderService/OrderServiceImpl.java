package service.OrderService;

import mapper.OrdersMapper;
import model.Orders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by joy12 on 2017/9/11.
 */
@Service(value = "IOrderService")
public class OrderServiceImpl implements IOrderService {
    @Resource
    private OrdersMapper ordersMapper;
    @Override
    public Orders getOrderById(String orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);
    }
}
