import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero<0){
            System.out.println("IMPAR");
        }
        else{
            System.out.println("PAR");
        }


        sc.close();
    }
}
