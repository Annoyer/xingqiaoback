package model;

public class Teacherview {
    private Integer id;

    private Integer userId;

    private String name;

    private Integer level;

    private String abstractteacher;

    private Integer experienceAge;

    private String schedule;

    private Integer priceS;

    private Integer priceT;

    private Integer priceO;

    private String detailaddress;

    private String gender;

    private String phone;

    private String email;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAbstractteacher() {
        return abstractteacher;
    }

    public void setAbstractteacher(String abstractteacher) {
        this.abstractteacher = abstractteacher == null ? null : abstractteacher.trim();
    }

    public Integer getExperienceAge() {
        return experienceAge;
    }

    public void setExperienceAge(Integer experienceAge) {
        this.experienceAge = experienceAge;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule == null ? null : schedule.trim();
    }

    public Integer getPriceS() {
        return priceS;
    }

    public void setPriceS(Integer priceS) {
        this.priceS = priceS;
    }

    public Integer getPriceT() {
        return priceT;
    }

    public void setPriceT(Integer priceT) {
        this.priceT = priceT;
    }

    public Integer getPriceO() {
        return priceO;
    }

    public void setPriceO(Integer priceO) {
        this.priceO = priceO;
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}