package model;

public class Teacher {
    private Integer id;

    private Integer userId;

    private String name;

    private String pid;

    private String abstractteacher;

    private Integer priceT;

    private Integer priceS;

    private Integer priceO;

    private Integer level;

    private Integer experienceAge;

    private Integer priceMin;

    private Integer priceMax;

    private Integer priceMid;

    private Integer isPass;

    private String pidUrlFront;

    private String pidUrlBack;

    private String detailaddress;

    private String peoplePidUrl;

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getAbstractteacher() {
        return abstractteacher;
    }

    public void setAbstractteacher(String abstractteacher) {
        this.abstractteacher = abstractteacher == null ? null : abstractteacher.trim();
    }

    public Integer getPriceT() {
        return priceT;
    }

    public void setPriceT(Integer priceT) {
        this.priceT = priceT;
    }

    public Integer getPriceS() {
        return priceS;
    }

    public void setPriceS(Integer priceS) {
        this.priceS = priceS;
    }

    public Integer getPriceO() {
        return priceO;
    }

    public void setPriceO(Integer priceO) {
        this.priceO = priceO;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExperienceAge() {
        return experienceAge;
    }

    public void setExperienceAge(Integer experienceAge) {
        this.experienceAge = experienceAge;
    }

    public Integer getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Integer priceMin) {
        this.priceMin = priceMin;
    }

    public Integer getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(Integer priceMax) {
        this.priceMax = priceMax;
    }

    public Integer getPriceMid() {
        return priceMid;
    }

    public void setPriceMid(Integer priceMid) {
        this.priceMid = priceMid;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public String getPidUrlFront() {
        return pidUrlFront;
    }

    public void setPidUrlFront(String pidUrlFront) {
        this.pidUrlFront = pidUrlFront == null ? null : pidUrlFront.trim();
    }

    public String getPidUrlBack() {
        return pidUrlBack;
    }

    public void setPidUrlBack(String pidUrlBack) {
        this.pidUrlBack = pidUrlBack == null ? null : pidUrlBack.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getPeoplePidUrl() {
        return peoplePidUrl;
    }

    public void setPeoplePidUrl(String peoplePidUrl) {
        this.peoplePidUrl = peoplePidUrl == null ? null : peoplePidUrl.trim();
    }
}