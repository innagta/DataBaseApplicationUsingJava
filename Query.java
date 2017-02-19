
public class Query {

	public static void main(String[] args) {
		Tables database = new Tables();
		database.insertStudent(new Student ("WS100", "Anton Tremblay", "Web Services and Applications", "a_tremblay@yahoo.com"));
		database.insertStudent(new Student ("SS200", "Olivia Wilson", "Software Systems", "o_wilson@gmail.com"));
		database.insertStudent(new Student ("CG300", "Lucas Gagnon", "Computer Games", "l_gagnon@yahoo.com"));
		database.insertStudent(new Student ("IS400", "Liam Taylor", "Information Systems", "l_taylor@gmail.com"));
		database.insertStudent(new Student ("CA500", "Emma Williams", "Computation Arts", "e_williams@gmail.com"));
			
		database.insertCourse(new Course ("COMP 353", "Databases", 4));
		database.insertCourse(new Course ("COMP 352", "Data Structures and Algorithms", 3));
		database.insertCourse(new Course ("COMP 335", "Introduction to Theoretical Computer Science", 3));
		database.insertCourse(new Course ("COMP 346", "Operating Systems", 4));
		database.insertCourse(new Course ("COMP 354", "Introduction to Software Engineering", 4));
		
		database.insertGrade(new Grade ("WS100", "COMP 352", "2017", "Winter", "A-"));
		database.insertGrade(new Grade ("WS100", "COMP 353", "2017", "Winter", "B-"));
		database.insertGrade(new Grade ("SS200", "COMP 335", "2017", "Winter", "A"));
		database.insertGrade(new Grade ("SS200", "COMP 346", "2016", "Fall", "B+"));
		database.insertGrade(new Grade ("CG300", "COMP 353", "2016", "Winter", "A-"));
		database.insertGrade(new Grade ("CG300", "COMP 335", "2017", "Fall", "B"));
		database.insertGrade(new Grade ("IS400", "COMP 346", "2017", "Winter", "B-"));
		database.insertGrade(new Grade ("IS400", "COMP 354", "2017", "Winter", "A+"));
		database.insertGrade(new Grade ("CA500", "COMP 353", "2016", "Summer", "C-"));
		database.insertGrade(new Grade ("CA500", "COMP 352", "2016", "Winter", "D-"));
		
		System.out.println(database.output()); //List the Name, ID, and grade of every student who has taken the Databases course.
		                                       //The method is defined in Tables.java
		
		
	}

}
