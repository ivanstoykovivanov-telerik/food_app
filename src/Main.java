import java.util.ArrayList;

import domain.Index;
import domain.Manager;
import domain.Restaurant;
import domain.Type;

public class Main {

	public static void main(String[] args) {
		Manager mngr = new Manager("Ivan", "Tzvetkov");
		Index index = Index.getInstance(); 
		
		//add Restaurants
		Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София",  "Пица за душата от Италия"); 
		Restaurant rest2 = new Restaurant("Дон Вито–2", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "ул. Христо Ботев 43, София",   "Пица за душата от Италия"); 
		Restaurant rest3 = new Restaurant("Casa Mia", Type.PIZZA, "http://casamia.com/bg/", "08834344934","бл 153, Младост 3, София",  "Твоята пицария в Младост "); 
		Restaurant rest4 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул Дондуков 42, София",  "Студена бира в гореща вечер");
		index.addToList(rest1);	
		index.addToList(rest2);
		index.addToList(rest3);
		index.addToList(rest4);
		index.displayAll();
		
		//search
		//find by name: 
		System.out.println("---- Find by name: Casa Mia ---- ");
		Restaurant casaMia = index.findByName("Casa Mia"); 
		System.out.println(casaMia.getId() + " " + casaMia.getName() );
				
		//find by Id:
		System.out.println("---- Find by id: 101 ---- ");
		Restaurant idRest = index.findById(106); 
		System.out.println(idRest.getId() + " " + idRest.getName() );
		
		//find by Type
		System.out.println("---- Find by type: Pizza ---- ");
		ArrayList<Restaurant> pizzaPlaces = index.findByType(Type.PIZZA);
		for (Restaurant rest : pizzaPlaces) {
			System.out.println(rest.getId() + " " + rest.getName() );
		}
		
	}
}
