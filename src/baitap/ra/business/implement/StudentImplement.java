package baitap.ra.business.implement;

import baitap.ra.business.design.CRUD;
import baitap.ra.business.entity.Student;

import java.util.Scanner;
public class StudentImplement implements CRUD {
    Scanner scanner = new Scanner(System.in);
    private static Student[] students = new Student[100];
    private int size = 0;
    @Override
    public void create() {
        if (size == 100) {
            System.err.println("Mảng đầy");
        } else {
            // Logic thêm mới
            // Tạo 1 đối tượng student
            Student newStudent = new Student();
            newStudent.inputData();
            // Thêm vào mảng
            students[size] = newStudent;
            size++; // Tăng số lương
        }
    }
    @Override
    public void display() {
        if (size == 0) {
            System.err.println("Mảng không có phần tử");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(students[i]);
            }
        }
    }
    @Override
    public void edit() {
        if (size == 0) {
            System.err.println("Mảng không có phần tử");
        } else {
            System.out.print("Nhập ID sinh viên muốn sửa: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (students[i].getStudentId() == id) {
                    System.out.println("Nhập thông tin mới cho sinh viên:");
                    students[i].inputData();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.err.println("Không tìm thấy sinh viên với ID đã nhập.");
            }
        }
    }
    @Override
    public void delete() {
        if (size == 0) {
            System.err.println("Mảng không có phần tử");
        } else {
            System.out.print("Nhập ID sinh viên muốn xóa: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (students[i].getStudentId() == id) {
                    for (int j = i; j < size - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    size--;
                    found = true;
                    System.out.println("Đã xóa sinh viên có ID " + id);
                    break;
                }
            }
            if (!found) {
                System.err.println("Không tìm thấy sinh viên với ID đã nhập.");
            }
        }
    }
}