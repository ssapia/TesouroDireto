package net.ssapia.tesourodireto.model;

import java.io.Serializable;
import java.util.Collection;

public class TitulosDoTesouroDiretoResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private final Collection<Titulo> titulos;
	private final String dataAtualizacao;

	public TitulosDoTesouroDiretoResponse(Collection<Titulo> titulos, String dataAtualizacao) {
		this.titulos = titulos;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Collection<Titulo> getTitulos() {
		return titulos;
	}

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result + ((titulos == null) ? 0 : titulos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TitulosDoTesouroDiretoResponse other = (TitulosDoTesouroDiretoResponse) obj;
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null)
				return false;
		} else if (!dataAtualizacao.equals(other.dataAtualizacao))
			return false;
		if (titulos == null) {
			if (other.titulos != null)
				return false;
		} else if (!titulos.equals(other.titulos))
			return false;
		return true;
	}
}
