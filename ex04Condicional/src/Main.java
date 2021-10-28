import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaTermino = sc.nextInt();
        int duracao;

        if(horaInicio<horaTermino) {
        duracao = horaTermino-horaInicio;
        }
        else {
            duracao = 24 - horaInicio - horaTermino;
        }
        System.out.println("O JOGO DUROU"+duracao+"HORA(S)");

        sc.close();
    }
    }

