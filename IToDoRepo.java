package net.java.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.spring.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{
	
}