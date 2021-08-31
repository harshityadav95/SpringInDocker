package com.CourierMgmnt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourierMgmnt.Models.Items;

public interface ItemDao  extends JpaRepository<Items, Integer>{
	
	

}
