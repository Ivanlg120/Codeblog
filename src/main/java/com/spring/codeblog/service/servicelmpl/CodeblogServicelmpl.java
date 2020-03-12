package com.spring.codeblog.service.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.BlogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServicelmpl implements CodeblogService{
	
	@Autowired
	BlogRepository blogrepository;

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return blogrepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		// TODO Auto-generated method stub
		return blogrepository.findById(id).get();
	}

	@Override
	public Post salvar(Post post) {
		// TODO Auto-generated method stub
		return blogrepository.save(post);
	}

}
