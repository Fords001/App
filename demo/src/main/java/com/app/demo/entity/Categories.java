package com.app.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="`categories`")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Categories {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(name = "name")
    String name;


    @ManyToOne
    @JoinColumn(name="categories_id" ,nullable = false)
    Groups groups111;


    @ManyToMany( cascade = {CascadeType.ALL})
    @JoinTable(name="common_items",
    joinColumns = @JoinColumn(name="id" ),
    inverseJoinColumns = @JoinColumn(name="id1"))
    List<All_items> all1 ;

}