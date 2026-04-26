import java.util.ArrayList;
import java.util.List;

public class Ex06 {

    public static void main(String [] args) {

        /* 6) Crie um ArrayList chamado "origem" e adicione alguns elementos. Logo
        depois crie um novo ArrayList chamado "destino" e copie todos os
        elementos do ArrayList "origem". */

        // instanciando origem
        List<String> origem = new ArrayList<String>();

        // adicionando três elementos
        origem.add("Dogville");
        origem.add("Hamnet");
        origem.add("Shawarma");

        // instanciando destino
        List<String> destino = new ArrayList<String>();

        // destino copia os elementos de origem com addAll
        destino.addAll(origem);

        // exibição da cópia
        System.out.println(destino);

    }

}
