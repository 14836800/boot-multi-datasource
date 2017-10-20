package com.example.demo.other.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "other")
public class Other implements Serializable {

    @Id
    private Integer id;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }
}
