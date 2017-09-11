package mapper;

import java.util.List;
import model.Assessresult;
import model.AssessresultExample;
import org.apache.ibatis.annotations.Param;

public interface AssessresultMapper {
    int countByExample(AssessresultExample example);

    int deleteByExample(AssessresultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assessresult record);

    int insertSelective(Assessresult record);

    List<Assessresult> selectByExampleWithBLOBs(AssessresultExample example);

    List<Assessresult> selectByExample(AssessresultExample example);

    Assessresult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assessresult record, @Param("example") AssessresultExample example);

    int updateByExampleWithBLOBs(@Param("record") Assessresult record, @Param("example") AssessresultExample example);

    int updateByExample(@Param("record") Assessresult record, @Param("example") AssessresultExample example);

    int updateByPrimaryKeySelective(Assessresult record);

    int updateByPrimaryKeyWithBLOBs(Assessresult record);

    int updateByPrimaryKey(Assessresult record);
}