package practice.variablesdatatime01.practice13;

import java.util.*;

public class Aile {

   private Map<String ,String > adSoyad= new HashMap<>();
   private List<String> kardeslerList=new ArrayList<>();
   private Map<Integer,List<String>> yasKardesler=new HashMap<>();
   private Map<Map<String,String >,Map<Integer,List<String>>> aileMap=new HashMap<>();

   public Map<Map<String, String>, Map<Integer, List<String>>> getAileMap() {
      return aileMap;
   }

   public Aile(String ad, String soyad, int yas, String... kardesler) {

      adSoyad.put(ad, soyad);
      Collections.addAll(kardeslerList, kardesler);
      yasKardesler.put(yas, kardeslerList);
      aileMap.put(adSoyad, yasKardesler);

   }

   @Override
   public String toString() {
      return  aileMap.toString();
   }





}
