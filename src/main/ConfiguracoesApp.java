package main;

public class ConfiguracoesApp {

    private String nomeApp;
    private String versao;
    private static ConfiguracoesApp instance;

    private ConfiguracoesApp() {
    }

    public static ConfiguracoesApp getInstance() {
        if (instance == null) {
            instance = new ConfiguracoesApp();
        }
        return instance;
    }

    public String getNomeApp() {
        return nomeApp;
    }

    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
