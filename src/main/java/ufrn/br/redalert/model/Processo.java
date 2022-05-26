package ufrn.br.redalert.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String num_processo;
    private String dsmov;
    
    

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

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

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
}
