public class DoWhile {
    public static void main(String[] args) {
        
        //mesmo que a consideração seja inválida,
        //o bloco será executado ao menos uma vez,
        //já que ele executa antes de verificar

        double mesada = 5.0;
        double gasto = 7.50;

        do {
           mesada -= gasto; 
           System.out.println(mesada);
        } while (mesada >= gasto);
    }
}
