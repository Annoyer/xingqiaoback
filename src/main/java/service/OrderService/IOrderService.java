package service.OrderService;

import model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by joy12 on 2017/9/11.
 */
public interface IOrderService {
    public OrdersWithBLOBs getOrderById(String orderId);
    public TeacherviewWithBLOBs getTeacherById(Integer teacherId);
    public Parentview getParentById(Integer parentId);
    public DemandWithBLOBs getDemandById(Integer demandId);
    public List<RecoveryLog> getRecoveryLogById(String orderId);
    public List<Orderview> getAllOrderFromView();
    public boolean deleteOrder(String orderId);
}
