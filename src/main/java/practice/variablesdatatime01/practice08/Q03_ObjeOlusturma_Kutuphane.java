package practice.variablesdatatime01.practice08;

public class Q03_ObjeOlusturma_Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı,
    // sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Kutuphane obj1= new Kutuphane("Magaradakiler","cemil meric",285);
        obj1.kitapBilgiler();
        Kutuphane obj2=new Kutuphane("Kirlangic Cigligi","Ahmet Umit",400);
        obj2.kitapBilgiler();


    }
}
