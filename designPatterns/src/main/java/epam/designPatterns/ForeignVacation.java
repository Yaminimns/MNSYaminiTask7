package epam.designPatterns;

public class ForeignVacation extends Vacation{
	ForeignVacation() {
        super(VacationType.FOREIGN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Planning foreign vacation");
       
    }

}
