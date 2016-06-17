package com.exemplo.pagamento;

public interface Operadora {	
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
