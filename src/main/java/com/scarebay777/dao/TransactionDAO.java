package com.scarebay777.dao;

import java.util.List;

import com.scarebay777.dao.GenericDAO;
import com.scarebay777.domain.Transaction;





public interface TransactionDAO extends GenericDAO<Transaction, Integer> {
  
	List<Transaction> findAll();
	






}


