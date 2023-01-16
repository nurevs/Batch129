package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        int a = 12; //Bu yapinin icinde sadece bir tane data depolanabilir
        //Ama biz code yazarken bir yapinin icinde coklu data depolama hissederiz
        //Bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur.


        /*NOTE:Bir sey ogrenirken;
        NE?
        Neden?
        Simple impl
        Mid level imp
        Advanced level imp
        Project
         */


        //Array Nasil olusturulur?
        //Array olusturmka icin,Array elemanlarinin data type'i ve eleman sayisi mutlaka yazilmalidir.
        String stdNames[] = new String[5];//String[] demek icine kac data koycagimizi soylemek demek, biz 5 tane koycaz dedik
        //Array console'a nasil yazdirilir?

        // toString methodu adrese gelir,adresten arrayi bulur ve bunu konsola yazdirir
        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]

        //Arraye eleman ekleme nasil yapilir?

        stdNames[2] = "Ajda";

        System.out.println(Arrays.toString(stdNames));//[null, null, Ajda, null, null]
        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames));//[Cuneyt, Kemal, Ajda, Ezel, Besir]

        //Arrayden specific bir elemani almak
        System.out.println(stdNames[2]); //Ajda
        System.out.println();

        //Exp1: Arraydeki her elemani sonuna "!" koyarak ekrana yazdiriniz

        for (int i=0;i<stdNames.length;i++){

            System.out.println((stdNames[i]+"!"));
        }














    }
}
