package cartella2;
import java.util.*;

public class Es2 {



    public static void stampaNumero(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci il numero ");
        int n= scanner.nextInt();


        switch (n){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("numero sbagliato");
                break;

        }
        scanner.close();
    }
}
