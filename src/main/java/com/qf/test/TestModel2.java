package com.qf.test;


// test DI(dependency injection) by using constructor
public class TestModel2 {
    private int age;
    private String name;

    public TestModel2(){}


    public TestModel2(int age){
        this.age = age;
    }

    public TestModel2(String name){
        this.name = name;
    }


    public TestModel2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestModel2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
