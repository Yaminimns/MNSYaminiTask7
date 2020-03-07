package epam.designPatterns;

public class LuxuryVacation extends Vacation{
	LuxuryVacation() {
        super(VacationType.LUXURY);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Planning luxury vacation");
    }

}
