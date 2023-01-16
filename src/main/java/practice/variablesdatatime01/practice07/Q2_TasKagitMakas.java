package practice.variablesdatatime01.practice07;

import java.util.List;
import java.util.Scanner;

public class Q2_TasKagitMakas {
/*

Taş-Kağıt-Makas oyunu yazınız.
        -Oyuncudan tahmin alınız.
        -Bilgisayarın tahmini ile karşılaştırınız.
        -3'e ilk ulaşan kazanır
        -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
 */

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);



        int oyunuPuani=0;
        int pcPuani=0;
        int sayac=0;


        while (oyunuPuani<3 && pcPuani<3){
            sayac++;

            System.out.println("Tas-Kagit-Makas  tan birini giriniz");
            String oyuncuTahmin=input.next().toLowerCase().trim();
            if (!(oyuncuTahmin.equals("tas") || oyuncuTahmin.equals("kagit") || oyuncuTahmin.equals("makas"))) {
                System.out.println("Geçerli bir tahmin giriniz");
                sayac--;
                continue;
            }

            String[] arr={"tas","kagit","makas"};
            int rastgeleIdx=(int)(Math.random()*3);
            String bilgisayarSecimi=arr[rastgeleIdx];
            System.out.println("bilgisayar tahmini= "+ bilgisayarSecimi);

            if (oyuncuTahmin.equals(bilgisayarSecimi)){
                System.out.println("Berabere! Skor: "+oyunuPuani+ "="+ pcPuani);
            }else if (oyuncuTahmin.equals("tas")&& bilgisayarSecimi.equals("makas")
                    ||oyuncuTahmin.equals("kagit")&&bilgisayarSecimi.equals("tas")
                    ||oyuncuTahmin.equals("makas")&&bilgisayarSecimi.equals("kagit")){
                oyunuPuani++;
                System.out.println("Kazandiniz! Skor: "+oyunuPuani+ "="+ pcPuani);
            }else{
                pcPuani++;
                System.out.println("Pc Kazandi! Skor: "+oyunuPuani+ "="+ pcPuani);
            }


        }

        System.out.println("*** Oyun Bitti ***");
        String skor;

        if (oyunuPuani == 3) {
            if (pcPuani == 0) {
                skor = "Altın";
            } else if (pcPuani== 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println(skor + " skor ile kazandınız! TEBRİKLER!!!");
        } else {
            if (oyunuPuani == 0) {
                skor = "Altın";
            } else if (oyunuPuani == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println("Bilgisayar " + skor + " skorla kazandı!!!");
        }
    }



}
