package mapper;

import java.util.List;
import model.Area2;
import model.Area2Example;
import org.apache.ibatis.annotations.Param;

public interface Area2Mapper {
    int countByExample(Area2Example example);

    int deleteByExample(Area2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Area2 record);

    int insertSelective(Area2 record);

    List<Area2> selectByExample(Area2Example example);

    Area2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Area2 record, @Param("example") Area2Example example);

    int updateByExample(@Param("record") Area2 record, @Param("example") Area2Example example);

    int updateByPrimaryKeySelective(Area2 record);

    int updateByPrimaryKey(Area2 record);
}