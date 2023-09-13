package test.configuracoesapptest;

import main.configuracoesapp.ConfiguracoesApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracoesAppTest {

    @BeforeEach
    void setUp() {
        ConfiguracoesApp.getInstance().reset();
    }

    @Test
    void testConfiguracaoPadrao() {
        assertEquals(null, ConfiguracoesApp.getInstance().getNomeApp());
        assertEquals(null, ConfiguracoesApp.getInstance().getVersao());
    }

    @Test
    void testDefinirNomeApp() {
        ConfiguracoesApp.getInstance().setNomeApp("Meu Aplicativo");
        assertEquals("Meu Aplicativo", ConfiguracoesApp.getInstance().getNomeApp());
    }

    @Test
    void testDefinirVersao() {
        ConfiguracoesApp.getInstance().setVersao("2.0");
        assertEquals("2.0", ConfiguracoesApp.getInstance().getVersao());
    }

    @Test
    void testDefinirNomeAppEVersao() {
        ConfiguracoesApp.getInstance().setNomeApp("Novo App");
        ConfiguracoesApp.getInstance().setVersao("3.0");

        assertEquals("Novo App", ConfiguracoesApp.getInstance().getNomeApp());
        assertEquals("3.0", ConfiguracoesApp.getInstance().getVersao());
    }

}
