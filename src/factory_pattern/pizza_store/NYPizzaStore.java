package factory_pattern.pizza_store;

import factory_pattern.ingredients.factory.NYPizzaIngredientFactory;
import factory_pattern.ingredients.factory.PizzaIngredientFactory;
import factory_pattern.pizza.CheesePizza;
import factory_pattern.pizza.Pizza;

//구상 생산자.
public class NYPizzaStore extends PizzaStore{

	//팩토리 메소드!!
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			//pizza = new NYStyleCheesePizza();
			pizza = new CheesePizza(ingredientFactory);
		} else if (type.equals("pepperoni")) {
			//pizza = new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			//pizza = new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			//pizza = new NYStyleVeggiePizza();
		} else return null;
		
		return pizza;
	}

}
