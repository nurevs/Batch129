package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {
    public static void main(String[] args) {

  /*
       Example 2: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
*/
//
//        for (int i = 1; i < 6; i++) {//satir kontrolu
//            for (int j = 1; j <= i; j++) { //rakam kontrolu
//                System.out.print(" * " + " * " + " * ");
//            }
//            System.out.println();
//        }

            /*

    Example 2: Asagidaki sekil cizen kodu yaziniz
                * * * *
                * * *
                * *
                *


// */
//            for (int i = 1; i <= 4; i++) {
//                for (int j = 4; j >=i; j--) {
//                    System.out.print("* ");
//                }System.out.println();
//            }





        /*

        SAtir sayisini kullanicidan alarak asagidaki sekli yaz

         *
        * *
       *   *
      *     *
     * * * * *


*/

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();


        for (int i = 1; i <= satir; i++) {
            for (int j = satir; j >= i; j--) {//boslugu yaptik
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++){

                if (k==1 || k==i){
                    System.out.print("* ");//en distaki yildizlar

                }else if (i==satir){
                    System.out.print("* ");//en alt *
                }else System.out.print("  ");//3 ve 4.satir boluklari
            }
            System.out.println();
        }






    }



}


