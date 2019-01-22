/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package br.com.crud.dao;
 
import br.com.cruddb.model.Cliente;
import javax.persistence.EntityManager;
 
/**
 *
 * @author jsoft-ti
 */
public class ClienteDao {
    
   private EntityManager em;
   
   public ClienteDao(EntityManager em){
       this.em = em;
   }


    

   
   public void salvarCliente(Cliente cli){
       em.getTransaction().begin();
       em.persist(cli);
       em.getTransaction().commit();
   }
   
   public Cliente buscarCliente(int id){
       return this.em.find(Cliente.class, id);
   }
   
   public void excluirCliente(int id){
       this.em.remove(id);
   }
   
   
}