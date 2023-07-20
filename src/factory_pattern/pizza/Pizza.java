package factory_pattern.pizza;


import factory_pattern.ingredients.interfaces.Cheese;
import factory_pattern.ingredients.interfaces.Clams;
import factory_pattern.ingredients.interfaces.Dough;
import factory_pattern.ingredients.interfaces.Pepperoni;
import factory_pattern.ingredients.interfaces.Sauce;
import factory_pattern.ingredients.interfaces.Veggies;

public abstract class Pizza {
	String name;
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	public abstract void prepare();
	
	//public void prepare() {
	//	System.out.println("준비 중 : " + name);
	//	System.out.println("도우를 돌리는 중...");
	//	System.out.println("소스를 뿌리는 중...");
	//	System.out.println("토핑을 올리는 중...");
	//	for(String topping : toppings) {
	//		System.out.println(" " + topping);
	//	}
	//}
	
	public void bake() {
		
	}
	public void cut() {
		
	}
	public void box() {
		
	}
	

}
