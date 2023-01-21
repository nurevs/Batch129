package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class C03_Arrays_Interview {
    public static void main(String[] args) {

        //INTERVIEW SOIRUSU

        //[0, 2, 3, 0, 12, 0]
        int original[]={0,2,3,0,12,0};


        int yeni[]=new int [original.length]; //[0,0,0,0,0,0]
        int idx=0;


        for (int i=0;i<original.length;i++){

            if (original[i] !=0){
                    yeni[idx]=original[i];

                idx++;//bir sonraki indexe gecer
            }
        }

        System.out.println(Arrays.toString(yeni)); //[2, 3, 12, 0, 0, 0]



    }
}
