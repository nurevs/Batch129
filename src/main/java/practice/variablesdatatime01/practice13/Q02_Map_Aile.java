package practice.variablesdatatime01.practice13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SplittableRandom;

public class Q02_Map_Aile {
    //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız
    public static void main(String[] args) {

//        Map<String,String> adSoyad= new HashMap<>();
//        adSoyad.put("Ali", "Can");
//        adSoyad.put("Veli", "Han");
//        System.out.println("adSoyad: "+adSoyad);
//
//        Map<Map<String,String>,Integer> adSoyadYas= new HashMap<>();
//        adSoyadYas.put(adSoyad,12);
//        System.out.printf("adSoyadYas: "+ adSoyadYas);//adSoyadYas: {{Ali=Can}=12}


        Aile ali=new Aile("ali","veli",12,"Ahmet","Hayriye");

        System.out.println("ali aile"+ali.getAileMap());//ali aile{{ali=veli}={12=[Ahmet, Hayriye]}}

        Aile veli = new Aile("Veli","Han",15,"Mehmet","Hatice","Hasan","Hüseyin");
        System.out.println("veli.getAileMap() = " + veli.getAileMap());

        Aile ayse = new Aile("Ayşe","Kan",35,"Fatma");
        System.out.println("ayse = " + ayse);


    }
}
