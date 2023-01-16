package day25accessmodifiersinherintance;

public class Vehicle {

    /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.
        2)Child Class'daki constructordan Parent Class'taki constructor'a gidebilmek icin "super()" kullanilir.
        3)Parent class'ta birden fazla consructor varsa istenilen constructor ,super() ifadesinin parantesi icine yazilan
        parametler yardimiyla secilebilir.
        4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
          Ayni class'ta birden fazla consructor varsa istenilen constructor ,this() ifadesinin parantesi icine yazilan
        parametler yardimiyla secilebilir.
        5)"super()" ifadesini yazak istege baglidir,yazmasanizda java sanki super() varmis gibi davranir,
        Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
         6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
         7)Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6.kural..
          8)Inheritance'da variablelari ve methodlari cagirmak icin "this"  veya "super" kullanilir.
          "this" ayni class icindeki variable'lari ve methodlari cagirmak icin kullanilir
          "super"nparent class icindeki variableleri methodlari cagirmak icin kullanilir
         9) Inheritance'da Object kullanarak variable cagirirsanizi, Object'in data tipini temsil eden class'dan variable'i
    aramaya baslayiniz. O class da yoksa parent'lara bakiniz
10) Inheritace'da Object kullanarak method cagirirsaniz Object'in constructor'ini temsil eden class'dan methodu aramaya baslayiniz
    o class'da yoksa parent'lara bakiniz.

    OOP Pricipals:
i)Inheritance +
ii)Polymorphism -
iii)Encapsulation -
iv)Abstraction -

                */

    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){

        System.out.println("Vehicle 2: "+price);
    }
}
