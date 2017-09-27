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
}
