package day16multidimensionalarrays;

import java.util.Arrays;

public class MD01 {
    public static void main(String[] args) {

        //MultiDimensional Array nasil oluturulur?
        int a[][]=new int[3][2];
        //MultiDimensional Arrayler nasil yazdirilir
        System.out.println(Arrays.toString(a));//[[I@6a5fc7f7, [I@3b6eb2ec, [I@1e643faf]
        //Arrayslerde toString kullanilmis
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

        // //MultiDimensional Arraylere eleman nasil eklernir?
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=0;
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //NOTE:Array'lere non-primitive data konulamaz.
        //  Array'lere primitive data veya referance konulur
        //Ama siz bir Array;i yazdirmak istediginizde Java adresler yardimiyla non-primitive dataya ulasir
        // ve o non-primitive datayi sanki arrayin icindeymis gibi gosterir

        //MultiDimensional Array'lerdeki belli elemanlara nasil ulasilir?
        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println(a[1][0]);//81

        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(a[2][1]);//0

    }
}
