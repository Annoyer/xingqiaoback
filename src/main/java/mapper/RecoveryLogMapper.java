package mapper;

import java.util.List;
import model.RecoveryLog;
import model.RecoveryLogExample;
import org.apache.ibatis.annotations.Param;

public interface RecoveryLogMapper {
    int countByExample(RecoveryLogExample example);

    int deleteByExample(RecoveryLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecoveryLog record);

    int insertSelective(RecoveryLog record);

    List<RecoveryLog> selectByExampleWithBLOBs(RecoveryLogExample example);

    List<RecoveryLog> selectByExample(RecoveryLogExample example);

    RecoveryLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecoveryLog record, @Param("example") RecoveryLogExample example);

    int updateByExampleWithBLOBs(@Param("record") RecoveryLog record, @Param("example") RecoveryLogExample example);

    int updateByExample(@Param("record") RecoveryLog record, @Param("example") RecoveryLogExample example);

    int updateByPrimaryKeySelective(RecoveryLog record);

    int updateByPrimaryKeyWithBLOBs(RecoveryLog record);

    int updateByPrimaryKey(RecoveryLog record);
}