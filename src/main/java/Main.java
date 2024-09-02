import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String nome = sc.next();
    System.out.println("Digite sua senha: ");
    int senha = sc.nextInt();
    if (nome.equals("Camilly") && senha == 123) {
      System.out.println("Bem-Vindo");
    }
    sc.close();
  }

}