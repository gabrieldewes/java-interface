package com.exemplo.pagamento.operadoras;

import com.exemplo.pagamento.Autorizavel;
import com.exemplo.pagamento.Cartao;
import com.exemplo.pagamento.Operadora;

public class Cielo implements Operadora {
	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}
}
