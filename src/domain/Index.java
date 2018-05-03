package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.dao.Finder;
import domain.dao.IAddable;
import domain.dao.ICRUD;
import domain.dao.IFindable;
import domain.dao.ISearchable;

public class Index  implements ICRUD, IFindable{
	private static Index INSTANCE = null ;
	private ArrayList<Restaurant> restaurants ; 
	
	//singleton design pattern - we need only one index for the whole app
	private Index(){
		//super.list = new ArrayList<>();
		//this.restaurants = (ArrayList<Restaurant>) super.list;
		this.restaurants = new ArrayList<>(); 
	}
	
	public static Index getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Index();
		}
		return INSTANCE ; 
	}

	@Override
	public void addToList(IAddable restaurant) {
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
	
	// Finder
	////TODO add exceptions
	public void displayAll(){
		for (ISearchable restaurant : restaurants) {
			System.out.println( ((Restaurant) restaurant).getId() + " " + ((Restaurant) restaurant).getName() );
		}
	}
	
	//TODO add exceptions
	public ISearchable findById(int id){
		ISearchable found = new Restaurant();
		for (ISearchable rest : restaurants){
			if(((Restaurant) rest).getId() == id ){
				found = rest ; 
			} 
		}
		return found;
	}
	
	//TODO add exceptions
	public Restaurant findByName(String name){
		Restaurant found = new Restaurant(); 
		for (ISearchable restaurant : restaurants){
			if(((Restaurant) restaurant).getName().equals(name)){
				found = (Restaurant) restaurant ; 
			}
		}
		return found;
	}

	//TODO add exceptions
	public ArrayList<ISearchable> findByType(Type type){
		ArrayList<ISearchable> found = new ArrayList<>(); 
		
		for (ISearchable rest : restaurants) {
			if(((Restaurant) rest).getType() == type) {
				found.add(rest); 
			}
		}
		return found; 
	}
	
	
	public ArrayList<Restaurant> sortByRating(){
		ArrayList<Restaurant> toBeSorted = this.restaurants; 
		Collections.sort( toBeSorted  );
		return toBeSorted ; 
	}
}
