package com.example.bt5_listview2;


public class monAn {
    private String ten,mota;
    private int anh;

    public monAn() {
    }

    public monAn(String ten, String mota, int anh) {
        this.ten = ten;
        this.mota = mota;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
