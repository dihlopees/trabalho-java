import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int codigoMenu = 10;

        do{
            System.out.println();
            System.out.println("Trabalho Java - Ingrid Lopes - RA: 22.6980-1");
            System.out.println("Bem vindo, escolha um item do menu:");
            menu.printMenu();

            codigoMenu = scanner.nextInt();
            if(codigoMenu == 0) carro.cadastroInicial();
            else if (codigoMenu == 1) carro.mostrarListaDeCarros();
            else if (codigoMenu == 2) System.exit(codigoMenu);
            else System.out.println("Valor informado não é valido, informe novamente.");

        } while (codigoMenu !=2);
    }
}