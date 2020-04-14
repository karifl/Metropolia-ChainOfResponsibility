package chainOfResponsibility;

public class VicePresident extends Management {

	private final double payRate = 50* minWage; //abstract class value is inherited
	
	
	
	public void processRequest(RaiseRequest request) {
		double demand = request.getRaiseAmount();
		boolean decision = myRight.onMyDescription(demand, payRate);
		if (decision ==true) {
			System.out.println("Vice president will approve your $" + demand+" payment." );
		} else if(nextOperative != null) {
			System.out.println("Vice president: I will follow this to my supervisor");
			nextOperative.processRequest(request);
			
		}
	}



}
