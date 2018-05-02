package domain;

import java.util.ArrayList;

import domain.dao.ICRUD;

public class Index implements ICRUD{
	private static Index INSTANCE = null ;
	private ArrayList<Restaurant> restaurants ; 
	
	private Index(){
		this.restaurants = new ArrayList<>();
	}
	
	public static Index getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Index();
		}
		return INSTANCE ; 
	}

	@Override
	public void addToList(Object restaurant) {
		restaurants.add( (Restaurant) restaurant);
	}

	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFromList() {
		// TODO Auto-generated method stub
	}
	
	
	public void displayList(){
		for (Restaurant rest : restaurants) {
			System.out.println( rest.getId() + " " + rest.getName() );
		}
	}
	
	public Restaurant findById(int id){
		return null; 
	}
	
	public Restaurant findByName(String name){
		return null; 
	}
	
	public ArrayList<Restaurant> findByType(Type type){
		return restaurants; 
	}
	
}
