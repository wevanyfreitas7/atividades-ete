import java.util.Scanner;

public class avitivadetabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, res;

        System.out.print("Digite um número: ");
        num = sc.nextInt();
        System.out.println("Tabuada do " +num+":");
        
        for (int i = 1; i <= 10; i++){
            res = num*i;
            System.out.println(num+" x "+i+" = "+res);
        }
        
        sc.close();    
    }
    
}
