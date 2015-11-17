package net.ssapia.tesourodireto.mocks;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MockUtil {

    private static MockUtil mockUtil = new MockUtil();

    public static MockUtil get() {
        return mockUtil;
    }

    public Document criaDocumentMock() throws IOException {
        File file = new File(getClass().getResource("/html/consultatitulos.asp").getFile());
        return Jsoup.parse(file, "UTF-8", "http://example.com/");
    }

    public List<String> getTitulosMock() {

        List<String> titulos = new ArrayList<>();
        titulos.add("TituloModel [nome=Tesouro IGPM+ com Juros Semestrais 2017 (NTNC), dataVencimento=2017-07-01, taxaCompra=null, taxaVenda=0.0730, precoCompra=null, precoVenda=3176.76]");
        titulos.add("TituloModel [nome=Tesouro IGPM+ com Juros Semestrais 2021 (NTNC), dataVencimento=2021-04-01, taxaCompra=null, taxaVenda=0.0762, precoCompra=null, precoVenda=3070.06]");
        titulos.add("TituloModel [nome=Tesouro IGPM+ com Juros Semestrais 2031 (NTNC), dataVencimento=2031-01-01, taxaCompra=null, taxaVenda=0.0762, precoCompra=null, precoVenda=4498.25]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ com Juros Semestrais 2017 (NTNB), dataVencimento=2017-05-15, taxaCompra=null, taxaVenda=0.0729, precoCompra=null, precoVenda=2693.38]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ 2019 (NTNB Princ), dataVencimento=2019-05-15, taxaCompra=0.0753, taxaVenda=0.0757, precoCompra=2065.87, precoVenda=2063.07]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ com Juros Semestrais 2020 (NTNB), dataVencimento=2020-08-15, taxaCompra=0.0755, taxaVenda=0.0761, precoCompra=2542.31, precoVenda=2536.24]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ com Juros Semestrais 2024 (NTNB), dataVencimento=2024-08-15, taxaCompra=null, taxaVenda=0.0763, precoCompra=null, precoVenda=2435.88]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ 2024 (NTNB Princ), dataVencimento=2024-08-15, taxaCompra=0.0758, taxaVenda=0.0764, precoCompra=1406.13, precoVenda=1399.19]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ com Juros Semestrais 2035 (NTNB), dataVencimento=2035-05-15, taxaCompra=0.0756, taxaVenda=0.0764, precoCompra=2333.61, precoVenda=2314.83]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ 2035 (NTNB Princ), dataVencimento=2035-05-15, taxaCompra=0.0757, taxaVenda=0.0765, precoCompra=644.11, precoVenda=634.80]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ com Juros Semestrais 2045 (NTNB), dataVencimento=2045-05-15, taxaCompra=null, taxaVenda=0.0764, precoCompra=null, precoVenda=2245.48]");
        titulos.add("TituloModel [nome=Tesouro IPCA+ com Juros Semestrais 2050 (NTNB), dataVencimento=2050-08-15, taxaCompra=0.0753, taxaVenda=0.0763, precoCompra=2214.50, precoVenda=2187.50]");
        titulos.add("TituloModel [nome=Tesouro Prefixado 2016 (LTN), dataVencimento=2016-01-01, taxaCompra=null, taxaVenda=0.1451, precoCompra=null, precoVenda=959.44]");
        titulos.add("TituloModel [nome=Tesouro Prefixado com Juros Semestrais 2017 (NTNF), dataVencimento=2017-01-01, taxaCompra=null, taxaVenda=0.1536, precoCompra=null, precoVenda=961.09]");
        titulos.add("TituloModel [nome=Tesouro Prefixado 2017 (LTN), dataVencimento=2017-01-01, taxaCompra=null, taxaVenda=0.1533, precoCompra=null, precoVenda=830.57]");
        titulos.add("TituloModel [nome=Tesouro Prefixado 2018 (LTN), dataVencimento=2018-01-01, taxaCompra=0.1526, taxaVenda=0.1532, precoCompra=722.39, precoVenda=721.53]");
        titulos.add("TituloModel [nome=Tesouro Prefixado com Juros Semestrais 2021 (NTNF), dataVencimento=2021-01-01, taxaCompra=null, taxaVenda=0.1534, precoCompra=null, precoVenda=840.40]");
        titulos.add("TituloModel [nome=Tesouro Prefixado 2021 (LTN), dataVencimento=2021-01-01, taxaCompra=0.1519, taxaVenda=0.1525, precoCompra=473.83, precoVenda=472.52]");
        titulos.add("TituloModel [nome=Tesouro Prefixado com Juros Semestrais 2023 (NTNF), dataVencimento=2023-01-01, taxaCompra=null, taxaVenda=0.1537, precoCompra=null, precoVenda=800.12]");
        titulos.add("TituloModel [nome=Tesouro Prefixado com Juros Semestrais 2025 (NTNF), dataVencimento=2025-01-01, taxaCompra=0.1536, taxaVenda=0.1542, precoCompra=770.74, precoVenda=768.48]");
        titulos.add("TituloModel [nome=Tesouro Selic 2017 (LFT), dataVencimento=2017-03-07, taxaCompra=null, taxaVenda=0.0002, precoCompra=null, precoVenda=7112.24]");
        titulos.add("TituloModel [nome=Tesouro Selic 2021 (LFT), dataVencimento=2021-03-01, taxaCompra=0.0000, taxaVenda=0.0004, precoCompra=7114.35, precoVenda=7098.90]");
        titulos.add("TituloModel [nome=Tesouro Selic 2021 (LFT), dataVencimento=2021-03-01, taxaCompra=0.0000, taxaVenda=0.0004, precoCompra=7114.35, precoVenda=7098.90]");
        return titulos;
    }

}
