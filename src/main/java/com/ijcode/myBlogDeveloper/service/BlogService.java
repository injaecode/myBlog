package com.ijcode.myBlogDeveloper.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijcode.myBlogDeveloper.domain.Article;
import com.ijcode.myBlogDeveloper.dto.AddArticleRequest;
import com.ijcode.myBlogDeveloper.repository.BlogRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BlogService {
	
	public final BlogRepository blogRepository;



	public Article save(AddArticleRequest request) {
		return blogRepository.save(request.toEntity());
	}
	public List<Article> findAll(){
		return blogRepository.findAll();
	}
	
	public Article findById(long id) {
		return blogRepository.findById(id)
				.orElseThrow(()->new IllegalArgumentException("not found"+id));
	}
}
