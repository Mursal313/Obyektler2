/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mrust
 */
public class User {

    private static String name;
    // Private eledikde deyiskeni diger classlardan caqira bilmirik
    // Public private access modifier
    private String surname;
    private int age;

    private Student student;
    // Obyekt icinde obyekt anlaysi

    public void setName(String nm) {
        this.name = nm;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void foo2() {

    }
}
