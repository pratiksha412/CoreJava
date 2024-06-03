package exception1;
class Student {
	String name;
	int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}

class ClassRoom {
	public String registerStudent(Student student) {
		if (!(student.name.matches(".*[A-Z].*"))) {
			return "Block letters needed";
		}
		if (student.score < 0 || student.score > 100) {
			return "Invalid score";
		}
		return "Registered";

	}

	public String studentCard(String card) {
		if (card.matches("\\d+")) {
			return "Invalid card";
		}

		return "Valid card";
	}



}

public class Registration {

	public static void main(String[] args) {
		Student s1 = new Student("P", 6);
		ClassRoom cm = new ClassRoom();
		
	System.out.println(cm.registerStudent(s1));	
	}

	}

