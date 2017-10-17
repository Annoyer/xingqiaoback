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

    List<Orderview> selectByExampleWithBLOBs(OrderviewExample example);

    List<Orderview> selectByExample(OrderviewExample example);

    int updateByExampleSelective(@Param("record") Orderview record, @Param("example") OrderviewExample example);

    int updateByExampleWithBLOBs(@Param("record") Orderview record, @Param("example") OrderviewExample example);

    int updateByExample(@Param("record") Orderview record, @Param("example") OrderviewExample example);

    List<Orderview> selectAll();
    List<Integer> selectTeacherIdByParentId(int parentId);
    List<Orderview> selectParentRefundRequest();
    List<Orderview> selectTeacherRefundRequest();
    List<Orderview> selectAllRefundToDeal();
    List<Integer> selectDemandIdsByTeacherId(int teacherId);
}