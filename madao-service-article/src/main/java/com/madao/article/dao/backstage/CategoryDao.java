package com.madao.article.dao.backstage;

import com.madao.model.pojo.article.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, String>,
        JpaSpecificationExecutor<Category>, QuerydslPredicateExecutor<Category> {

    @Modifying
    @Query("delete from Category where id in (:ids)")
    void deleteBatch(@Param("ids") List<String> ids);

}
