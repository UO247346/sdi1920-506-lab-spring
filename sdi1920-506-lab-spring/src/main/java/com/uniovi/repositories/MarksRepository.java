package com.uniovi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.uniovi.entities.Mark;
import javax.persistence.*;

public interface MarksRepository  extends CrudRepository<Mark, Long>{
	
}