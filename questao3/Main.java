package questao3;

public class Main {
    public static void main(String[] args) {
        Veiculos v = new Veiculos("HQH5426",2022);
        v.exibirDados();
        Onibus o = new Onibus("VVM3104", 2020,30);
        o.exibirDados();
        Caminhao c = new Caminhao("OQJ8963", 2018, 3);
        c.exibirDados();

    }
}
