package cartella1;

public class Es1 {


    public static boolean stringaPAriDispari(String str) {
        return str.length() % 2 == 0 ? true : false;
    }


    public static boolean anooBisestile(int x){
        if( x %4 == 0){ return true;}
        else if( x %100==0 && x%400==0){return true; }
        else{return false;}
    }
}
