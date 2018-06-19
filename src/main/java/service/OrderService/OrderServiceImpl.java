package service.OrderService;

import mapper.*;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by joy12 on 2017/9/11.
 */
@Service(value = "IOrderService")
public class OrderServiceImpl implements IOrderService {
    @Resource
    private OrdersMapper ordersMapper;
    @Resource
    private OrderviewMapper orderviewMapper;
    @Resource
    private RecoveryLogMapper recoveryLogMapper;
    @Autowired
    private TeacherviewMapper teacherMapper;
    @Autowired
    private ParentviewMapper parentMapper;
    @Resource
    private DemandMapper demandMapper;

    @Override
    public OrdersWithBLOBs getOrderById(String orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public TeacherviewWithBLOBs getTeacherById(Integer teacherId) {
        return teacherMapper.selectByTeacherId(teacherId);
    }

    @Override
    public Parentview getParentById(Integer parentId) {
        return parentMapper.selectByParentId(parentId);
    }

    @Override
    public DemandWithBLOBs getDemandById(Integer demandId) {
        return demandMapper.selectByPrimaryKey(demandId);
    }

    @Override
    public List<RecoveryLog> getRecoveryLogById(String orderId) {
        List<RecoveryLog> result = new ArrayList<>();
        List<RecoveryLog> tmp = recoveryLogMapper.selectByOrderId(orderId);
        if (tmp != null){
            result.addAll(tmp);
        }
        return result;
    }


    @Override
    public List<Orderview> getAllOrderFromView() {
        List<Orderview> result = new ArrayList<>();
        List<Orderview> tmp = orderviewMapper.selectAll();
        if (tmp != null){
            result.addAll(tmp);
        }
        return result;
    }

    @Override
    @Secured("ROLE_SUPER")
    public boolean deleteOrder(String orderId) {
        if (ordersMapper.selectByPrimaryKey(orderId) != null){
            ordersMapper.deleteByPrimaryKey(orderId);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String getParentStatus(int status){
        switch (status){
            case 1: return "待治疗师确认";
            case 2: return "待付款（治疗师已确认）";
            case 3: return "进行中";
            case 4: return "家长终止审核中";
            case 5: return "治疗师终止审核中";
            case 6: return "家长终止退款处理中";
            case 7: return "治疗师终止待同意";
            case 8: return "家长终止待治疗师同意";
            case 9: return "治疗师终止退款处理中";
            case 11: return "家长已取消订单";
            case 12: return "治疗师逾期未处理";
            case 13: return "治疗师拒绝的历史订单";
            case 14: return "家长中途终止的历史订单";
            case 15: return "订单已完成";
            case 16: return "治疗师拒绝的订单";
            default: return "订单状态异常";
        }
    }

    @Override
    public String getTeacherStatus(int status){
        switch (status){
            case 1: return "待处理";
            case 2: return "治疗师已确认";
            case 3: return "进行中";
            case 4: return "家长终止审核中";
            case 5: return "治疗师终止审核中";
            case 6: return "家长终止退款处理中";
            case 7: return "治疗师终止待家长同意";
            case 8: return "家长终止待治疗师同意";
            case 9: return "治疗师终止退款处理中";
            case 11: return "家长已取消订单";
            case 12: return "治疗师逾期未处理";
            case 13: return "治疗师拒绝的历史订单";
            case 14: return "家长中途终止的历史订单";
            case 15: return "订单已完成";
            case 16: return "治疗师拒绝的订单";
            default: return "订单状态异常";
        }
    }
}
