package kendipraktiklerim;

import java.util.Scanner;

public class C01_Asal {
    public static void main(String[] args) {
//
//        Scanner input=new Scanner(System.in);
//        System.out.println("Bir sayi giriniz");
//        int sayi=input.nextInt();
//
//        boolean drm=AsalMi(sayi);
//        if (drm){
//            System.out.println(sayi + "Asal sayidir");
//        }else System.out.println(sayi+ "Asal degildir");
//
//
//
//    }
//
//    public static boolean AsalMi(int s){
//        boolean durum=true;
//        for (int i=2;i<s;i++){
//            if (s%i==0){
//                durum=false;
//                break;
//            }
//        }return durum;


        System.out.println(" Pozitif sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        int sayac = 0;
        int i;

        if (sayi>0) {

            for (i = 1; i <= sayi; i++) {
                if (sayi % i == 0)
                    sayac++;
            }
            if (sayac == 2) {
                System.out.println("Asal");
            } else {
                System.out.println("Asal Değil");
            }
        }else System.out.println("Pozitif sayi giriniz");


    }//main


}


