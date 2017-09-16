package mapper;

import java.util.List;
import model.Orderview;
import model.OrderviewExample;
import org.apache.ibatis.annotations.Param;

public interface OrderviewMapper {
    int countByExample(OrderviewExample example);

    int deleteByExample(OrderviewExample example);

    int insert(Orderview record);

    int insertSelective(Orderview record);

    List<Orderview> selectByExample(OrderviewExample example);

    List<Orderview> selectAll();

    int updateByExampleSelective(@Param("record") Orderview record, @Param("example") OrderviewExample example);

    int updateByExample(@Param("record") Orderview record, @Param("example") OrderviewExample example);
}