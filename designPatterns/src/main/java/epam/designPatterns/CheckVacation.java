package epam.designPatterns;

public class CheckVacation {
	public static void main(String[] args) {
        System.out.println(VacationFactory.planTrip(VacationType.SMALL));
        System.out.println(VacationFactory.planTrip(VacationType.FOREIGN));
        System.out.println(VacationFactory.planTrip(VacationType.LUXURY));
    }
}
