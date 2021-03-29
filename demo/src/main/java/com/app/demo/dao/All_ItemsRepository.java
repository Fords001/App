package com.app.demo.dao;


import com.app.demo.entity.All_items;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "all_items",path="all_items")
public interface All_ItemsRepository extends JpaRepository<All_items,Long> {

}
