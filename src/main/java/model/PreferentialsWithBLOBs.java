package model;

public class PreferentialsWithBLOBs extends Preferentials {
    private String moreA;

    private String moreB;

    private String moreC;

    public String getMoreA() {
        return moreA;
    }

    public void setMoreA(String moreA) {
        this.moreA = moreA == null ? null : moreA.trim();
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