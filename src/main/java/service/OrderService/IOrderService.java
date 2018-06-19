package service.OrderService;

import model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by joy12 on 2017/9/11.
 */
public interface IOrderService {
    OrdersWithBLOBs getOrderById(String orderId);
    TeacherviewWithBLOBs getTeacherById(Integer teacherId);
    Parentview getParentById(Integer parentId);
    DemandWithBLOBs getDemandById(Integer demandId);
    List<RecoveryLog> getRecoveryLogById(String orderId);
    List<Orderview> getAllOrderFromView();
    boolean deleteOrder(String orderId);
    String getParentStatus(int status);
    String getTeacherStatus(int status);
}
