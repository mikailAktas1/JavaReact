package homeWork;

public class Instructor extends User{
	private String InstructorName;
	private int InstructorId;
	private String Password;
	
	
	public String getInstructorName() {
		return InstructorName;
	}
	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}
	public int getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
