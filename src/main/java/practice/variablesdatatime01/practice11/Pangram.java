package practice.variablesdatatime01.practice11;

import practice.variablesdatatime01.practice11.abstraction_alan_hesaplama.Alan;

public class Pangram {

    /*
    Bir cümlenin pangram olup olamadığını kontrol eden bir kod yazınız.
    Not: Pangram, bir dilin alfabesi içerisindeki tüm harfleri içeren anlamlı cümledir.
    TR: Pijamalı hasta yağız şoföre çabucak güvendi.
    ENG: The quick brown fox jumps over the lazy dog.
    */
    public static void main(String[] args) {
        System.out.println(isPangram( "Pijamalı hasta yağız şoföre çabucak güvendi"));
        System.out.println(isPangram( "The quick brown fox jumps over the lazy dog"));
    }

    public static boolean isPangram(String str){
        str=str.replaceAll(" ","").toLowerCase();
        String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";
        boolean sonuc=true;

        for (int i=0;i< trAlfabe.length();i++){
            if (!str.contains(String.valueOf(trAlfabe.charAt(i)))){
                sonuc= false;
                break;
            }

        }
        return  sonuc;
    }

    public static boolean isPangram2(String str){
        str=str.replaceAll(" ","").toLowerCase();
        String trAlfabe = "abcdefghijklmnoprstuvyz";
        boolean sonuc=true;

        for (int i=0;i< trAlfabe.length();i++){
            if (!str.contains(String.valueOf(trAlfabe.charAt(i)))){
                sonuc= false;
                break;
            }

        }
        return  sonuc;
    }
}
