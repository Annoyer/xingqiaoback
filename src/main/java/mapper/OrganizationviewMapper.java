package mapper;

import java.util.List;

import model.Organization;
import model.Organizationview;
import model.OrganizationviewExample;
import model.OrganizationviewWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface OrganizationviewMapper {
    int countByExample(OrganizationviewExample example);

    int deleteByExample(OrganizationviewExample example);

    int insert(OrganizationviewWithBLOBs record);

    int insertSelective(OrganizationviewWithBLOBs record);

    List<OrganizationviewWithBLOBs> selectByExampleWithBLOBs(OrganizationviewExample example);

    List<Organizationview> selectByExample(OrganizationviewExample example);

    List<OrganizationviewWithBLOBs> selectAll();

    int updateByExampleSelective(@Param("record") OrganizationviewWithBLOBs record, @Param("example") OrganizationviewExample example);

    int updateByExampleWithBLOBs(@Param("record") OrganizationviewWithBLOBs record, @Param("example") OrganizationviewExample example);

    int updateByExample(@Param("record") Organizationview record, @Param("example") OrganizationviewExample example);
}