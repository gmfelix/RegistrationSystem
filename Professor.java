import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Professor extends User	{
	public String department;
	public Set<Course> CoursesTaught = new HashSet<Course>();
	
	public Professor(String firstName, String lastName, String userName, String password, String department, Set<Professor> allProfessors){
		Random rand = new Random();
		boolean uniqueLoop = true;
		int tries = 0;
		int tempId = -1;
		while(uniqueLoop && tries < 100){
			tempId = rand.nextInt((86666666 - 83333333) + 1) + 83333333;
			tries++;
			boolean match = false;
			Iterator<Professor> it = allProfessors.iterator();
			while(it.hasNext()){
				Professor current = it.next();
				if(current.firstName == firstName && current.lastName == lastName){
					setID(-1);
					return;
				}
				if(match)
					uniqueLoop = true;
				else
					uniqueLoop = false;
				if(current.getID() == tempId)
					match = true;
				
			}
		}
		setID(tempId);
		this.firstName = firstName;
		this.lastName = lastName;
		setUserName(userName);
		setPassword(password);
		this.department = department;
	}
	public void viewClasses(){
		Iterator<Course> it = this.CoursesTaught.iterator();
		while(it.hasNext()){
			Course current = it.next();
			System.out.println("Course name: "+current.name);
			System.out.println("CRN: "+current.CRN);
			System.out.println("Professor: "+current.teacher.lastName+", "+current.teacher.firstName);
		}
	}
	
	public void dropStudent(Set<Course> allCourses,Set<Student> allStudents, String courseName, int ID){
		Course examinedCourse = Course.findCourse(allCourses, courseName);	
		Student examinedStudent = Student.findStudent(allStudents, ID);
		examinedCourse.students.remove(examinedStudent);
	}
	public void gradeCourses(){
		Iterator<Course> courseIt = this.CoursesTaught.iterator();
		while(courseIt.hasNext()){
			Course currentCourse = courseIt.next();
			Iterator<Student> studentIt = currentCourse.students.iterator();
			while(studentIt.hasNext()){
				boolean pass;
				Student currentStudent = studentIt.next();
				System.out.println("Pass or fail?");
				
				//****************************STUB, Plug-in the GUI to get this value***************************************
				
				pass = true;
				
				//
				if(pass){
					currentStudent.hoursCompleted += currentCourse.hours;
					currentStudent.coursesCompleted.add(currentCourse);
				}
			}
		}
	}
}
