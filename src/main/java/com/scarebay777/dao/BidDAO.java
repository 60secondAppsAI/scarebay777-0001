package com.scarebay777.dao;

import java.util.List;

import com.scarebay777.dao.GenericDAO;
import com.scarebay777.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


