package model;

public class OrganizationWithBLOBs extends Organization {
    private String organization_abstract;

    private String introduce;

    public String getAbstract() {
        return organization_abstract;
    }

    public void setAbstract(String organization_abstract) {
        this.organization_abstract = organization_abstract == null ? null : organization_abstract.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}