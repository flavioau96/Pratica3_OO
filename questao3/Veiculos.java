package questao3;

public class Veiculos {
    public String placa;
    public int ano;

    public Veiculos(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Dados do Veiculo : Placa " + getPlaca() +  "Ano" + getAno());
    }
}
