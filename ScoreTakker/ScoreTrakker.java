import java.util.*;
import java.io.*;

/** 
 * 
 * @author Jacob McBee
 * @author Calvin Mak
 */
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
				if(!in.hasNextInt()) throw new NumberFormatException();
				
				score = Integer.parseInt(in.next());
				Student toAdd = new Student(name, score);
				studentList.add(toAdd);
				
			} catch (NumberFormatException e) {
				String error = in.next();
				System.out.println("Invalid score for " + name + ": " + error + "\n");
				
			}
		}
		in.close();
	}
	
	public void printInOrder() {
		Collections.sort(studentList);
		System.out.println("Student Score List");
		for (Student newStudent : studentList) {
			System.out.println(newStudent);
		}
		System.out.print("\n");
		studentList.clear();
	}
	
	public void processFiles() {
		for (String fileName : files) {
			try {
				loadDataFromFile(fileName);
				printInOrder();
			}
			catch (FileNotFoundException e){
				System.out.println("File " + fileName + " not found");
			}
			
		}
	}
	
	public static void main(String args[]) {
		ScoreTrakker tracker = new ScoreTrakker();
		tracker.processFiles();
		
	}
	
	private ArrayList<Student> studentList;
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
}
