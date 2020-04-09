package chainOfResponsibility;

public class RaiseRequest {

		protected double raise;
		protected String reason;
		
		public RaiseRequest(double raise, String reason) {
			this.raise = raise;
			this.reason = reason;
	
		}
		public void setRaiseAmount(double amount) {
			raise = amount;
		}
		
		public double getRaiseAmount() {
				return raise;
			}
		
		public void setPurpose(String why) {
			reason = why;
		}
		
		public String getPurpose() {
			return reason;
		}
		
		}
		

