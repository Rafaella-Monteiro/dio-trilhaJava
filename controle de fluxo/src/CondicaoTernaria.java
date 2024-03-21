public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <=5 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
