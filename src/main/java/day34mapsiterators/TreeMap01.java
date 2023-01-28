package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {

        /*

        1)TreeMap entry'leri "key"lere gore "natural order"a koyar
        2)TreeMap cook yavastir cunku "natural order" yapmak cook zaman ister.
        3)TreeMap "thread-safe" ve "synchronized" degildir.
        4)TreeMap'lerin "key"lerinde "null" kullanilamaz cunku alfabetik siralama yapiyor.
        Ama "value"lerde istediginiz kadar kullanabilirsiniz.
          */


        long one=System.nanoTime();
        TreeMap<String,Integer> stdAges1=new TreeMap<>();

        stdAges1.put("Ali",21);
        stdAges1.put("Murat",22);
        stdAges1.put("Ayse",25);
        stdAges1.put("Kemal",19);
        //"key"lere gore alfabetik sira yapti.
        System.out.println(stdAges1);//{Ali=21, Ayse=25, Kemal=19, Murat=22}


        long two=System.nanoTime();
        HashMap<String,Integer> stdAges2=new HashMap<>();

        stdAges2.put("Ali",21);
        stdAges2.put("Murat",22);
        stdAges2.put("Ayse",25);
        stdAges2.put("Kemal",19);
        //"key"lere gore alfabetik sira yapti.
        System.out.println(stdAges2);//{
        long three=System.nanoTime();

        HashMap<String,Integer> stdAges3=new HashMap<>();

        stdAges2.put("Ali",21);
        stdAges2.put("Murat",22);
        stdAges2.put("Ayse",25);
        stdAges2.put("Kemal",19);

        System.out.println(stdAges3);

        TreeMap<String ,Integer> stdAges4=new TreeMap<>(stdAges3);
        System.out.println(stdAges4);

        long four=System.nanoTime();

        System.out.println("TreeMap: "+(two-one)+" HashMap: "+(three-two)+" TreeHash: "+(four-three));//TreeMap: 766083 HashMap: 67375

    }
}
