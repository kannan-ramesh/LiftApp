import java.util.ArrayList;
import java.util.List;

public class LiftController {

	List<Lift> lifts;
	
	public LiftController(int numLifts) {
			lifts=new ArrayList<>();
			
			for(int i=0;i<numLifts;i++) {
				lifts.add(new Lift(10));
			}
		}

	public Lift assignLift(int sourceFloor, int destinationFloor) {
		List<Lift> availableLifts = new ArrayList<>();
		
		for(Lift lift:lifts) {
			if(!lift.isUnderMaintenance()) {
				availableLifts.add(lift);
			}
		}
		
		Lift nearstLift=null;
		int minDistance=Integer.MAX_VALUE;
		
		for(Lift lift:availableLifts) {
			int distance=Math.abs(lift.getCurrentFloor()-sourceFloor);
			
			if(distance<minDistance) {
				minDistance=distance;
				nearstLift=lift;
			}
		}
		
		if(nearstLift != null) {
			nearstLift.moveToFloor(sourceFloor);
			return nearstLift;
		}else {
			return null;
		}
	}

	public void maintenanceLift(int liftIndex) {
		if(liftIndex >= 0 && liftIndex < lifts.size()) {
			lifts.get(liftIndex).setUnderMaintenance(true);
		}
		
	}
}
