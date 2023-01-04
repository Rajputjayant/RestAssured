package pojoClassForSeleriazationAndDeSeleriazation;

public class EmployeeDeatailsWithObject {
	// Declare the variable globally
		String Ename;
		String Eid;
		String[] Email;
		int[] PhoneNo;
		String Address;
		Object Spouse;
		
	 // Create Constructor for Intilization
		public EmployeeDeatailsWithObject(String ename, String eid, String[] email, int[] phoneNo, String address,
				Object spouse) {
			super();
			Ename = ename;
			Eid = eid;
			Email = email;
			PhoneNo = phoneNo;
			Address = address;
			//Spouse = spouse;
			this.Spouse=spouse;
		}

		// Setter and getter
		public String getEname() {
			return Ename;
		}

		public void setEname(String ename) {
			Ename = ename;
		}

		public String getEid() {
			return Eid;
		}

		public void setEid(String eid) {
			Eid = eid;
		}

		public String[] getEmail() {
			return Email;
		}

		public void setEmail(String[] email) {
			Email = email;
		}

		public int[] getPhoneNo() {
			return PhoneNo;
		}

		public void setPhoneNo(int[] phoneNo) {
			PhoneNo = phoneNo;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public Object getSpouse() {
			return Spouse;
		}

		public void setSpouse(Object spouse) {
		//	Spouse = spouse;
			this.Spouse=spouse;
		}
		
		
		
		
		
}
