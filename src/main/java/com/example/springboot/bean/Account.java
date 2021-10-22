package com.example.springboot.bean;

public class Account {
    String no;
    String name;
    String password;
    String root;

    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getRoot() {
        return root;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "Account{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", root='" + root + '\'' +
                '}'+"\n";
    }
}
