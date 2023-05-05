/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv.model;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Sinhvien implements Serializable{

    private String id, name, gioitinh;
    private double markAvg;

    public Sinhvien() {
    }

    public Sinhvien(String id, String name, String gioitinh, double markAvg) {
        this.id = id;
        this.name = name;
        this.gioitinh = gioitinh;
        this.markAvg = markAvg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "id=" + id + ", name=" + name + ", gioitinh=" + gioitinh + ", markAvg=" + markAvg + '}';
    }

    public String getStatus(double markAvg) {
        if (markAvg >= 5) {
            return "Đạt";
        } else {
            return "Trượt";
        }
    }
}
