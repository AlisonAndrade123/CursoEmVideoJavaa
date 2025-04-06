import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nasc = teclado.nextInt();
        int i = 2025 - nasc;
        if (i < 16){
            System.out.println("Não vota");
        } else {
            if ((i >= 16 && i < 18) || (i > 70)){
                System.out.println("Opcional");
            } else {
                System.out.println("Obrigatório");
            }
        }
    }
}
