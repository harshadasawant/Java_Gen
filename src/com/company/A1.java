package com.company;

import java.util.Objects;

public class A1 {
    int id;

    public A1(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A1)) return false;
        A1 a1 = (A1) o;
        return id == a1.id;
    }

    public static void main(String[] args) {
        A1 obj = new A1(4);
        A1 obj1 = new A1(4);
        System.out.println(obj == obj1);
        System.out.println(obj.equals(obj1));

        String s="Hello";
        String s1 = "Hello";
        System.out.println(s.equals(s1));
    }
}

