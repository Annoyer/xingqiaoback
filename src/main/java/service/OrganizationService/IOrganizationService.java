package service.OrganizationService;

import model.Organization;
import model.OrganizationWithBLOBs;
import model.OrganizationviewWithBLOBs;
import model.OrgintroWithBLOBs;

import java.util.List;

/**
 * Created by joy12 on 2017/9/16.
 */
public interface IOrganizationService {
    public List<OrganizationviewWithBLOBs> getAllOrganizationsFromView();
    public Organization getOrganizationById(Integer id);
    public OrgintroWithBLOBs getOrgintroById(Integer id);

    public void addOrganization(OrganizationWithBLOBs organization, OrgintroWithBLOBs orgintro);
    public void deleteOrganization(Integer id);
    public void modifyOrganization(OrganizationWithBLOBs organization, OrgintroWithBLOBs orgintro);
}
