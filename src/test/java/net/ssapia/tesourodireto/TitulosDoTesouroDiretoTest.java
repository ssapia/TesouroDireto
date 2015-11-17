package net.ssapia.tesourodireto;

import net.ssapia.tesourodireto.mocks.MockUtil;
import net.ssapia.tesourodireto.model.Titulo;
import net.ssapia.tesourodireto.model.TitulosDoTesouroDiretoResponse;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TitulosDoTesouroDiretoTest {

    private Document document;

    @Before
    public void setUp() throws Exception {
        document = MockUtil.get().criaDocumentMock();
    }

    @Test
    public void testGetTitulos() throws Exception {

        assertNotNull(document);

        TitulosDoTesouroDiretoResponse titulosResponse = new TitulosDoTesouroDireto(document).getTitulos();
        assertNotNull(titulosResponse);

        assertNotNull(titulosResponse.getDataAtualizacao());
        assertEquals("10-09-2015 17:39:35", titulosResponse.getDataAtualizacao());

        assertNotNull(titulosResponse.getTitulos());
        assertEquals(23, titulosResponse.getTitulos().size());

        List<Titulo> titulos = new ArrayList<>(titulosResponse.getTitulos());
        List<String> titulosMock = MockUtil.get().getTitulosMock();

        for (int cii = 0; cii < titulos.size(); cii++) {
            assertEquals(titulosMock.get(cii), titulos.get(cii).toString());
        }
    }
}