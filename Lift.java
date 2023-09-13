
public class Lift {
	private int currentFloor;
	private int capacity;
	private boolean underMaintenance;
	
	public Lift(int capacity) {
		this.setCurrentFloor(0);
		this.setCapacity(capacity);
		this.setUnderMaintenance(false);
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isUnderMaintenance() {
		return underMaintenance;
	}

	public void setUnderMaintenance(boolean underMaintenance) {
		this.underMaintenance = underMaintenance;
	}

	public void moveToFloor(int floor) {
		if(!underMaintenance) {
			currentFloor=floor;
		}
		
	}
}
