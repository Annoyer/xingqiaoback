package beans;


import model.OrganizationWithBLOBs;
import model.OrgintroWithBLOBs;

/**
 * Created by joy12 on 2017/9/20.
 */
public class OrgBean {
    OrganizationWithBLOBs organizationWithBLOBs;
    OrgintroWithBLOBs orgintroWithBLOBs;

    public OrgBean(){}

    public OrgBean(OrganizationWithBLOBs organizationWithBLOBs, OrgintroWithBLOBs orgintroWithBLOBs) {
        this.organizationWithBLOBs = organizationWithBLOBs;
        this.orgintroWithBLOBs = orgintroWithBLOBs;
    }

    public OrganizationWithBLOBs getOrganizationWithBLOBs() {
        return organizationWithBLOBs;
    }

    public void setOrganizationWithBLOBs(OrganizationWithBLOBs organizationWithBLOBs) {
        this.organizationWithBLOBs = organizationWithBLOBs;
    }

    public OrgintroWithBLOBs getOrgintroWithBLOBs() {
        return orgintroWithBLOBs;
    }

    public void setOrgintroWithBLOBs(OrgintroWithBLOBs orgintroWithBLOBs) {
        this.orgintroWithBLOBs = orgintroWithBLOBs;
    }
}
