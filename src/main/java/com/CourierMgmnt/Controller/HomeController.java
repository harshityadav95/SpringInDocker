package com.CourierMgmnt.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CourierMgmnt.Dao.ItemDao;
import com.CourierMgmnt.Models.Items;


/**
 * @author hyadav23
 *
 */
@RestController
public class HomeController {
	
	@Autowired
	ItemDao repo;
	
	@RequestMapping("/")
	public String helloworld()
	{
		return "It Works";
	}
	
	/**
	 *
	 *  Post Items 
	 *  Add New Items 
	 *
	 */
		
	@PostMapping("/addItem")
	public String AddNewItem(@RequestBody Items item)
	{
		System.out.println("AddNewItem Recieved with "+ item);
		
		try {
			
			repo.save(item);
			System.out.println("ItemSaved");
			return "Item Saved";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Item Saving Error";
			
			
		}
		
		
		
	}
	/**
	 *
	 *  GET Items 
	 *  View All Items
	 *
	 */
	@GetMapping("/allItems")
	@ResponseBody
	public List<Items> getAllItems()
	{
		System.out.println("Get All Items Hit");
		try {
			
			return repo.findAll();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ArrayList<Items>();
		}
		
	}
	/**
	 *
	 *  Update Items 
	 *  Update Item in Database   
	 *
	 */
	@PutMapping("/updateItem")
	public String updateItem(@RequestBody Items item)
	{
		System.out.println("Update Item Hit with "+ item);
		try {
			
			repo.save(item);
			 return "Item Updated Succesfully";
			
		} catch (Exception e) {
			// TODO: handle exception\
			e.printStackTrace();
			System.out.println("Something Went Wrong in saving");
			return e.getMessage();
			
		}
		
	}
	
	/*
	 * 
	 * Retrieve the given order ID 
	 */
	@GetMapping("/item/{trackingnumbner}")
	public Optional<Items> getEmployee(@PathVariable int trackingnumbner) {
		System.out.println("Hit Request Order ID "+trackingnumbner);
		
		try {
			return repo.findById(trackingnumbner);
		} catch(Exception e) {
			e.printStackTrace();
			Optional<Items> nullItem = null;
			return nullItem;
		}	
		
	}
	
	/**
	 * Deletes item by given id.
	 **/
	@DeleteMapping("/deleteItem/{trackingnumbner}")
	public Boolean deleteItem(@PathVariable int trackingnumbner) {
		System.out.println("Hit delete path /employee : "+trackingnumbner);
		try {
			repo.deleteById(trackingnumbner);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	
	
	
	

}
