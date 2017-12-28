package com.example.archanmishra.spotter.async;

/**
 * Created by archan.mishra on 28/12/17.
 */

public class KoinexResponse {
    private String GNT;

    private String XRP;

    private String BCH;

    private String ETH;

    private String BTC;

    private String MIOTA;

    private String LTC;

    private String OMG;

    public String getGNT() {
        return GNT;
    }

    public void setGNT(String GNT) {
        this.GNT = GNT;
    }

    public String getXRP() {
        return XRP;
    }

    public void setXRP(String XRP) {
        this.XRP = XRP;
    }

    public String getBCH() {
        return BCH;
    }

    public void setBCH(String BCH) {
        this.BCH = BCH;
    }

    public String getETH() {
        return ETH;
    }

    public void setETH(String ETH) {
        this.ETH = ETH;
    }

    public String getBTC() {
        return BTC;
    }

    public void setBTC(String BTC) {
        this.BTC = BTC;
    }

    public String getMIOTA() {
        return MIOTA;
    }

    public void setMIOTA(String MIOTA) {
        this.MIOTA = MIOTA;
    }

    public String getLTC() {
        return LTC;
    }

    public void setLTC(String LTC) {
        this.LTC = LTC;
    }

    public String getOMG() {
        return OMG;
    }

    public void setOMG(String OMG) {
        this.OMG = OMG;
    }

    @Override
    public String toString() {
        return "ClassPojo [GNT = " + GNT + ", XRP = " + XRP + ", BCH = " + BCH + ", ETH = " + ETH + ", BTC = " + BTC + ", MIOTA = " + MIOTA + ", LTC = " + LTC + ", OMG = " + OMG + "]";
    }
}
