package service.OrganizationService;

import mapper.OrganizationMapper;
import mapper.OrganizationviewMapper;
import mapper.OrgintroMapper;
import model.Organization;
import model.OrganizationWithBLOBs;
import model.OrganizationviewWithBLOBs;
import model.OrgintroWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joy12 on 2017/9/16.
 */
@Service("IOrganizationService")
public class OrganizationServiceImpl implements IOrganizationService{
    @Autowired
    private OrganizationMapper organizationMapper;
    @Autowired
    private OrgintroMapper orgintroMapper;
    @Autowired
    private OrganizationviewMapper organizationviewMapper;

    @Override
    public List<OrganizationviewWithBLOBs> getAllOrganizationsFromView() {
        List<OrganizationviewWithBLOBs> result = organizationviewMapper.selectAll();
        if (result == null) result = new ArrayList<>();
        return result;
    }

    @Override
    public Organization getOrganizationById(Integer id) {
        return organizationMapper.selectByPrimaryKey(id);
    }

    @Override
    public OrgintroWithBLOBs getOrgintroById(Integer id) {
        return orgintroMapper.selectByOrgId(id);
    }

    @Override
    @Secured("ROLE_SUPER")
    public void addOrganization(OrganizationWithBLOBs organization, OrgintroWithBLOBs orgintro) {
        System.out.println("==========  organization Add!!!");
        organizationMapper.insertSelectiveRet(organization);
        System.out.println(organization.getId());
        orgintro.setOrgId(organization.getId());
        System.out.println("==========  orgintro Add!!!");
        orgintroMapper.insertSelective(orgintro);
    }

    @Override
    @Secured("ROLE_SUPER")
    public void deleteOrganization(Integer orgId) {
        orgintroMapper.deleteByOrgId(orgId);
        organizationMapper.deleteByPrimaryKey(orgId);
    }

    @Override
    @Secured("ROLE_SUPER")
    public void modifyOrganization(OrganizationWithBLOBs organization, OrgintroWithBLOBs orgintro) {
        organizationMapper.updateByPrimaryKeyWithBLOBs(organization);
        orgintro.setId(orgintroMapper.selectByOrgId(orgintro.getOrgId()).getId());
        orgintroMapper.updateByPrimaryKeyWithBLOBs(orgintro);
    }
}
