import java.util.Scanner;

public class Carro {
    private String cor;
    private String modelo;
    private String tipoDeCombustivel;
    private int potencia;

    Scanner scanner = new Scanner(System.in);
    Cor corCadastradas = new Cor();
    TipoDeCombustivel combustivel = new TipoDeCombustivel();
    CarroColection carroColection = new CarroColection();
    public Carro() {}
    public Carro( String cor, String modelo, String tipoDeCombustivel, int potencia){
        this.cor = cor;
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void cadastroInicial() {
        String novaCor = "", novoModelo, novoTipoDeCombutivel = "";
        int novaPotencia = 0;

        System.out.println("Vamos cadastrar seu novo carro, informe os seguintes requisitos: ");
        int indice = 10;

        do {
            System.out.println("Cor do veículo: ");
            corCadastradas.buscarCoresDisponiveis();

            indice = scanner.nextInt();
            if (indice >= 5 || indice < 0) {
                System.out.println("Numero inválido");
            } else {
                novaCor = corCadastradas.buscarCorEscolhida(indice);
            }
        } while (indice >= 5 || indice < 0) ;


            do {
                System.out.println("Nome do modelo: ");
                System.out.println("Campo obrigatório, não pode ser vazio");
                novoModelo = scanner.next();
            } while (novoModelo.isEmpty());

            int indiceTemp = -1;
            do {
                System.out.println("Tipo de combustivel");
                combustivel.buscarTiposDeCombustiveis();
                indiceTemp = scanner.nextInt();

                if (indiceTemp < 0 || indiceTemp >= 3) {
                   System.out.println("numero invalido");
                } else {
                    novoTipoDeCombutivel = combustivel.buscarCombustivelEscolhido(indiceTemp);
                }
            } while (indiceTemp < 0 || indiceTemp >= 3);


            do {
                System.out.println("Potência: ");
                System.out.println("Campo obrigatório, não pode ser vazio e nem negativo");
                novaPotencia = scanner.nextInt();
            } while (novaPotencia < 0);

            resumo(novaCor, novoModelo, novoTipoDeCombutivel, novaPotencia);
    }

    public void resumo(String novaCor, String novoModelo, String novoTipoDeCombutivel, int novaPotencia ) {
        System.out.println();
        System.out.println();
        System.out.println("Esses são os dados informados:");
        System.out.println("Cor....: "+novaCor+"");
        System.out.println("Modelo....: "+novoModelo+"");
        System.out.println("Tipo de Combustivel....: "+novoTipoDeCombutivel+"");
        System.out.println("Potencia....: "+novaPotencia+"");

        System.out.println();
        System.out.println();
        System.out.println();
        int salvar = -1;

        do {
            System.out.println("Para salvar informe [1], para deletar informe [2] ");
            salvar = scanner.nextInt();

            if (salvar == 1) {
                carroColection.adicionarCarrosALista(new Carro(novaCor, novoModelo, novoTipoDeCombutivel, novaPotencia));
                break;
            } else if (salvar == 2) {
                System.out.println("Dados deletados");
                break;
            }
            else {
                System.out.println("Este não é um valor válido!");
            }
        } while (salvar !=1 || salvar !=2);
    }

    public void mostrarListaDeCarros(){
        carroColection.printarCarroNaLista();
    }
}
