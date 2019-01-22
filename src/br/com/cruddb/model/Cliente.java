/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package br.com.cruddb.model;
 
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 *
 * @author jsoft-ti
 */
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="cpf")
    private String cpf;
    @Column(name="genero")
    private String genero;
    @Column(name="telefone")
    private String telefone;
    @Column(name="idade")
    private int idade;
    @Column(name="endereco")
    private String endereco;
    @Column(name="cidade")
    private String cidade;
    @Column(name="estado")
    private String estado;
    @Column(name="cep")
    private String cep;
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getCpf() {
        return cpf;
    }
 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
    public String getGenero() {
        return genero;
    }
 
    public void setGenero(String genero) {
        this.genero = genero;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public String getEndereco() {
        return endereco;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public String getCidade() {
        return cidade;
    }
 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    public String getCep() {
        return cep;
    }
 
    public void setCep(String cep) {
        this.cep = cep;
    }
    
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
 
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString() {
        return "br.com.crud.model.Cliente[ id=" + id + " ]";
    }
    
}