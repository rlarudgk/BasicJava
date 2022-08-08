package Task;

public class Task4 { 
	
	public static void main(String[] args) {
		
		int pencils =534;
		int students =30;
		
		int PencilsPerStudents = (pencils / students);
		System.out.println(PencilsPerStudents);
		
		int PencilsLeft = (pencils % students);
		System.out.println(PencilsLeft);
	}

}
