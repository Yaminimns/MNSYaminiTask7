package epam.BehavioralDesign;

public class Test {
	public static void main(String[] args) {
		 
        System.out.println("Going to build Concrete Wall House");

        Home house = new ConcreteHome();
        house.buildhouse();

        System.out.println("Concrete Wall House constructed successfully");

        System.out.println("********************");

        System.out.println("Going to build Glass Wall House");

        house = new GlassHome();
        house.buildhouse();

        System.out.println("Glass Wall House constructed successfully");
  }

}
