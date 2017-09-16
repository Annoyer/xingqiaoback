package model;

public class OrgintroWithBLOBs extends Orgintro {
    private String orgintroAbstract;

    private String course;

    private String service;

    private String hardware;

    private String team;

    private String phone;

    private String address;

    public String getAbstract() {
        return orgintroAbstract;
    }

    public void setAbstract(String orgintroAbstract) {
        this.orgintroAbstract = orgintroAbstract == null ? null : orgintroAbstract.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware == null ? null : hardware.trim();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}