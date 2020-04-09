package chainOfResponsibility;

public abstract class Handler {

	
	private Handler nextOperative;	
		
		// TODO Auto-generated constructor stub
	
	public Handler(Handler onCharge) {
		nextOperative = onCharge;
	}
	
	public void handle() {
		if(nextOperative != null) {
			nextOperative.handle();
		}
	}

}
