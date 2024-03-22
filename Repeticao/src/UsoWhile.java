import java.util.concurrent.ThreadLocalRandom;

public class UsoWhile {
    public static void main(String[] args) {
        
        double mesada = 50.00;

        while (mesada > valorAleatorio()){
            mesada -= valorAleatorio();
            System.out.println(mesada);
        } 
    }

    private static double  valorAleatorio (){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
