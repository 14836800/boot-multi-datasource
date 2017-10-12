package com.example.demo.other.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "test1")
public class test1 implements Serializable {

    @Id
    private String col2;
}
