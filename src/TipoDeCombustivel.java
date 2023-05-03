public class TipoDeCombustivel {
        private String[] listaCombustiveis = new String[3];
        public TipoDeCombustivel(){
            listaCombustiveis[0] = "Alcool";
            listaCombustiveis[1] = "Gasolina";
            listaCombustiveis[2] = "Diesel";
        }

        public void buscarTiposDeCombustiveis() {
            System.out.println("Esses são os tipo de combustivel disponiveis: Informe o código escolhido. ");
            for(int i =0; i<3; i++){
                if (listaCombustiveis[i] != null)  System.out.println("Código do combustivel = "+i+" cor = "+listaCombustiveis[i]+"");
            }
        }

        public String buscarCombustivelEscolhido(int indice) {
            return listaCombustiveis[indice];
        }
}
