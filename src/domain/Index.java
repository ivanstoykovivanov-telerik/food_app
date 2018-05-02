package domain;

import java.util.ArrayList;

import domain.dao.ICRUD;

public class Index implements ICRUD{
	private static Index INSTANCE = null ;
	private ArrayList<Restaurant> restaurants ; 
	
	//singleton desing pattern - we need only one index
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
	
	
	public void displayAll(){
		for (Restaurant rest : restaurants) {
			System.out.println( rest.getId() + " " + rest.getName() );
		}
	}
	
	//TODO add excpetions
	public Restaurant findById(int id){
		Restaurant found = new Restaurant();
		for (Restaurant rest : restaurants){
			if(rest.getId() == id ){
				found = rest ; 
			} 
		}
		return found;
	}
	
	//TODO add excpetions
	public Restaurant findByName(String name){
		Restaurant found = new Restaurant(); 
		for (Restaurant rest : restaurants){
			if(rest.getName().equals(name)){
				found = rest ; 
			}
		}
		return found;
	}
	
	//TODO add excpetions
	public ArrayList<Restaurant> findByType(Type type){
		ArrayList<Restaurant> found = new ArrayList<>(); 
		
		for (Restaurant rest : restaurants) {
			if(rest.getType() == type) {
				found.add(rest); 
			}
		}
		return found; 
	}
}
