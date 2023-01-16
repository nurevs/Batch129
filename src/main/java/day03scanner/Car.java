package day03scanner;

public class Car {

    //Class ==> Varibles(Pasif Ozellikler) ==> Object
    //          Method(aktif Ozellikler)


    public String model="Corolla"; //pasif ozellikler variable
    public int fiyat= 200000;

    public static void main(String[] args) {

        // Class ismi + Oble ismi = new + Class ismi() (Contructor) yani asci diyebilir , isi yapacak kisi
        Car myCorolla= new Car();
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.dur();
        myCorolla.hareket();
    }//main

    public void hareket(){ // Aktif ozelleikler Methodlar
        System.out.println("Toyota hizli hareket eder...");

    }
    public void dur(){// Aktif ozelleikler Methodlar

        System.out.println("Toyota guvenle durur...");
    }


}//classbody
