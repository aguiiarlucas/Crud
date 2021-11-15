package br.com.agenda.application;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Contato  contato = new Contato();
        contato.setNome("Maria Padilha");
        contato.setIdade(50);
        contato.setDataCadastro(new Date());

        ContatoDAO contatoDAO = new ContatoDAO();
        contatoDAO.save(contato);

    }
}
