package ufrn.br.redalert.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pessoa extends AbstractEntity {
    

    private String cpf;
    private String nome;
    private String email;
    private Boolean magistrado;
    
    @OneToOne(cascade= CascadeType.ALL)
    private Usuario usuario;
    @JoinColumn(name = "id")
    
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getMagistrado() {
        return magistrado;
    }
    public void setMagistrado(Boolean magistrado) {
        this.magistrado = magistrado;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
   
    
}
