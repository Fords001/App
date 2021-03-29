package com.app.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="`groups`")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Groups {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(name="name")
    String name;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="groups_id", nullable = false)
    Main1 main11;

    @OneToMany(mappedBy = "groups111" ,cascade = {CascadeType.ALL})
    Set<Categories> cat;

}
