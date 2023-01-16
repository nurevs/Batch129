package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);//[Miami, Istanbul, Kayseri, Almaty]

        //remove() methodu index ilke kullanilirsa o indexteki elemani siler
        //remove() methodu index ilke kullanilirsa size sildigi elemani verir
        cities.remove(1);
        System.out.println(cities);//[Miami, Kayseri, Almaty]

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        //remove() methodu eleman ilke kullanilirsa size o elemani silip silmedigini ifade eden true/false verir/
        //Eger eleman Listte var ise elemani siler ve size true der
        //Eger eleman Listte yok ise elemani silemediginden ve size false der
        boolean p=cities.remove("Kayseri");
        System.out.println(p);//true
        System.out.println(cities);//[Miami, Almaty]
    }
}
