import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f%n", nome, nota);

        /* String nome = "Alison";
        float nota =  8.5f;
        System.out.printf("A nota de %s é %.2f%n", nome, nota);
        System.out.format("A nota de %s é %.2f", nome, nota); */

        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.print(valor);*/

        /*String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.print(valor);*/

        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.print(valor);
    }
}