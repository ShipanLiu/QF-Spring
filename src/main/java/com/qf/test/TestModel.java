package com.qf.test;


import java.util.*;

// usage: for testing the injection method "set" of different types(set, map...)
public class TestModel {


//     给 这里的 所有 属性 赋值，用到了 Spring 里 的 DI
    private int id;
    private double money;
    private Integer age;
    private String name;
    private Date birthday;
    private String[] skill;
    private List<String> className;  // sequential & repeatable
    private Set<String> phones;
    private Map<String, String> np;  //籍贯

    public TestModel() {
    }

    public TestModel(int id, double money, Integer age, String name, Date birthday, String[] skill, List<String> className, Set<String> phones, Map<String, String> np) {
        this.id = id;
        this.money = money;
        this.age = age;
        this.name = name;
        this.birthday = birthday;
        this.skill = skill;
        this.className = className;
        this.phones = phones;
        this.np = np;
    }

    public int getId() {
        return id;
    }

    public double getMoney() {
        return money;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String[] getSkill() {
        return skill;
    }

    public List<String> getClassName() {
        return className;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public Map<String, String> getNp() {
        return np;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    public void setClassName(List<String> className) {
        this.className = className;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public void setNp(Map<String, String> np) {
        this.np = np;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "id=" + id +
                ", money=" + money +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", skill=" + Arrays.toString(skill) +
                ", className=" + className +
                ", phones=" + phones +
                ", np=" + np +
                '}';
    }
}
