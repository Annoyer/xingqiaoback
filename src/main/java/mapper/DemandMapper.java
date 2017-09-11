package mapper;

import java.util.List;
import model.Demand;
import model.DemandExample;
import model.DemandWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface DemandMapper {
    int countByExample(DemandExample example);

    int deleteByExample(DemandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DemandWithBLOBs record);

    int insertSelective(DemandWithBLOBs record);

    List<DemandWithBLOBs> selectByExampleWithBLOBs(DemandExample example);

    List<Demand> selectByExample(DemandExample example);

    DemandWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DemandWithBLOBs record, @Param("example") DemandExample example);

    int updateByExampleWithBLOBs(@Param("record") DemandWithBLOBs record, @Param("example") DemandExample example);

    int updateByExample(@Param("record") Demand record, @Param("example") DemandExample example);

    int updateByPrimaryKeySelective(DemandWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DemandWithBLOBs record);

    int updateByPrimaryKey(Demand record);
}