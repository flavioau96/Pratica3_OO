package questao3;

public class Caminhao extends Veiculos{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public void exibirDados(){
        System.out.println("Dados do Caminhão : Placa " + getPlaca() +
                " Ano" + getAno() + " Numero de Eixos" + getEixos());
    }
}
