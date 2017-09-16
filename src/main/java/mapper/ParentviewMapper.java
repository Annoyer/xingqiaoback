package mapper;

import java.util.List;
import model.Parentview;
import model.ParentviewExample;
import org.apache.ibatis.annotations.Param;

public interface ParentviewMapper {
    int countByExample(ParentviewExample example);

    int deleteByExample(ParentviewExample example);

    int insert(Parentview record);

    int insertSelective(Parentview record);

    List<Parentview> selectByExample(ParentviewExample example);

    Parentview selectByParentId(Integer parentId);

    int updateByExampleSelective(@Param("record") Parentview record, @Param("example") ParentviewExample example);

    int updateByExample(@Param("record") Parentview record, @Param("example") ParentviewExample example);
}