package com.exemplo.teste;

import com.exemplo.caixa.Checkout;
import com.exemplo.caixa.Compra;
import com.exemplo.impressao.Impressora;
import com.exemplo.impressao.impressoras.ImpressoraEpson;
import com.exemplo.pagamento.Cartao;
import com.exemplo.pagamento.Operadora;
import com.exemplo.pagamento.operadoras.Cielo;

public class TesteCheckout {
	public static void main(String[] args) {
		
		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Gabriel Dewes");
		cartao.setNumeroCartao("123");		
		Compra compra = new Compra();
		compra.setNomeCliente("Gabriel Dewes de Oliveira");
		compra.setProduto("Sabonete");
		compra.setValorTotal(10);		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
}
