package mapper;

import java.util.List;
import model.Assessitem;
import model.AssessitemExample;
import org.apache.ibatis.annotations.Param;

public interface AssessitemMapper {
    int countByExample(AssessitemExample example);

    int deleteByExample(AssessitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assessitem record);

    int insertSelective(Assessitem record);

    List<Assessitem> selectByExampleWithBLOBs(AssessitemExample example);

    List<Assessitem> selectByExample(AssessitemExample example);

    Assessitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assessitem record, @Param("example") AssessitemExample example);

    int updateByExampleWithBLOBs(@Param("record") Assessitem record, @Param("example") AssessitemExample example);

    int updateByExample(@Param("record") Assessitem record, @Param("example") AssessitemExample example);

    int updateByPrimaryKeySelective(Assessitem record);

    int updateByPrimaryKeyWithBLOBs(Assessitem record);

    int updateByPrimaryKey(Assessitem record);
}