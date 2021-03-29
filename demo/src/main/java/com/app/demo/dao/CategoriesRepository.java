package com.app.demo.dao;


import com.app.demo.entity.All_items;
import com.app.demo.entity.Categories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categories",path="categories")
public interface CategoriesRepository extends JpaRepository<Categories,Long> {
}
