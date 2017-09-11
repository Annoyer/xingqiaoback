package mapper;

import java.util.List;
import model.Sysmenu;
import model.SysmenuExample;
import org.apache.ibatis.annotations.Param;

public interface SysmenuMapper {
    int countByExample(SysmenuExample example);

    int deleteByExample(SysmenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    List<Sysmenu> selectByExample(SysmenuExample example);

    Sysmenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByExample(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);
}