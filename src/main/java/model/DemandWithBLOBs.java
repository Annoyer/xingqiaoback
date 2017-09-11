package model;

public class DemandWithBLOBs extends Demand {
    private String report;

    private String diseaseHis;

    private String allergyHis;

    private String recoveryHis;

    private String remark;

    private String moreB;

    private String moreC;

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report == null ? null : report.trim();
    }

    public String getDiseaseHis() {
        return diseaseHis;
    }

    public void setDiseaseHis(String diseaseHis) {
        this.diseaseHis = diseaseHis == null ? null : diseaseHis.trim();
    }

    public String getAllergyHis() {
        return allergyHis;
    }

    public void setAllergyHis(String allergyHis) {
        this.allergyHis = allergyHis == null ? null : allergyHis.trim();
    }

    public String getRecoveryHis() {
        return recoveryHis;
    }

    public void setRecoveryHis(String recoveryHis) {
        this.recoveryHis = recoveryHis == null ? null : recoveryHis.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMoreB() {
        return moreB;
    }

    public void setMoreB(String moreB) {
        this.moreB = moreB == null ? null : moreB.trim();
    }

    public String getMoreC() {
        return moreC;
    }

    public void setMoreC(String moreC) {
        this.moreC = moreC == null ? null : moreC.trim();
    }
}