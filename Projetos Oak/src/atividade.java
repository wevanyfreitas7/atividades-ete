import java.util.Scanner;
public class atividade {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);


        int num1, soma;
        soma = 0;

        System.out.print("Digite o primeiro número: ");
        num1=sc.nextInt();

        while (num1 != 2) {
            soma = soma + num1;
            System.out.print( "Digite outro número: ");
            num1 = sc.nextInt();

        }
        System.out.print("Resultado da soma: " + soma);

        sc.close();
    }
}
