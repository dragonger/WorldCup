import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("back to program");
        System.out.println("escolha o pais e te diremos em quais anos seu pais ganhou a copa do mundo");

        Scanner CBF = new Scanner(System.in);
        Scanner Ano = new Scanner(System.in);

        String Selecao = CBF.nextLine();
        if (Selecao.contains("Alemanha")) {
            System.out.println("1954, 1974, 1990 e 2014");

        } else if (Selecao.contains(("Brasil"))) {
            System.out.println("1958, 1962, 1970, 1994 e 2002");

        } else if (Selecao.contains("Italia")) {
            System.out.println("1934, 1938, 1982 e 2006");

        } else if (Selecao.contains("Argentina")) {
            System.out.println("1978 e 1986");

        } else if (Selecao.contains("França")) {
            System.out.println("1998 e 2018");

        } else if (Selecao.contains("Uruguai")) {
            System.out.println("1930 e 1950");

        } else if (Selecao.contains("Espanha")) {
            System.out.println("2010");

        } else if (Selecao.contains("Inglaterra")) {
            System.out.println("1966");

        } else {
            System.out.println("\nnunca ganhou copa");
            
        }
    }
}