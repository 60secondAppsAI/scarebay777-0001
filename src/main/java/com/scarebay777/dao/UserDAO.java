package com.scarebay777.dao;

import java.util.List;

import com.scarebay777.dao.GenericDAO;
import com.scarebay777.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


