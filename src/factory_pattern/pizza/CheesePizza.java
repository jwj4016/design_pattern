package factory_pattern.pizza;

import factory_pattern.ingredients.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
//	public CheesePizza() {
//		name = "치즈 피자";
//		dough = "일반 도우";
//		sauce = "토마토 소스";
//		
//		toppings.add("모짜렐라 치즈");
//	}

//	void cut() {
//		System.out.println("반듯하게 피자 자르기.");
//	}

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("준비 중 : " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}
	
}
