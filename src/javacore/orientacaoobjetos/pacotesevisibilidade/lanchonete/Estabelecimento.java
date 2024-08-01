package javacore.orientacaoobjetos.pacotesevisibilidade.lanchonete;

import javacore.orientacaoobjetos.pacotesevisibilidade.lanchonete.area.cliente.Cliente;
import javacore.orientacaoobjetos.pacotesevisibilidade.lanchonete.atendimento.Atendente;
import javacore.orientacaoobjetos.pacotesevisibilidade.lanchonete.atendimento.cozinha.Almoxarife;
import javacore.orientacaoobjetos.pacotesevisibilidade.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda a aplicação

        /* Alterada a visibilidade para private
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararCombo();
        */

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        /*
        //Essa classe não precisa nem existir, pois é toda invisível ao estabelecimento
        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estar disponíveis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();
         */

        /*
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();
         */


        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();
        //atendente.pegarPedidoBalcao();
        atendente.servindoMesa();
        atendente.receberPagamento();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
        //ainda não definiu normas de atendimento
        //cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, qua tal ser privada ?
        //cliente.consultarSaldoAplicativo();

        //já pensou os clientes ouvindo que o gás acabou ?
        //cozinheiro.pedirParaTrocarGas(atendente);
        //cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
