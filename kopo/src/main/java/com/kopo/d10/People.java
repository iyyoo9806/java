package com.kopo.d10;

public class People {
    int idx;
    String name;
    String sex;

    People() {

    }

    People(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    People(int idx, String name, String sex) {
        this.idx = idx;
        this.name = name;
        this.sex = sex;
    }

    People(int idx) {
        this.idx = idx;
    }

    public int getIdx() {
        return this.idx;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }
}
