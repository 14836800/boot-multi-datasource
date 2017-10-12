package com.example.demo.test.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "test")
public class test implements Serializable {

    @Id
    private String col1;
}
