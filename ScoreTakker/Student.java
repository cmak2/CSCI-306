public class Student implements Comparable<Student>{
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "[" + name + " " + score + "]";
	}

	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student compare) {
		
		return this.name.compareTo(compare.getName());
			
	}

	private String name;
	private int score;
}
