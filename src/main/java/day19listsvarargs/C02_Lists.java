package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Lists {
    public static void main(String[] args) {

        List<String>databaseIsim=new ArrayList<>();

        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDE");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");

        System.out.println("databaseIsim="+databaseIsim);

        Scanner input=new Scanner(System.in);

        //1.adim: databaseIsim=[AYSE, AHMET, SERDE, OKAN, BETUL]

        System.out.println("Lutfen bir kullanici adi giriniz");


        //2.adimda: kullanicidan aldigim datayi database'e uygun ve taskin istedigi gibi bosluksuz hale getirdim
        String username=input.nextLine().toUpperCase().trim();

        //3.adimda kullanici adinin kullanilabilir olup olmadigini database bile kiyaslayarak kiyaslicaz

        if(databaseIsim.contains(username)){
            System.out.println("Bu kullanici adi zaten alinmis ");
        }else{
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }

        if (databaseIsim.contains(username)){
            int rastgaleSayi=new Random().nextInt(10);

            username=username + "" + rastgaleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz =" +username);
        }else System.out.println("Yeni kullanici adi: "+ username);






    }
}
