package com.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList= new ArrayList<>();
	List<String> musicList= new ArrayList<>();
	List<String> movieList= new ArrayList<>();
	
	public  ProductServiceImpl() {
		bookList.add("Rich Dad Poor Dad");
		bookList.add("Purpose Driven Life");
		bookList.add("The Power of now");
		bookList.add("The richest Man in Babylon");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Jukebox");
		musicList.add("Dawa ya Baridi");

		movieList.add("The book of Eli");
		movieList.add("The last Kingdom");
		movieList.add("12 Bridges");
		movieList.add("Infinity");
	}
	
	
	public List<String> getProductCategories(){
		
		List<String> categories = new ArrayList<String>();
		
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		
		return categories;
	
	}
	
	public List<String> getProducts(String category){
		
		switch (category.toLowerCase())
		{
		case "books":
		   return bookList;
		case "music":
		   return musicList;
		case "movies":
		   return movieList;
		}
		
		
		return null;
	
	}
	
	
	public boolean addProduct(String category, String product) {
		
		switch (category.toLowerCase())
		{
		case "books":
			bookList.add(product);
			break;
		case "music":
		   musicList.add(product);
		   break;
		case "movies":
		   movieList.add(product);
		   break;
		   default:
			   return false;
		}
		return true;
	
	}
	

}
