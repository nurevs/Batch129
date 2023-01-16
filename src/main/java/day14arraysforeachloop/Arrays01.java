package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        // icerdigi karakter sayilari toplamini ekrana yazdiriniz.

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr)); //[Math, Science, Music, English, Art]

        System.out.println(arr[0].length() + arr[arr.length - 1].length()); //butun arrayler icin calisir.1.arrayin uzunlugu ve son arrayin uzunlugu


        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdiriniz.

        String arr2[] = new String[5];

        arr2[0] = "Miami";
        arr2[1] = "Istanbul";
        arr2[2] = "Frankfurt";
        arr2[3] = "Dhaka";
        arr2[4] = "Athena";

        //1.yol for-loop
        int totalChar = 0;
        for (int i = 0; i < arr2.length; i++) {
            totalChar = totalChar + arr2[i].length();
        }
        System.out.println(totalChar);//33

        //2.yol for-each-loop(enhanced loop)==>baslangic degeri loopun calisma sarti ve inc/dec kismini kendisi halleder
        // for-each-loop "Array"lerde ve "Collection"larda kullanilir
        //Index kullanmaniz gerektiginde bazen for-each-loop caresiz kalir,mecburen diger looplari kullanirsiniz

        int sum=0;
        for (String w:arr2){
            sum+=w.length();
        }
        System.out.println(sum);














    }
}
