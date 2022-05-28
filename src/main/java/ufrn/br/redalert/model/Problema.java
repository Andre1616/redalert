package ufrn.br.redalert.model;

import java.util.*;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Problema extends AbstractEntity {

  
    private String descricao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="problema_processo", 
    joinColumns = {@JoinColumn(name="id_problema", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name="id")})
    private List<Processo> processos = new ArrayList<Processo>();

    public void addProcesso(Processo p){
        processos.add(p);
        p.getProblemas().add(this);
    }

    public void removeProcesso(Processo p){
        processos.remove(p);
        p.getProblemas().remove(this);
    }


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
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
