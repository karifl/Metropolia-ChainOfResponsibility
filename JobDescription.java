package chainOfResponsibility;

public class JobDescription {

	
	public boolean onMyDescription(double request, double payLevel) {
		if (request < payLevel) {
			return true;
		} else {
			return false;
		}
	}
}
