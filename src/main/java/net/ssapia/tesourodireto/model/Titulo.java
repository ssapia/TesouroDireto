package net.ssapia.tesourodireto.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Titulo {

	private String nome = "";
	private LocalDate dataVencimento = null;
	private BigDecimal taxaCompra = null;
	private BigDecimal taxaVenda = null;
	private BigDecimal precoCompra = null;
	private BigDecimal precoVenda = null;

	public LocalDate getDataVencimento() { return dataVencimento; }
	public BigDecimal getTaxaCompra() { return taxaCompra; }
	public BigDecimal getTaxaVenda() { return taxaVenda;}
	public BigDecimal getPrecoCompra() { return precoCompra; }
	public BigDecimal getPrecoVenda() { return precoVenda; }

	public void setPrecoCompra(BigDecimal precoCompra) { this.precoCompra = precoCompra; }

	public void setPrecoVenda(BigDecimal precoVenda) { this.precoVenda = precoVenda; }

	public void setTaxaVenda(BigDecimal taxaVenda) { this.taxaVenda = taxaVenda; }

	public void setTaxaCompra(BigDecimal taxaCompra) { this.taxaCompra = taxaCompra; }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.replaceAll("[0-9]{6}", "").trim();
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((precoCompra == null) ? 0 : precoCompra.hashCode());
		result = prime * result
				+ ((precoVenda == null) ? 0 : precoVenda.hashCode());
		result = prime * result
				+ ((taxaCompra == null) ? 0 : taxaCompra.hashCode());
		result = prime * result
				+ ((taxaVenda == null) ? 0 : taxaVenda.hashCode());
		result = prime * result
				+ ((dataVencimento == null) ? 0 : dataVencimento.hashCode());
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
		Titulo other = (Titulo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (precoCompra == null) {
			if (other.precoCompra != null)
				return false;
		} else if (!precoCompra.equals(other.precoCompra))
			return false;
		if (precoVenda == null) {
			if (other.precoVenda != null)
				return false;
		} else if (!precoVenda.equals(other.precoVenda))
			return false;
		if (taxaCompra == null) {
			if (other.taxaCompra != null)
				return false;
		} else if (!taxaCompra.equals(other.taxaCompra))
			return false;
		if (taxaVenda == null) {
			if (other.taxaVenda != null)
				return false;
		} else if (!taxaVenda.equals(other.taxaVenda))
			return false;
		if (dataVencimento == null) {
			if (other.dataVencimento != null)
				return false;
		} else if (!dataVencimento.equals(other.dataVencimento))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TituloModel [nome=" + nome + ", dataVencimento=" + dataVencimento
				+ ", taxaCompra=" + taxaCompra + ", taxaVenda=" + taxaVenda
				+ ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda
				+ "]";
	}
}
