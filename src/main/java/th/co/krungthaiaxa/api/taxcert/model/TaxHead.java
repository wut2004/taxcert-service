package th.co.krungthaiaxa.api.taxcert.model;

/**
 * Created by ptom_nmay on 7/31/2016 AD.
 */
public class TaxHead {
    private String wpno;
    private String wname;
    private String wadr1;
    private String wadr2;
    private String wadr3;
    private String wadr4;
    private String wceff;
    private String wissnam;
    private String lplan;

    TaxHead(){

    }

    public TaxHead(String wpno, String wname, String wadr1, String wadr2, String wadr3, String wadr4, String wceff, String wissnam, String lplan) {
        this.wpno = wpno;
        this.wname = wname;
        this.wadr1 = wadr1;
        this.wadr2 = wadr2;
        this.wadr3 = wadr3;
        this.wadr4 = wadr4;
        this.wceff = wceff;
        this.wissnam = wissnam;
        this.lplan = lplan;
    }

    public String getWpno() {
        return wpno;
    }

    public void setWpno(String wpno) {
        this.wpno = wpno;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWadr1() {
        return wadr1;
    }

    public void setWadr1(String wadr1) {
        this.wadr1 = wadr1;
    }

    public String getWadr2() {
        return wadr2;
    }

    public void setWadr2(String wadr2) {
        this.wadr2 = wadr2;
    }

    public String getWadr3() {
        return wadr3;
    }

    public void setWadr3(String wadr3) {
        this.wadr3 = wadr3;
    }

    public String getWadr4() {
        return wadr4;
    }

    public void setWadr4(String wadr4) {
        this.wadr4 = wadr4;
    }

    public String getWceff() {
        return wceff;
    }

    public void setWceff(String wceff) {
        this.wceff = wceff;
    }

    public String getWissnam() {
        return wissnam;
    }

    public void setWissnam(String wissnam) {
        this.wissnam = wissnam;
    }

    public String getLplan() {
        return lplan;
    }

    public void setLplan(String lplan) {
        this.lplan = lplan;
    }
}
