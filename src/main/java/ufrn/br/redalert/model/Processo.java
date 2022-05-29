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
public class Processo extends AbstractEntity {

   
    private String num_processo;
    private String dsmov;
    
    @ManyToOne(cascade= CascadeType.ALL)
    private Secao secao;
    @JoinColumn(name = "id")


    public String getNum_processo() {
        return num_processo;
    }
    public void setNum_processo(String num_processo) {
        this.num_processo = num_processo;
    }
    public String getDsmov() {
        return dsmov;
    }
    public void setDsmov(String dsmov) {
        this.dsmov = dsmov;
    }
    public Secao getSecao() {
        return secao;
    }
    public void setSecao(Secao secao) {
        this.secao = secao;
    }
    
    @ManyToMany(mappedBy = "processos")
    private List<Problema> problemas = new ArrayList<Problema>();

    public List<Problema> getProblemas(){
        return problemas;
    }

    public void setProblemas(ArrayList<Problema> p){
        this.problemas = p;
    }
}
