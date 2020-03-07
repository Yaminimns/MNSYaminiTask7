package epam.designPatterns;

public class VacationFactory {
	public static Vacation planTrip(VacationType trip) {
        Vacation vac = null;
        switch (trip) {
        case SMALL:
            vac = new SmallVacation();
            break;
 
        case FOREIGN:
            vac = new ForeignVacation();
            break;
 
        case LUXURY:
            vac = new LuxuryVacation();
            break;
 
        default:
            break;
        }
        return vac;
    }

}
