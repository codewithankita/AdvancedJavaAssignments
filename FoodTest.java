
public class FoodTest {
	
	public static void main(String[] args) {
		
		Toppings myToppings[] = {
				new Toppings(),
				new Toppings(),
				new Toppings(),
				new Toppings(),
		};
		
		PizzaBase pizzaB = new PizzaBase();
		Cheese ch=  new Cheese();
		Sauce sc = new Sauce();
		
	    Pizza pizza = new Pizza();
		BakedPizza bp = pizza.heat(myToppings, ch, sc);
		bp.printBill();
		
		
	}
	}
	
	
	class Food{}
	class PizzaBase{}
	class Toppings{}
	class Cheese{}
	class Sauce {}
	class BakedPizza{
		
		private float cost;

		public float getCost() {
			return cost;
		}

		public void setCost(float cost) {
			this.cost = cost;
		}
		
		void printBill()
		{ System.out.println("Pizza costs for"+cost);
		
	}
	}
	class Pizza extends Food {

		PizzaBase pizzaBase = new PizzaBase();
		BakedPizza heat(Toppings tp[],Cheese ch, Sauce sc)
		{
			BakedPizza bakedPizza =new BakedPizza();
			bakedPizza.setCost(100* tp.length);
			return bakedPizza;
			
			
		}
		}
		
		



