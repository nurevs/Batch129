package day16multidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MD04 {
    public static void main(String[] args) {
        //Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.
        //[ [2,5],[3],[4,7,11]]==>[2.5.3.4.7.11]

        int a[][]={{2,5},{3},{4,7,11}};
        System.out.println(Arrays.deepToString(a));//[[2, 5], [3], [4, 7, 11]]

        //"a" arrayindeki toplam eleman sayisini bulunuz

        int totalElement=0;
        for (int[] w: a){
           totalElement+=w.length;
        }

        //"b"isimli tek dimensional'li bir array olusturunuz
        int b[]=new int[totalElement];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0, 0]

        //"a" arrayindeki elemanlari "b" arrayine transfer ediniz
        int idx=0;
        for (int[] w : a) {
            for (int k:w){
                b[idx]=k; //a daki arrayleri yeni array olusturup ona atiyoruz
                idx ++;
            }

        }
    }
}
