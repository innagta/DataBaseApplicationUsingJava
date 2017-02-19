
public class Grade {
	private String sid;
	private String cid;
	private String year;
	private String semester;
	private String grade;
	
	public Grade (String sid, String cid, String year, String semester, String grade){
		this.sid = sid;
		this.cid = cid;
		this.year = year;
		this.semester = semester;
		this.grade = grade;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
}
