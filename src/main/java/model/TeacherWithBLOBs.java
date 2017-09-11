package model;

public class TeacherWithBLOBs extends Teacher {
    private String address;

    private String unit;

    private String availableTime;

    private String sGround;

    private String tGround;

    private String domain;

    private String question;

    private String object;

    private String project;

    private String way;

    private String school;

    private String award;

    private String certificate;

    private String recoveryHis;

    private String successCase;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime == null ? null : availableTime.trim();
    }

    public String getsGround() {
        return sGround;
    }

    public void setsGround(String sGround) {
        this.sGround = sGround == null ? null : sGround.trim();
    }

    public String gettGround() {
        return tGround;
    }

    public void settGround(String tGround) {
        this.tGround = tGround == null ? null : tGround.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award == null ? null : award.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getRecoveryHis() {
        return recoveryHis;
    }

    public void setRecoveryHis(String recoveryHis) {
        this.recoveryHis = recoveryHis == null ? null : recoveryHis.trim();
    }

    public String getSuccessCase() {
        return successCase;
    }

    public void setSuccessCase(String successCase) {
        this.successCase = successCase == null ? null : successCase.trim();
    }
}