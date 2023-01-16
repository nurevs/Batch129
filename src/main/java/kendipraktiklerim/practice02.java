package kendipraktiklerim;

import java.util.Arrays;
import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {

         /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
           */


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str=input.nextLine();

        int counter=0;
        String WSplit[]=str.split("");
        Arrays.sort(WSplit);




//        for (int i = 0; i < WSplit.length ; i++) {
//        System.out.println(Arrays.binarySearch(WSplit,i));
//
//            if (WSplit[i]==WSplit[i]){
//                counter++;
//            }
       }
//        System.out.println(WSplit+" "+counter);





//        for (String w : WSplit) {
//
//            if (w==w){
//
//                counter++;
//            }
//
//        }
//        System.out.println(Arrays.toString(WSplit));
   // }
}
