package net.ssapia.tesourodireto.function;

import net.ssapia.tesourodireto.model.Titulo;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.Function;


public class TitulosFunction implements Function<Elements, Collection<Titulo>> {

    private static final DateTimeFormatter dataVencimentoformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Collection<Titulo> apply(Elements elements) {

        Collection<Titulo> titulos = new ArrayList<>();

        Titulo tituloModel = null;

        Iterator<Element> iterator = elements.listIterator();
        int coluna = 0;
        while (iterator.hasNext()) {

            Element element = iterator.next();
            String valor = element.text();

            switch (coluna) {

                case 0:
                    tituloModel = new Titulo();
                    tituloModel.setNome(valor);
                    break;
                case 1:
                    LocalDate dataVencimento = LocalDate.parse(valor, dataVencimentoformatter);
                    tituloModel.setDataVencimento(dataVencimento);
                    break;
                case 2:
                    BigDecimal taxaCompra = formataValor(valor);
                    tituloModel.setTaxaCompra(taxaCompra);
                    break;
                case 3:
                    BigDecimal taxaVenda = formataValor(valor);
                    tituloModel.setTaxaVenda(taxaVenda);
                    break;
                case 4:
                    BigDecimal precoCompra = formataValor(valor);
                    tituloModel.setPrecoCompra(precoCompra);
                    break;
                case 5:
                    BigDecimal precoVenda = formataValor(valor);
                    tituloModel.setPrecoVenda(precoVenda);

                    titulos.add(tituloModel);
                    coluna = -1;
                    break;
            }
            coluna++;
        }

        titulos.add(tituloModel);

        return titulos;
    }

    private BigDecimal formataValor(String valor) {
        NumberFormat nf;

        Locale locale = new Locale("pt", "BR");
        int scale;

        if (valor.contains("%")) {
            scale = 4;
            nf = NumberFormat.getPercentInstance(locale);
        } else if (valor.startsWith("R$")) {
            scale = 2;
            nf = NumberFormat.getCurrencyInstance(locale);
        } else {
            return null;
        }

        try {
            String valorFormatado = nf.parse(valor).toString();
            return new BigDecimal(valorFormatado).setScale(scale, BigDecimal.ROUND_UP);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
