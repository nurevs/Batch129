package practice.variablesdatatime01.practice07;

public class Sirket {

    static int kasa;
    int depButcesi;



    public void kasadanButceyeParaAl(int alinacakPara) {
    depButcesi+=alinacakPara;
    kasa-=alinacakPara;

        System.out.println("Kasandan "+alinacakPara+" lira alindi");
    }
    public void paraKazan(int kazanilanPara){
        kasa+=kazanilanPara;
        System.out.println(kazanilanPara+" lira kazanildi");
    }
    public static void kasadanParaHarca(int harcanacakPara){
        kasa-=harcanacakPara;
        System.out.println("Kasandan "+harcanacakPara+" lira harcandi");
    }
    public void departmanHarcamasi(int harcanacakPara){
        depButcesi -= harcanacakPara;
        System.out.println("Departman bütçesinden "+harcanacakPara+" lira harcandı");
    }
}
