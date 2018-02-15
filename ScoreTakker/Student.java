
public class Student implements Comparable<Student>{
	
	Student() {
		name = "";
		score = 0;
	}
	
	
	
	@Override
	public String toString() {
		return "[" + name + " " + score + "]";
	}



	@Override
	public int compareTo(Student arg0) {
		
		return 0;
	}

	private String name;
	private int score;
}
