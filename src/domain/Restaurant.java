package domain;

import domain.dao.RestaurantDAO;

public class Restaurant {
	//private RestaurantDAO dao ; // ??? do i need 
	private static int counter; 
	private int id; 
	private String name;
	private Type type;  
	private String webSite; 
	private String phone; 
	private String description; 
	private Manager manager; 
	private int rating ; 
	private String address; 
	private Menu menu; 
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(String name, Type type, String webSite, String phone, String address,  String description) {
		super();
		this.name = name;
		this.type = type;
		this.webSite = webSite;
		this.phone = phone;
		this.description = description;
		this.address = address; 
		this.rating = 0 ; 
		this.id = ++counter + 100; 
	}

	public Type getType() {
		return type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Menu getMenu() {
		return menu;
	} 
	
}
