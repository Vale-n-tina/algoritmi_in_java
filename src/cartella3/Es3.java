package cartella3;
import java.util.*;

public class Es3 {


    public static void stampaParola(){
    Scanner scanner1=new Scanner(System.in);


      while (true){
          System.out.println("inserisci una parola (o ':d' per terminare)");
          String parola = scanner1.nextLine();
          if(parola.equals(":d")){
              System.out.println("programma terminato");
             break;
          }
         for(int i=0; i<parola.length(); i++){
             System.out.print(parola.charAt(i)+ ",");

         }System.out.println();
      }

      scanner1.close();}
}
