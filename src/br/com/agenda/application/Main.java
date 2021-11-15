package br.com.agenda.application;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        ContatoDAO contatoDAO = new ContatoDAO();
        Contato  contato = new Contato();
        contato.setNome("João Dias");
        contato.setIdade(35);
        contato.setDataCadastro(new Date());
        // contactDAO.save(contato);
        Contato c1 = new Contato();
        c1.setNome("João Dias Gomes");
        c1.setIdade(38);
        c1.setDataCadastro(new Date());
        c1.setId(1);

        contatoDAO.update(c1);


        //visualização
        for ( Contato c : contatoDAO.getContatos()) {
            System.out.println("Contato: "+ c.getNome());
        }

    }
}
