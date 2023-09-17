package test.configuracoesdojogotest;

import configuracoesdojogo.ConfiguracoesDoJogo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracoesDoJogoTest {
    @Test
    void testDefinirNomeDoJogador() {
        ConfiguracoesDoJogo.getInstance().setNomeDoJogador("Giovane");
        assertEquals("Giovane", ConfiguracoesDoJogo.getInstance().getNomeDoJogador());
    }

    @Test
    void testDefinirNivelAtual() {
        ConfiguracoesDoJogo.getInstance().setNivelAtual(8);
        assertEquals(8, ConfiguracoesDoJogo.getInstance().getNivelAtual());
    }

    @Test
    void testValoresIniciaisDoJogo() {
        assertNull(ConfiguracoesDoJogo.getInstance().getNomeDoJogador());
        assertEquals(0, ConfiguracoesDoJogo.getInstance().getNivelAtual());
    }
}
