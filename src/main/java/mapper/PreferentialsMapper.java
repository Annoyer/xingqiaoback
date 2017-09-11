package mapper;

import java.util.List;
import model.Preferentials;
import model.PreferentialsExample;
import model.PreferentialsWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface PreferentialsMapper {
    int countByExample(PreferentialsExample example);

    int deleteByExample(PreferentialsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PreferentialsWithBLOBs record);

    int insertSelective(PreferentialsWithBLOBs record);

    List<PreferentialsWithBLOBs> selectByExampleWithBLOBs(PreferentialsExample example);

    List<Preferentials> selectByExample(PreferentialsExample example);

    PreferentialsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PreferentialsWithBLOBs record, @Param("example") PreferentialsExample example);

    int updateByExampleWithBLOBs(@Param("record") PreferentialsWithBLOBs record, @Param("example") PreferentialsExample example);

    int updateByExample(@Param("record") Preferentials record, @Param("example") PreferentialsExample example);

    int updateByPrimaryKeySelective(PreferentialsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PreferentialsWithBLOBs record);

    int updateByPrimaryKey(Preferentials record);
}