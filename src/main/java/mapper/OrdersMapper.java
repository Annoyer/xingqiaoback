package mapper;

import java.util.List;
import model.Orders;
import model.OrdersExample;
import model.OrdersWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdersWithBLOBs record);

    int insertSelective(OrdersWithBLOBs record);

    List<OrdersWithBLOBs> selectByExampleWithBLOBs(OrdersExample example);

    List<Orders> selectByExample(OrdersExample example);

    OrdersWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(OrdersWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrdersWithBLOBs record);

    int updateByPrimaryKey(Orders record);
}