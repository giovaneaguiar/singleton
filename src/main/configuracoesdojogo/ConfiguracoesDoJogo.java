package main.configuracoesdojogo;

public class ConfiguracoesDoJogo {
    //Desenvolvimento um jogo para armazenar configurações globais, como o nível atual do jogo, o nome do jogador e
    //outras opções de configuração. Usando o Singleton para garantir que haja apenas uma instância dessas configurações.

    private String nomeDoJogador;
    private int nivelAtual;

    private static ConfiguracoesDoJogo instance = new ConfiguracoesDoJogo();

    private ConfiguracoesDoJogo() {
    }

    public static ConfiguracoesDoJogo getInstance() {
        return instance;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }
}