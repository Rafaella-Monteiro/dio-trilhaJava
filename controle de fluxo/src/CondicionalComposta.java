public class CondicionalComposta {

    public static void main (String [] args){

        double nota = 5.4;

        if (nota < 4.0){
            System.out.println("Reprovado!");
        } else if (nota > 4 && nota < 7.0) {
            System.out.println("Recuperação!");
        }else{
            System.out.println("Aprovado!");
        }
    }
    
}
