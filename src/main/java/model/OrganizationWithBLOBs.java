package model;

public class OrganizationWithBLOBs extends Organization {
    private String organizationAbstract;

    private String introduce;

    public String getAbstract() {
        return organizationAbstract;
    }

    public void setAbstract(String organizationAbstract) {
        this.organizationAbstract = organizationAbstract == null ? null : organizationAbstract.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}