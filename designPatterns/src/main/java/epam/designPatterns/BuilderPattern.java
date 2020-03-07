package epam.designPatterns;

public class BuilderPattern {
	 private final String Pizza; 
	    private final String Burger;
	    private final String Tacos; 
	 
	    private BuilderPattern(FoodBuilder builder) {
	        this.Pizza = builder.Pizza;
	        this.Burger = builder.Burger;
	        this.Tacos = builder.Tacos;
	    }

	    public String getPizza() {
	        return Pizza;
	    }
	    public String getBurger() {
	        return Burger;
	    }
	    public String getTacos() {
	        return Tacos;
	    }
	    
	 
	    @Override
	    public String toString() {
	        return "Order: "+this.Pizza+", "+this.Burger+", "+this.Tacos+", ";
	    }
	 
	    public static class FoodBuilder 
	    {
	        private final String Pizza;
	        private final String Burger;
	        private String Tacos;
	 
	        public FoodBuilder(String Pizza, String Burger) {
	            this.Pizza = Pizza;
	            this.Burger = Burger;
	        }
	        public FoodBuilder Tacos(String Tacos) {
	            this.Tacos = Tacos;
	            return this;
	        }
	        
	        public BuilderPattern build() {
	            BuilderPattern food =  new BuilderPattern(this);
	            validateUserObject(food);
	            return food;
	        }
	        private void validateUserObject(BuilderPattern food) {
	        }
	    }
	    
	    public static void main(String[] args) {
	        BuilderPattern order1 = new BuilderPattern.FoodBuilder("Veg", "Chicken")
	        .Tacos("Cheese")
	        .build();
	     
	        System.out.println(order1);
	     
	        BuilderPattern order2 = new BuilderPattern.FoodBuilder("Cheese", "Tikka")
	        //no tacos
	        .build();
	     
	        System.out.println(order2);
	     
	    }

}
