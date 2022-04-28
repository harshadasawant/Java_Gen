package com.company;

public class ArrayExample {

    static void multidim(){
        int a[][] = { {3,2,7},// --->a[0]
                {4,5}, // ---a[1]
                {6,7,2,1} //----a[2]
        };
        System.out.println("a.length = " + a.length);
        for(int i=0;i< a.length;i++){
            System.out.println("a[i].length = " + a[i].length);  //a[i] =a[0] ==3
            for(int j=0;j<a[i].length; j++){
                System.out.print(a[i][j] + " ");   //a[0][1]
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=34;
        a[1]=54;
        a[2]=21;
        a[3]=12;
        a[4]=76;
        for(int i:a){
            System.out.println(i);
        }


        multidim();
    }
}
