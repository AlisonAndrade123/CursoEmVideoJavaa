public class Aula8A1 {
    public static void main(String[] args) {

        String nome1 = "Alison";
        String nome2 = "Alison";
        String nome3 = new String("Alison");
        String res;
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
}