package com.scarebay777.dao;

import java.util.List;

import com.scarebay777.dao.GenericDAO;
import com.scarebay777.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


