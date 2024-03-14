package baitap.ra.business.entity;

import baitap.ra.business.config.InputMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Student {
    public static int nextId = 0;
    public  int studentId;
    private String studentName;
    private Date dob;
    private String phone;
    private String address;
    private boolean sex;
    public Student() {
        // Id tự tăng
        this.studentId = ++nextId;
    }
    public Student(String studentName, Date dob, String phone, String address, boolean sex) {
        this.studentName = studentName;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.sex = sex;
    }
    public  int getStudentId() {
        return studentId;
    }
    public  void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Date getBod() {
        return dob;
    }
    public void setBod(Date bod) {
        this.dob = bod;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void  inputData(){
        System.out.println("Nhạp tên sinh viên: ");
        this.studentName = InputMethods.getString();
        System.out.println("Nhập ngày sinh sinh viên: ");
        this.dob = InputMethods.getDate();
        System.out.println("Nhập địa chỉ: ");
        this.address = InputMethods.getString();
        System.out.println("Nhập sđt: ");
        this.phone = InputMethods.getString();
        System.out.println("Nhập giới tính sinh viên: ");
        this.sex = InputMethods.getBoolean();
    }

    @Override
    public String toString() {
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        return "Student {" +
                "studentId= " + studentId +
                ", studentName= '" + studentName + '\'' +
                ", bod=" + sf.format(dob)+
                ", phone= '" + phone + '\'' +
                ", address= '" + address + '\'' +
                ", sex= " + (sex? "Nam" : "Nữ") +
                '}';
    }
}