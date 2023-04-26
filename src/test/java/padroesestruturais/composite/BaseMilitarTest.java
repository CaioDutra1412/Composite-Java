package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseMilitarTest {

    @Test
    void retornarEstruturaBase() {
        Brigada brigada1 = new Brigada("Artilharia");
        Pelotao pelotao1 = new Pelotao("Soldados", 400);
        brigada1.addFormacao(pelotao1);

        BaseMilitar baseMilitar = new BaseMilitar();
        baseMilitar.setBrigada(brigada1);

        assertEquals("Brigada: Artilharia\n" +
                        "Pelotão: Soldados - Efetivo: 400\n",
                baseMilitar.getBrigada());
    }


    @Test
    void retornarExecacaoBaseSemBrigada() {
        try {
            BaseMilitar baseMilitar = new BaseMilitar();
            baseMilitar.getBrigada();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Base inoperante", e.getMessage());
        }
    }
}