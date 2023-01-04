package pojoClassForSeleriazationAndDeSeleriazation;

public class Spouse {

	
	// Declare the variable globally
		String Sname;
		String Eid;
		String SEmail;
		int SPhoneNo;
		String SAddress;
		
		// Create Constructor for Intilization
		public Spouse(String sname, String eid, String sEmail, int sPhoneNo, String sAddress) {
			super();
			Sname = sname;
			Eid = eid;
			SEmail = sEmail;
			SPhoneNo = sPhoneNo;
			SAddress = sAddress;
		}

		
		//Getter and Setter Method
		public String getSname() {
			return Sname;
		}

		public void setSname(String sname) {
			Sname = sname;
		}

		public String getEid() {
			return Eid;
		}

		public void setEid(String eid) {
			Eid = eid;
		}

		public String getSEmail() {
			return SEmail;
		}

		public void setSEmail(String sEmail) {
			SEmail = sEmail;
		}

		public int getSPhoneNo() {
			return SPhoneNo;
		}

		public void setSPhoneNo(int sPhoneNo) {
			SPhoneNo = sPhoneNo;
		}

		public String getSAddress() {
			return SAddress;
		}

		public void setSAddress(String sAddress) {
			SAddress = sAddress;
		}
		
	
		
		
}
