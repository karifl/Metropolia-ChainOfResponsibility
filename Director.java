package chainOfResponsibility;

public class Director extends Management {

	
	private final double payRate = 1.05* minWage; //abstract class value is inherited
		
		public void processRequest(RaiseRequest request) {
			double demand = request.getRaiseAmount();
			boolean decision = myRight.onMyDescription(demand, payRate);
			if (decision ==true) {
				System.out.println("Director will approve your $" + demand+" raise." );
			} else if(nextOperative != null) {
				nextOperative.processRequest(request);
				
			}
	


	}

}
