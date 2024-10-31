package com.scarebay777.dao;

import java.util.List;

import com.scarebay777.dao.GenericDAO;
import com.scarebay777.domain.Watchlist;





public interface WatchlistDAO extends GenericDAO<Watchlist, Integer> {
  
	List<Watchlist> findAll();
	






}


