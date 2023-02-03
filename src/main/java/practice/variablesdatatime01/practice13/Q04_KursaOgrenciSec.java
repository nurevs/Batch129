package practice.variablesdatatime01.practice13;

import java.util.Scanner;

public class Q04_KursaOgrenciSec {
    /*
 Spor kursu için seçilecek öğrencileri belirleyen bir kod yazınız.
       kurs gereklilikleri:
            erkekler: boy: 1.60 ve üstü
                      kilo:70-90 kg
            kızlar: boy: 1.50 ve üstü
                    kilo:50-70 kg
       kullanıcıdan öğrenci sayısı ve herbir öğrenci
       için isim , cinsiyet, kilo ve boy bilgilerini girmesini
       isteyiniz.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ogrencu sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();
        String[] isimArr=new String[ogrenciSayisi];
        String[] cinsiyetArr=new String[ogrenciSayisi];
        double[] kiloArr=new double[ogrenciSayisi];
        double[] boyArr=new double[ ogrenciSayisi];

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println(i+1+". ismi giriniz: ");
            isimArr[i]=scanner.nextLine();
            System.out.println("Cinsiyet giriniz(E,K): ");
            String cinsiyet=scanner.next().toLowerCase().trim().substring(0,1);
            if (cinsiyet.equals("e")|| cinsiyet.equals("k")) {
                cinsiyetArr[i]=cinsiyet;
            }else {System.out.println("Hatali giris, yeniden giriniz:");
            i--;
            continue;
            }

            System.out.println("Kilo giriniz: ");
            kiloArr[i]=scanner.nextDouble();
            System.out.println("Boy giriniz: ");
            boyArr[i]=scanner.nextDouble();
        }

    }



}
