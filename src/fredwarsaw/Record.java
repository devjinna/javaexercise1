package fredwarsaw;

import java.util.ArrayList;

public class Record {

	private static ArrayList<Student> record = new ArrayList<>();
	
	// 
	public static void add(String studentName, float grade1, float grade2, float grade3,
						float grade4, float grade5, float grade6, float grade7, float grade8,
						float grade9, float grade10, float grade11, float grade12) {
		
		float[] studentGrades = {grade1, grade2, grade3, grade4, grade5, grade6, grade7,
								grade8, grade9, grade10, grade11, grade12};
		Student student = new Student(studentName, studentGrades);
		record.add(student);
	}
	
	// 
	public static void printStudentInfo() {
		for (float i = 0; i < record.size(); i++) {
			Student student = record.get((int) i);
			student.getStudentGrades();
		}
	}
	
	public static void printGradeAverage() {
		for (int i = 0; i < record.size(); i++) {
			Student student = record.get(i);
			
			if (student.getStudentName().equals(student)) {
				float total = 0;
				
				float[] studentGrades = student.getStudentGrades();
				
				for (int y = 0; y < studentGrades.length; y++) {
					total += studentGrades[y];
				}
				
				float average = total / studentGrades.length;
				
				System.out.println(student + " grade average is" + " " + studentGrades);
			}
		}
	}
	
	public static void main(String[] args) {

		String[] students = {
				"John Doe,22.7,53.6,80.2,87.6,92.7,55,10.4,40.3,91.1,27.1,49.6,79.3",
				"Archie Johnson,86.3,78,45,36.6,52.6,98.2,60.6,26.1,26.2,74.8,84.5,72.6",
				"Josephine Jayeh,87.1,40.1,19.1,99.8,34.5,68.6,25.9,97.6,90.7,59.4,93.1,63.9",
				"George Barclay,68.7,50.4,46.9,43.2,52.4,37.6,81,10.9,36.4,97.2,31.2,87.6",
				"Ellen Jackson,72.8,64.1,40.4,93.6,79,81.1,26.7,50.8,12.7,96.8,84.4,88.9",
				"Togah Nah,11,63.8,60.9,60.4,14.8,72.2,99.9,20.4,60.5,83.3,24.2,68.6",
				"Bigah Toweh,26.8,58.2,44,63.9,70,95.4,77,18.7,73.4,49,18.9,70.3",
				"Galafah Martin,49.3,98.3,55.1,62.3,36.8,74,29.7,80.8,67.4,51.9,20.9,45.5",
				"Siatah Kollie,48.5,34.5,43.9,19.2,53.1,33.7,36.1,29.5,34.4,20.5,69.6,23.8",
				"Numah Yasaw,98.3,13.8,40.1,89.4,58.5,16,20.4,16.3,71.9,15.3,15.9,100",
				"Yodiah Anderson,11.9,75.2,40.9,51.3,74.7,41.7,80.7,26.5,88.4,61.2,22.3,99.7",
				"Kathy Joshuah,98.3,91.1,17.7,66.9,13.9,80.4,20.1,23.6,75.2,22.5,65.8,25.4"
		};
		
		for (int i = 0; i < students.length; i++) {
			String[] part = students[i].split(",");
			
			String studentName = part[0];
			float grade1 = Float.parseFloat(part[1]);
			float grade2 = Float.parseFloat(part[2]);
			float grade3 = Float.parseFloat(part[3]);
			float grade4 = Float.parseFloat(part[4]);
			float grade5 = Float.parseFloat(part[5]);
			float grade6 = Float.parseFloat(part[6]);
			float grade7 = Float.parseFloat(part[7]);
			float grade8 = Float.parseFloat(part[8]);
			float grade9 = Float.parseFloat(part[9]);
			float grade10 = Float.parseFloat(part[10]);
			float grade11 = Float.parseFloat(part[11]);
			float grade12 = Float.parseFloat(part[12]);
			
			Record.add(studentName, grade1, grade2, grade3, grade4, grade5, grade6,
					grade7, grade8, grade9, grade10, grade11, grade12);
		}
		
		printStudentInfo();
		
		printGradeAverage();
	}
}
