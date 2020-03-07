package epam.designPatterns;

public abstract class Vacation {
	public Vacation(VacationType trip) {
        this.trip = trip;
        arrangeParts();
    }
 
    private void arrangeParts() {
    }
 
    // Do subclass level processing in this method
    protected abstract void construct();
 
    private VacationType trip = null;
 
    public VacationType getTrip() {
        return trip;
    }
 
    public void setTrip(VacationType trip) {
        this.trip = trip;
    }

}
