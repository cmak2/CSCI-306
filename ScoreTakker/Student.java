/** 
 * 
 * @author Jacob McBee
 * @author Calvin Mak
 */

public class Student implements Comparable<Student>{
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return name + " " + score;
	}

	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student compare) {
		/**
		 * Compares students by name
		 */
		return this.name.compareTo(compare.getName());
			
	}

	private String name;
	private int score;
}
