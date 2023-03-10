package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Exp1: String bir array olusturunuz, 6 tane eleman yerlestiriniz,character sayisi 5'ten cok olan elemanlari siliniz

    String colors[]=new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]
        //Logic:Yeni bir array olusturup character sayisi 5 ve 5'ten kucuk olan elemanlari
        //yeni arraye transfer edecegiz.Boylelikle yeni arrayimizde
        //character sayisi 5'ten buyuk olan hicbir eleman olmayacak.

        //Soru:Hocam, array olusturmka icin iki sey belirlenmelidir
        // 1)Elemanlarin data type'i
        // 2)Yeni arrayde kac tane eleman olacak

        //Verilen array'de eleman sayisi 5 ve 5'ten kuvuk olan kac eleman var bulmaliyiz

        int counter=0;
        for (String w:colors) {
            if (w.length()<=5){
                counter ++;
            }
        }
        System.out.println(counter);//4

        String newColors[]=new String[counter];
        int idx=0;

        for (String w:colors) {

            if (w.length()<=5){
                newColors[idx]=w;
                idx++;
            }
        }

        System.out.println(Arrays.toString(newColors)); //[Red, Blue, Green, Brown]

        //arrayler collectionlara gore ilkel yapidadir, collectionlarda biz istedigimiz elemani silebiliyoruz
//fakat arraylerde elemanlari silmemiz icin yeni array olusturmamiz gerekiyor
    }
}
