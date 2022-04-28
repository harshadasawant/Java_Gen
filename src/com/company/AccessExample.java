package com.company;

public class AccessExample {
     protected void show(){
        System.out.println("from show");
    }

    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.show();
    }
}

class Acc {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.show();
    }
}
