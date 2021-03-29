package com.app.demo.dao;


import com.app.demo.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "groups", path="groups")
public interface GroupsRepository extends JpaRepository<Groups,Long> {
}
