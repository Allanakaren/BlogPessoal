package com.blogpessoal.blogpessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal.model.postagem;

@Repository
public interface PostagemRepository extends JpaRepository<postagem, Long> {

	public List <postagem> findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
	
}
