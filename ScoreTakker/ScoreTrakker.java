import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTrakker {
	
	ScoreTrakker() {
		
	}
	
	public void loadDataFromFile(String fileName) throws FileNotFoundException {

		FileReader myReader = new FileReader(fileName);
		Scanner in = new Scanner(myReader);
		
		while(in.hasNext()) {
			String name = in.next() + " " + in.next();
			int score = in.nextInt();
			Student toAdd = new Student(name, score);
			studentList.add(toAdd);
		}
	}
	
	public void printInOrder();
	public void processFiles(String FileName) throws FileNotFoundException {
		loadDataFromFile(FileName);
		printInOrder();
	}
	
	public static void main(String args[]) {
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles("scores.txt");
	}
	
	private ArrayList<Student> studentList;

}
