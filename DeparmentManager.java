package chainOfResponsibility;
public class DeparmentManager extends Management{

	private final double payRate = 10* minWage; //abstract class value is inherited
	
			
		
		public void processRequest(RaiseRequest request) {
			double demand = request.getRaiseAmount();
			boolean decision = myRight.onMyDescription(demand, payRate);
			if (decision ==true) {
				System.out.println("Deparment manager will approve your $" + demand+" payment." );
			} else if(nextOperative != null) {
				System.out.println("Department manager: I will follow this to my supervisor");
				nextOperative.processRequest(request);
				
			}
		}


}

