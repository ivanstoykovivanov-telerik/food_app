package domain.dao;

public interface ICRUD {
	
	public void displayAll(); 
	public void addToList(IAddable obj );
	public void retrieve(); 
	public void deleteFromList();
	
}
