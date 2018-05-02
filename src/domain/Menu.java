package domain;

import java.util.ArrayList;

import domain.dao.ICRUD;

public class Menu implements ICRUD {
	private ArrayList<Item> menu;

	public Menu() {
		super();
		this.menu = new ArrayList<>();
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToList(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFromList() {
		// TODO Auto-generated method stub
		
	}
	
	
}
