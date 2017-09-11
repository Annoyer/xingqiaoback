package model;

public class OrdersWithBLOBs extends Orders {
    private String initialevaluated;

    private String effectevaluated;

    private String remark;

    private String serverTime;

    public String getInitialevaluated() {
        return initialevaluated;
    }

    public void setInitialevaluated(String initialevaluated) {
        this.initialevaluated = initialevaluated == null ? null : initialevaluated.trim();
    }

    public String getEffectevaluated() {
        return effectevaluated;
    }

    public void setEffectevaluated(String effectevaluated) {
        this.effectevaluated = effectevaluated == null ? null : effectevaluated.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getServerTime() {
        return serverTime;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime == null ? null : serverTime.trim();
    }
}