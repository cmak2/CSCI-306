import java.io.*;
import java.util.*;

public class ScoreTrakker {
	
	ScoreTrakker() {
		studentList = new ArrayList<Student>();
	}
	
	public void loadDataFromFile(String fileName) throws FileNotFoundException {

		FileReader myReader = new FileReader(fileName);
		Scanner in = new Scanner(myReader);
		in.nextLine();
		while(in.hasNext()) {
			String name = in.next() + " " + in.next();
			int score = in.nextInt();
			Student toAdd = new Student(name, score);
			studentList.add(toAdd);
		}
	}
	
	public void printInOrder() {
		Collections.sort(studentList);
		for (Student newStudent : studentList) {
			System.out.println(newStudent);
		}
	}
	
	public void processFiles(String FileName) throws FileNotFoundException{
		loadDataFromFile(FileName);
		printInOrder();
	}
	
	
	public static void main(String args[]) throws FileNotFoundException {
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles("scores.txt");
	}
	
	private ArrayList<Student> studentList;

}
