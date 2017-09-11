package mapper;

import java.util.List;
import model.Area3;
import model.Area3Example;
import org.apache.ibatis.annotations.Param;

public interface Area3Mapper {
    int countByExample(Area3Example example);

    int deleteByExample(Area3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Area3 record);

    int insertSelective(Area3 record);

    List<Area3> selectByExample(Area3Example example);

    Area3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Area3 record, @Param("example") Area3Example example);

    int updateByExample(@Param("record") Area3 record, @Param("example") Area3Example example);

    int updateByPrimaryKeySelective(Area3 record);

    int updateByPrimaryKey(Area3 record);
}