package mapper;

import java.util.List;
import model.Orgintro;
import model.OrgintroExample;
import model.OrgintroWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface OrgintroMapper {
    int countByExample(OrgintroExample example);

    int deleteByExample(OrgintroExample example);

    int deleteByOrgId(Integer orgId);

    int deleteByPrimaryKey(Integer id);

    int insert(OrgintroWithBLOBs record);

    int insertSelective(OrgintroWithBLOBs record);

    List<OrgintroWithBLOBs> selectByExampleWithBLOBs(OrgintroExample example);

    List<Orgintro> selectByExample(OrgintroExample example);

    OrgintroWithBLOBs selectByPrimaryKey(Integer id);

    OrgintroWithBLOBs selectByOrgId(Integer id);

    int updateByExampleSelective(@Param("record") OrgintroWithBLOBs record, @Param("example") OrgintroExample example);

    int updateByExampleWithBLOBs(@Param("record") OrgintroWithBLOBs record, @Param("example") OrgintroExample example);

    int updateByExample(@Param("record") Orgintro record, @Param("example") OrgintroExample example);

    int updateByPrimaryKeySelective(OrgintroWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrgintroWithBLOBs record);

    int updateByPrimaryKey(Orgintro record);
}