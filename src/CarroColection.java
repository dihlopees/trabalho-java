import java.util.ArrayList;
import java.util.List;

public class CarroColection {

    List<Carro> carroList = new ArrayList<>();
    public void adicionarCarrosALista(Carro carro) {
        carroList.add(carro);
        System.out.println("Carro Adicionado com sucesso! ");
        System.out.println("\n\n\n");
        System.out.println();
        System.out.println();
    }

    public void printarCarroNaLista() {
        System.out.println();
        if (carroList.isEmpty()) System.out.println("\n Não existem carros cadastrados na coleção... ");
        else {
            System.out.println("\n Esses são os carros cadastrados na coleção: ");
            carroList.forEach(it -> {
                System.out.printf("\n Cor = %s , Modelo = %s , Tipo De Combustivel = %s , Potencia = %d ", it.getCor(), it.getModelo(), it.getTipoDeCombustivel(), it.getPotencia());
            });
        }
    }
}