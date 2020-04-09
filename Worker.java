package chainOfResponsibility;

public class Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaiseRequest Carl = new RaiseRequest(2000, "long nights");
		
		CEO Trump = new CEO();
		Director Schumer = new Director();
		Supervisor Slick = new Supervisor();

		Slick.setSuccessor(Schumer);
		Schumer.setSuccessor(Trump);
		Slick.processRequest(Carl);
	}

}
