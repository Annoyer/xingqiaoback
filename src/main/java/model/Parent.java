package model;

public class Parent {
    private Integer id;

    private Integer userid;

    private String realname;

    private String pid;

    private String pidurl;

    private String address;

    private String ground;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPidurl() {
        return pidurl;
    }

    public void setPidurl(String pidurl) {
        this.pidurl = pidurl == null ? null : pidurl.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground == null ? null : ground.trim();
    }
}