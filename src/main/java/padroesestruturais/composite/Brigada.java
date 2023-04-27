package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Brigada extends Formacao {

    private List<Formacao> formacaos;

    public Brigada(String descricao) {
        super(descricao);
        this.formacaos = new ArrayList<Formacao>();
    }
    public void addFormacao(Formacao formacao) {
        this.formacaos.add(formacao);
    }

    public String getFormacao() {
        String saida = "";
        saida = "Brigada: " + this.getDescricao() + "\n";
        for (Formacao formacao : formacaos) {
            saida += formacao.getFormacao();
        }
        return saida;
    }
}
