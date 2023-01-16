package day20passbyvaluemethodoverloading;

public class MethodOverLoading {
    //Ayni methoda farkli isler yaptirmak


    /*

    1)Method Overloading yaparken method isimleri degistirilmez
    2)Method Overloading yaparken parametreler degistirilir
        i)Parametre degistirirken parametrelerin data typeleri degistirilebilir
        ii)Parametre degistirirken ,parametrelerin data typeleri farkli ise yer degistirilebilir
        iii)Parametre degistirirken ,parametrelerin sayisi degistirilebilir.
    3)Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir.
    Bu yuzden ismi ve paremetlere "method signature" olarak adlandirilir
    4)Method Overloading yaparken  return type'i ddegirtirmenin hisbir etkisi yoktur
    5)Method Overloading yaparken  access modifier'i ddegirtirmenin hisbir etkisi yoktur
    6)Method Overloading yaparken  methodu static ya da non-static yapman  hisbir etkisi yoktur
    7)Method Overloading yaparken  method body'i ddegirtirmenin hisbir etkisi yoktur
    8)"private" methodlar overload edilebilir.Cunku method overloading sadece bir class'in icinde olur.
          "private" olmak ise baska class'lara gidildiginde problem olusturur.

    9)"static" method'lar overload edilebilirler.


     */

    public static void main(String[] args) {
     add(3,5);
     add(4.5,3.4);
    add(7,9.8);
    add(5,7,8);
    }

    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void add(double a, double b){
        System.out.println(a + b);
    }
    public static void add(double a, int b){
        System.out.println(a + b);
    }
    public static void add(int a, double b){
        System.out.println(a + b);
    }

    public static void add(int a, int b,int c){
        System.out.println(a + b+ c);
    }

}
