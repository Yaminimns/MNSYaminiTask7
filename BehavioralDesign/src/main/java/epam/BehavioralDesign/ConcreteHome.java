package epam.BehavioralDesign;

public class ConcreteHome extends Home {
	
	@Override
    public void decorateHouse() {
          System.out.println("Decorating Concrete Wall House");
    }
    @Override
    public void paintHouse() {
          System.out.println("Painting Concrete Wall House");
    }
    @Override
    public void constructDoors() {
          System.out.println("Constructing Doors for Concrete Wall House");
    }
    @Override
    public void constructWindows() {
          System.out.println("Constructing Windows for Concrete Wall House");
    }
    @Override
    public void constructWalls() {
          System.out.println("Constructing Concrete Wall for my House");
    }
}
