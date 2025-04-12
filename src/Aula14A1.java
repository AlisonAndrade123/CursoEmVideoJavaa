public class Aula14A1 {
    public static void main(String[] args) {
        String mes[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
        String tot[] = {"31", "28", "31", "30", "31", "30", "31", "30", "31", "30", "31", "30", "31"};
        for (int i = 0; i < mes.length; i++){
            System.out.println(mes[i] + " tem " + tot[i] + " dias.");

        }
    }
}
