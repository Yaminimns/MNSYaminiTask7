package epam.designPatterns;

public class SmallVacation extends Vacation{
	SmallVacation() {
        super(VacationType.SMALL);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Planning small vacation");
        
    }

}
