package questao3;

public class Onibus extends Veiculos {
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    private int assentos;

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirDados(){
        System.out.println("Dados do Onibus : Placa " + getPlaca() +
                "Ano" + getAno() + "Numero de Assentos" + getAssentos());
    }
}
