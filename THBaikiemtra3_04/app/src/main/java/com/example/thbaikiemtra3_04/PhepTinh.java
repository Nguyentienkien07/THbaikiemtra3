package com.example.thbaikiemtra3_04;

public class PhepTinh {
    private String Pheptinh;
    private int Hinh;

    public String getPheptinh() {
        return Pheptinh;
    }

    public void setPheptinh(String pheptinh) {
        Pheptinh = pheptinh;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public PhepTinh(String pheptinh, int hinh) {
        Pheptinh = pheptinh;
        Hinh = hinh;
    }
}
