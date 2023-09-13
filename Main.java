
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LiftController liftController=new LiftController(5);
		
		Lift lift1=liftController.assignLift(5,0); 
		
		if(lift1 != null) {
			System.out.println("Lift assigned: L"+(liftController.lifts.indexOf(lift1)+1));
		}else {
			System.out.println("no available lifts");
		}
		
		liftController.maintenanceLift(0);
		
		 Lift lift2 = liftController.assignLift(2, 7);
	        if (lift2 != null) {
	            System.out.println("Lift assigned: L" + (liftController.lifts.indexOf(lift2) + 1));
	        } else {
	            System.out.println("No available lifts.");
	        }
	}

}
