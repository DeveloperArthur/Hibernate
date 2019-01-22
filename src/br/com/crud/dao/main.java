package br.com.crud.dao;

import br.com.cruddb.model.Cliente;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoHibernatePU");
        EntityManager em = factory.createEntityManager();
        
        ClienteDao exemploDaoCliente = new ClienteDao(em);
        Cliente exemploCliente = new Cliente();
        
        
        exemploCliente.setNome("Arthur Almeida");
        exemploCliente.setCep("0482450");
        exemploCliente.setCidade("sao paulo");
        exemploCliente.setCpf("491503849/00");
        exemploCliente.setEndereco("grajau");
        exemploCliente.setEstado("sao paulo");
        exemploCliente.setGenero("macho");
        exemploCliente.setIdade(19);
        exemploCliente.setTelefone("966402850");
        
        
        exemploDaoCliente.salvarCliente(exemploCliente);
        //exemploDaoCliente.buscarCliente(1);
        //exemploDaoCliente.excluirCliente(1);
        
        
        
    }

}