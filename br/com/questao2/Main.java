package br.com.questao2;

public class Main {
    public static void main(String[] args) {
        FPadrao fp = new FPadrao(1,"Flávio", 1000);
        System.out.println(fp.toString());

        FComissionado fc = new FComissionado(2,"Gordim", 1500, 2, 10000);
        System.out.println(fc.toString());

        FProdutividade fpr = new FProdutividade(3,"Augustinho Carrara", 1000, 5, 10);
        System.out.println(fpr.toString());

    }
}
