import java.util.*;
import java.io.*;

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
			int score = -1;
			try {
				score = in.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("Error: " + e);
			}
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
	
	private ArrayList<Student> studentList;
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
}
