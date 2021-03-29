package com.app.demo.entity;

import com.app.demo.entity.Groups;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="`main1`")
@Data
public class Main1 {

    @Id
    @Column(name="id")
    private int id=1;

    @OneToMany( mappedBy = "main11",cascade = {CascadeType.ALL})
    Set<Groups> f1;

}
