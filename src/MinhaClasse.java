public class MinhaClasse {
    public static void main(String[] args){
        String primeiroNome = "Thais";
        String segundoNome = "Nara";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Method: " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
