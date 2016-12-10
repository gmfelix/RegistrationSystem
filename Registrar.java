import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Registrar extends User{
	
	public Registrar(String firstName, String lastName, String userName, String password, Set<Registrar> allRegistrars){
		Random rand = new Random();
		boolean uniqueLoop = true;
		int tries = 0;
		int tempId =-1;
		while(uniqueLoop && tries < 100){
			tempId = rand.nextInt((86666666 - 83333333) + 1) + 83333333;
			boolean match = false;
			tries++;
			Iterator<Registrar> it = allRegistrars.iterator();
			while(it.hasNext()){
				Registrar current = it.next();
				if(current.firstName == firstName && current.lastName == lastName){
					setID(-1);
					return;
				}
				if(current.getID() == tempId)
					match = true;
				if(match)
					uniqueLoop = true;
				else
					uniqueLoop = false;	
			}
		}
		setID(tempId);
		this.firstName = firstName;
		this.lastName = lastName;
		setUserName(userName);
		setPassword(password);
	}
	public void addNewCourse(String name, String department, Professor teacher, int waitingListCap, int studentCap, int hours, Set<Course> allCourses){
		allCourses.add(new Course(name, department, teacher, waitingListCap, studentCap, hours, allCourses));
	}
	public void registerStudentClasses(Student toBeAdded, Course courseToAdd){
		toBeAdded.currentCourses.add(courseToAdd);
	}
	public void registerNewStudent(String firstName, String lastName, String userName, String password, Set<Student> allStudents){
		allStudents.add(new Student(firstName, lastName, userName, password, allStudents));
	}
}
