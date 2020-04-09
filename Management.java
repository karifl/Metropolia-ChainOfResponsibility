package chainOfResponsibility;

public abstract class Management {
	protected double minWage= 1000;
	protected double limit = 999999;
	protected Management nextOperative;
	
	JobDescription myRight = new JobDescription();
	
	public void setSuccessor(Management operative) {
		this.nextOperative = operative;
	}
	
	abstract public void processRequest(RaiseRequest request);
	

}
