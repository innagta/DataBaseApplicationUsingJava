public class Course {
	private String cid;
	private String cName;
	private int numOfCredits;
	
	public Course (String cid, String cName, int numOfCredits){
		this.cid = cid;
		this.cName = cName;
		this.numOfCredits = numOfCredits;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCName() {
		return cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public int getNumOfCredits() {
		return numOfCredits;
	}

	public void setNumOfCredits(int numOfCredits) {
		this.numOfCredits = numOfCredits;
	}
	
	
}
