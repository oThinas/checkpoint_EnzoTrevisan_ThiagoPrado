import java.util.ArrayList;
import java.util.Scanner;

public class Test {
  // Retorna a soma dos valores dos veículos
  private static double valorTotalVeiculos(ArrayList<Veiculo> veiculos) {
    double valorTotal = 0;
    for (Veiculo veiculo : veiculos) {
      valorTotal += veiculo.getValor();
    }

    return valorTotal;
  }

  // Retorna a média dos valores dos veículos
  private static double valorMediaVeiculos(ArrayList<Veiculo> veiculos) {
    return valorTotalVeiculos(veiculos) / veiculos.size();
  }

  //Retorna as informações sobre o carro mais caro
  private static Veiculo valorMaisCaroVeiculos(ArrayList<Veiculo> veiculos) {
    double valorMaisCaro = 0;
    int indexCarroMaisCaro = 0;
    int i = 0;
    for (Veiculo veiculo : veiculos) {
      if (valorMaisCaro < veiculo.getValor())
        valorMaisCaro = veiculo.getValor();
        indexCarroMaisCaro = i;
    
      i++;
    }
    return veiculos.get(i);
  }

  // Retorna a quantidade de acessórios
  private static int todosAcessorios(ArrayList<Veiculo> veiculos, ArrayList<Acessorio> acessorios) {
    int totalAcessorios = 0;
    for (int i = 0; i < veiculos.size(); i++) {
      for (int j = 0; j < acessorios.size(); j++) {
        totalAcessorios += 1;
      }
    }
    return totalAcessorios;
  }

  // Limpa a tela
  public static void limpaTela() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }  

  public static void main(String[] args) {
    Scanner scNumber = new Scanner(System.in);
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>(5); // Inicia a lista de veículos
    ArrayList<Acessorio> acessorios = new ArrayList<Acessorio>(3); // Inicia a lista de acessórios
    int op = 1; //Inicia em 1 para não passar pelo if (ref. 0). Poderia ser qualquer número diferente das opções
    limpaTela();

    // Acontece pelo menos uma vez
    do {
      // (ref. 0) Caso não seja digitada opções válidas, a "Opção inválida, tente novamente!" aparece
      if (!(op == 1 || op == 2 || op == 3 || op == 4 || op == 5)) 
        System.out.println("Opção inválida, tente novamente!");

      System.out.println("1 - Adicionar veículo | 2 - Valor total de todos os veículos | 3 - Média de valor dos veículos |" + 
      " 4 - Veículo mais caro | 5 - Total de acessórios");
      op = scNumber.nextInt();
      limpaTela();
    } while (!(op == 1 || op == 2 || op == 3 || op == 4 || op == 5)); 
    // Caso nenhuma opção válida seja digitada, faz a condição: while(true) acontecer
    
    // 1 - Adicionar veículo
    if (op == 1) {

    }

    scNumber.close();

    /* ArrayList<Acessorio> acessorios = new ArrayList<Acessorio>(3);
    Acessorio acessorio1 = new Acessorio();
    Acessorio acessorio2 = new Acessorio();
    Acessorio acessorio3 = new Acessorio();
    Acessorio acessorio4 = new Acessorio();
    
    acessorio1.setDescricao("Blu-Ray");
    acessorio1.setValor(1200);
    acessorio2.setDescricao("Roda cromada");
    acessorio2.setValor(500);
    acessorio3.setDescricao("Banco de couro");
    acessorio3.setValor(2000);
    acessorio4.setDescricao("Excesso");
    acessorio4.setValor(1);

    acessorios.add(0, acessorio1);
    acessorios.add(0, acessorio2);
    acessorios.add(0, acessorio3);
    acessorios.add(0, acessorio4);

    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>(5);
    Veiculo veiculo = new Veiculo();

    veiculo.setAnoDeFabricacao("2022");
    veiculo.setModelo("Gol");
    veiculo.setMontadora("FIAT");
    veiculo.setValor(10000);
    veiculo.setAcessorios(acessorios);

    veiculos.add(0, veiculo);

    System.out.println(todosAcessorios(veiculos, acessorios));  */
  }
}
