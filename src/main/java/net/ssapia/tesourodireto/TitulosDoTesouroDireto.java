package net.ssapia.tesourodireto;

import net.ssapia.tesourodireto.function.TitulosFunction;
import net.ssapia.tesourodireto.model.Titulo;
import net.ssapia.tesourodireto.model.TitulosDoTesouroDiretoResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Collection;

public class TitulosDoTesouroDireto {

	final static String CONSULTA_TITULOS_URL = "http://www3.tesouro.gov.br/tesouro_direto/consulta_titulos_novosite/consultatitulos.asp";
	private Document document;

	public TitulosDoTesouroDireto() throws IOException {
		document = Jsoup.connect(CONSULTA_TITULOS_URL).get();
	}

	public TitulosDoTesouroDireto(Document document) {
		this.document = document;
	}

	public TitulosDoTesouroDiretoResponse getTitulos() throws IOException {

		Elements elements = document.select("td[class=listing], td[class=listing0]");
		String atualizadoEm = document.select("td[class=listing2] b").first().text();

		Collection<Titulo> titulos = new TitulosFunction().apply(elements);

		return new TitulosDoTesouroDiretoResponse(titulos, atualizadoEm);
	}
}
