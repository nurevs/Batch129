package practice.variablesdatatime01.practice13;

import java.util.*;

public class Q01_Map_AyniUcret {
    //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.
    public static void main(String[] args) {

    Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        //1.yol

        for (Map.Entry<String,Double>w:urunler.entrySet()) {
            if (w.getValue().equals(29.99)) {}
            System.out.println(w);
        }


        //2.yol
        Collection<Double> fiyatlar=urunler.values();
        System.out.println("fiyatlar= "+fiyatlar);//fiyatlar= [19.99, 24.99, 19.99, 89.99, 29.99, 29.99, 29.99]

        Set<String> urunAdlar=urunler.keySet();
        System.out.println("urunAdlar= "+urunAdlar);//urunAdlar= [Kemer, Kazak, Kravat, Ayakkabi, Terlik, Pijama, Gomlek]

        //Listede arama
        for (int i=0;i<fiyatlar.size();i++) {
            if (fiyatlar.toArray()[i].equals(29.99)) {
                System.out.println(urunAdlar.toArray()[i]);

            }
        }




    }



}
