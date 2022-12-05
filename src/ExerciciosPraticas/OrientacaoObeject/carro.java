package ExerciciosPraticas.OrientacaoObeject;

public class carro {
    int capacidadeTanque;
    String vermelho;
    String modelo;


    
    public carro(int capacidadeTanque, String vermelho, String modelo) {
        this.capacidadeTanque = capacidadeTanque;
        this.vermelho = vermelho;
        this.modelo = modelo;
    }
    
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public String getVermelho() {
        return vermelho;
    }
    public void setVermelho(String vermelho) {
        this.vermelho = vermelho;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    } 

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
