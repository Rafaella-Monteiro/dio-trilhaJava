import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        Double forca;
        int contagem = sc.nextInt();

        for(int i = 0; i != contagem; i++){
            nome = sc.next();
            forca = sc.nextDouble();

            if (nome.equals("Thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}
