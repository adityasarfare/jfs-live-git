import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeMachineApp {
	public static void main(String[] args) {
		HotWater hotWater;
		Boost boost;
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		hotWater = applicationContext.getBean("hotWater",HotWater.class);
		hotWater.getHotWater();
		
		boost = applicationContext.getBean("boost",Boost.class);
		boost.getBoost();
		
		System.out.println(boost);
		Boost boost1 = applicationContext.getBean("boost",Boost.class);
		System.out.println(boost1);
	}
}

class HotWater {
	public void getHotWater() {
		System.out.println("Hot Hot Water for the Smarter!");
	}
}
class Boost {
private Sugar sugar;
private Milk milk;
	public Boost(Sugar sugar, Milk milk) {
		this.sugar = sugar;
		this.milk = milk;
	}
	public void getBoost() {
		System.out.println("Boost made of " + sugar.sugarType +" and " + milk.milkType);
	}
}
class Sugar{
	public String sugarType = "Brown Sugar!";
}
class Milk {
	public String milkType = "Fresh Milk!";
}
//challenge : try adding this as dependency for boost
class CharcoalMilk {
	public String milkType = "Charcoal Milk!";
}
