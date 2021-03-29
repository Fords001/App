package com.app.demo.entity;
import com.app.demo.entity.Categories;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="`all_items`")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class All_items {
    @Id
    @Column(name = "id1")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id1;

    @Column(name = "name")
  String name;

    @Column(name="price")
   Double price;

    @Column(name="description")
   String description;

    @Column(name="image")
   String image;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="common_items",
            joinColumns = @JoinColumn(name="id1"),
            inverseJoinColumns = @JoinColumn(name="id"))
    List<Categories> cat2;

}