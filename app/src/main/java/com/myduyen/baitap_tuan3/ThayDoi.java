package com.myduyen.baitap_tuan3;

public class ThayDoi {
    private String mau,tiKi,gia;
    private int image;

    public ThayDoi(String mau, String tiKi, String gia, int image) {
        this.mau = mau;
        this.tiKi = tiKi;
        this.gia = gia;
        this.image = image;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getTiKi() {
        return tiKi;
    }

    public void setTiKi(String tiKi) {
        this.tiKi = tiKi;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
