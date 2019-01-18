package fredwarsaw;

public class Student {
	private String studentName;
	private float[] studentGrades;
	
	public Student(String studentName, float[] studentGrades) {
		super();
		this.studentName = studentName;
		this.studentGrades = studentGrades;
	}
	
	public void print() {
		System.out.printf(studentName, studentGrades);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float[] getStudentGrades() {
		return studentGrades;
	}
	public void setStudentGrades(float[] studentGrades) {
		this.studentGrades = studentGrades;
	}
	
	
}
