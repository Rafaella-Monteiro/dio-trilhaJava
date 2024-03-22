public class FormatadorCep {
    
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("2087215");
            System.out.println(cepFormatado);    
        }
        catch (CepInvalidoException e){
            System.out.println("CEP inválido!");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {

        if(cep.length() != 8) {
            throw new CepInvalidoException();

            
        }
        return "26.087-215"; 
    }
}
