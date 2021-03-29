package com.app.demo.dao;


import com.app.demo.entity.Main1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(collectionResourceRel = "main1", path="main1")
public interface Main1Repository extends JpaRepository<Main1,Integer> {

}
