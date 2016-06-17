package com.exemplo.impressao.impressoras;

import com.exemplo.impressao.Impressora;
import com.exemplo.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {
	@Override
	public void imprimir(Imprimivel imprimivel) {
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("**                EPSON                  **");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
	}
}
