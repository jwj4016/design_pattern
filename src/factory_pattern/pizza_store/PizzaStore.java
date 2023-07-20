package factory_pattern.pizza_store;

import factory_pattern.pizza.Pizza;

public abstract class PizzaStore{
	
	//SimplePizzaFactory pizzaFactory;
	//
	//public PizzaStore(SimplePizzaFactory factory) {
	//	this.pizzaFactory = factory;
	//}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		//pizza = pizzaFactory.createPizza(type);
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	//팩토리 메소드를 추상 메소드로 선언해 서브클래스가 객체 생성을 책임지도록 한다.
	//팩토리 메소드는 특정 객체(Pizza)를 리턴하며, 리턴된 객체(Pizza)는 슈퍼 클래스에 정의된 메소드(orderPizza()) 내에서 쓰인다.
	abstract Pizza createPizza(String type);

}
