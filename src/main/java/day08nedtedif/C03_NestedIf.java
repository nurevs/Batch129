package day08nedtedif;

import java.util.Scanner;

public class C03_NestedIf {
    /*
    Kullanicidan 0dan kucuk 120den cuyuk deger giremeyecek sekilde datalri aldiktan sonra
    Eger calisan kadinsa 60 yasindan buyukse Emekli Olabilir yazdirin
    Eger calisan erkekse 65 yasindan buyukse emeklo olanilir yazdirin
     */

    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi girin \nKadin icin:K \n Erkek icin E harfi giriniz");
        char sex = input.next().charAt(0);
        System.out.println("Yasinizi giriniz ");
        byte age = input.nextByte();


        if (sex == 'K') {
            if (age < 0 || age > 120) {
                System.out.println("Gecerli yas giriniz");
            } else if (age > 60) {
                System.out.println("Emekli olabilir");
            }else {System.out.println("Emekli olamaz");}

        }else if (sex == 'E') {
            if (age <0 || age > 120) {
                System.out.println("Gecerli yas giriniz");
            }else if (age > 65) {
                System.out.println("Emekli olabilir");
            }else {System.out.println("Emekli olamaz");}
        }else {System.out.println("Lutfen cinsiyet icin K yada E girin");}

    }*/


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nKadin icin K harfi \nErkek icin E harfi giriniz");
        char cinsiyet = input.next().toUpperCase().charAt(0);//Kullanicinin verdigi harfi buyuk harfe cevirdim

        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();

        if (cinsiyet == 'K') {//auter if
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen giridiginiz yas degerini kontrol ediniz");
            } else if (yas > 60) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli Olamazsin " + (60 - yas) + " yil daha  calisman gerekir");
            }

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen giridiginiz yas degerini kontrol ediniz");
            } else if (yas > 65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli Olamazsin " + (65 - yas) + " yil daha calisman gerekir");
            }

        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }


    }}
