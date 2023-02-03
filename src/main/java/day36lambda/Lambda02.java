package day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        Universite u1=new Universite("hacettepe","fizik",1200,88);
        Universite u2=new Universite("bogazici","qa",1000,90);
        Universite u3=new Universite("odtu","dev",900,95);
        Universite u4=new Universite("marmara","matematik",3000,60);
        Universite u5=new Universite("ege","elektrik-elektronik",2000,83);


        List<Universite> unv=new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5));

        System.out.println(notOrt75tenByk(unv));//false
        System.out.println();
        System.out.println(isMatematik(unv));//true


    }
    //Task 01:Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu gosteren bir prog create ediniz.
    public static boolean notOrt75tenByk(List<Universite> unv) {

        return unv.stream().allMatch(t-> t.getNotOrtalamasi()>=75);




    }
    //Task 02:uni'lerden herhangi birinde matematik bolumu var mi kontrol et.
    public static boolean isMatematik(List<Universite> unv) {
        return unv.stream().anyMatch(t->t.getBolum().equalsIgnoreCase("matematik"));

    }
    //task03:Universiteleri ogrenci sayilarina gore buyukten kucuge dogru siralayiniz








}
