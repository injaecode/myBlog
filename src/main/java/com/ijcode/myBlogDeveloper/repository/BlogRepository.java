package com.ijcode.myBlogDeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijcode.myBlogDeveloper.domain.Article;

@Repository
public interface BlogRepository extends JpaRepository<Article, Long>{

}
