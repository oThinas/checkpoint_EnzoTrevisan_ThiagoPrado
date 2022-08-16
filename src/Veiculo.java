import java.util.ArrayList;

public class Veiculo {
  private String anoDeFabricacao, modelo, montadora;
  private double valor;
  private ArrayList<Acessorio> acessorios = new ArrayList<Acessorio>();

  public Veiculo() {

  }

  public void setAnoDeFabricacao(String anoDeFabricacao) {
    this.anoDeFabricacao = anoDeFabricacao;
  }
  public String getAnoDeFabricacao() {
    return anoDeFabricacao;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public String getModelo() {
    return modelo;
  }

  public void setMontadora(String montadora) {
    this.montadora = montadora;
  }
  public String getMontadora() {
    return montadora;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
  public double getValor() {
    return valor;
  }

  public void setAcessorios(ArrayList<Acessorio> acessorios) {
    this.acessorios = acessorios;
  }
  public ArrayList<Acessorio> getAcessorios() {
    return acessorios;
  }
}
