package MinhaClassJava;

public class minhaClasse {
public static void main (String[] args){
    // System.out.print("Ola, Mundo");

    String primeiroNome = "Marcelo";
    // int anoFrabricacao = 2062;
    // boolean verdadeira = true;
    // anoFrabricacao = 2022;

    String segundoNome = "Soares";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.println(nomeCompleto);
}   
public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}

}
