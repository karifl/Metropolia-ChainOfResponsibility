package chainOfResponsibility;

public class CEO extends Management {
	private final double payRate = 2.0* minWage; //abstract class value is inherited
	
	
	
	public void processRequest(RaiseRequest request) {
		double demand = request.getRaiseAmount();
		boolean decision = myRight.onMyDescription(demand, payRate);
		if (decision ==true) {
			System.out.println("CEO will approve your $" + demand+" raise." );
		} else if(nextOperative != null) {
			nextOperative.processRequest(request);
			
		}else if(demand >= 9000) {
			System.out.println("ARE YOU NUTS?!!");
		}
		else {
			System.out.println("Your request for $" +demand+ " demands a board meeting!");
		}
	}



}
