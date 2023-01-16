package practice.variablesdatatime01.practice08;

public class Kutuphane {

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int kitapSayisi;

    public Kutuphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNo=kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapSayisi+"";

    }


    public void kitapBilgiler(){

        System.out.println("Kitap Adi: "+kitapAdi
        +"\nYazar adi: "+yazarAdi+
                "\nSayfa Sayisi: "+sayfaSayisi+
        "\nSeri No: "+seriNo);
        System.out.println("*************");
    }



}
