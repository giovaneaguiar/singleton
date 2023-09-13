package test;

import main.ConfiguracoesDoJogo;
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
}
