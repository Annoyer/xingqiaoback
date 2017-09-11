package mapper;

import java.util.List;
import model.Organization;
import model.OrganizationExample;
import model.OrganizationWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrganizationWithBLOBs record);

    int insertSelective(OrganizationWithBLOBs record);

    List<OrganizationWithBLOBs> selectByExampleWithBLOBs(OrganizationExample example);

    List<Organization> selectByExample(OrganizationExample example);

    OrganizationWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrganizationWithBLOBs record, @Param("example") OrganizationExample example);

    int updateByExampleWithBLOBs(@Param("record") OrganizationWithBLOBs record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(OrganizationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrganizationWithBLOBs record);

    int updateByPrimaryKey(Organization record);
}