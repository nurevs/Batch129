package practice.variablesdatatime01;
import java.sql.SQLOutput;
import java.util.Scanner;
public class C02_Variables {

    /*TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
    salona devam edeceği ay süresi
    bilgilerini alıp * 20 DOLAR                                                   ık $20 olarak toplam ücretini yazdırınız.


            */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Adiniz= ");
        String name=input.next();

        System.out.println("Soydiniz=  ");
        String familyName=input.next();

        System.out.println("Yasiniz =");
        Integer age=input.nextInt();

        System.out.println("Kilonuz= ");
        Float weigh =input.nextFloat();

        System.out.println("Boyunuz =");
        Integer heigt=input.nextInt();

        System.out.println("Kac ay devam edeceksiniz= ");
        Integer month = input.nextInt();

        System.out.println("Adiniz= "+name);
        System.out.println("Soyadiniz= "+familyName);
        System.out.println("Yasiniz= "+ age);
        System.out.println("Kilonuz= "+weigh);
        System.out.println("Boyunuz= "+heigt);
        System.out.println("Toplam ucretiniz=" + month*20);


    }

}
