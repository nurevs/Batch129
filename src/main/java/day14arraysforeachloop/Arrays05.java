package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //NOTE1: sort() methodu sayisal data typelerini kucukten buyuge siralar(ascending order)
        //NOTE2: sort() methodu String data typelerini alfabetik olarak siralar(alphabetical order)
        //NOTE3: ascending order+alphabetical order==> Natural Order
        //NOTE4:sort() methodu Array elemanlarini "Natural Order"a gore siralar

        //binarySearch() methodu bir elemanin bir arrayde olup olmadigini kontrol etmek icin kullanilir
        //NOTE5:binarySearch() methodunu kullanmadan once sort() methodunu kullanmak zorundayiz.
        //sort() methodunu kullanmazsaniz buldugunuz sonuc guvenilir olmaz

        String colors[]=new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";


        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[Blue, Brown, Green, Orange, Red, Yellow]

        int num=Arrays.binarySearch(colors, "Blue");
        System.out.println(num);//0

        int num2=Arrays.binarySearch(colors, "Orange");
        System.out.println(num2);//3 ==>Var hemde indexi 3

        int num3=Arrays.binarySearch(colors, "Tarik");
        System.out.println(num3);//-6 ==> "-" bu eleman yok demek
                                //        "6" olsaydi 6.eleman olurdu



    }
}
