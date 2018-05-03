package domain.dao;

import java.util.ArrayList;

import domain.Restaurant;
import domain.Type;

public interface IFindable {
		
		public ISearchable findById(int id); 
		
		public Restaurant findByName(String name); 
		
		public ArrayList<ISearchable> findByType(Type type); 
}
