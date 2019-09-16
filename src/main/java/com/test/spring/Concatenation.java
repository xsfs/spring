package com.test.spring;

public class Concatenation {
    @Override
    //这里的super改成this  会出现死循环
    public String toString(){
        return "Concatenation"+super.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Concatenation().toString());
    }
}
