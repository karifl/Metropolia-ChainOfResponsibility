package chainOfResponsibility;

public class Supervisor extends Management {

	private final double payRate = 1.02* minWage; //abstract class value is inherited
	
	
	
	public void processRequest(RaiseRequest request) {
		double demand = request.getRaiseAmount();
		boolean decision = myRight.onMyDescription(demand, payRate);
		if (decision ==true) {
			System.out.println("Supervisor will approve your $" + demand+" payment." );
		} else if(nextOperative != null) {
			nextOperative.processRequest(request);
			
		}
	}


}
