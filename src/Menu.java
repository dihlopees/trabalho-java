import java.util.Scanner;

public class Menu {
    static String[] menu = new String[3];
    public Menu(){
        menu[0] = "Cadastrar um carro novo";
        menu[1] = "Listar todos os carros cadastrados";
        menu[2] = "Encerrar";
    }

    public void printMenu(){
        for(int i = 0; i < 3; i++){
            System.out.println("["+i+"]  "+menu[i]+"  ");
        }
    }
}
