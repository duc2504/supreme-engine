package org.example;

public class XeOTO {
    private int id;

    private String ten;

    private float gia;

    private String ghiChu;

    public XeOTO(int id, String ten, float gia, String ghiChu) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.ghiChu = ghiChu;
    }

    public XeOTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
