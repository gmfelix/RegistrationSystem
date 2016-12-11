package regPrototype;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Iterator;


public class Student extends User{
	public float GPA;
	public int hoursCompleted; 
	public Set<Course> currentCourses = new HashSet<Course>();
	public Set<Course> coursesCompleted = new HashSet<Course>();
	public int dropsAvailable;
	public int requiredHoursToGraduate = 120;
	
	public Student(String firstName, String lastName, String userName, String password, Set<Student> allStudents){
		Random rand = new Random();
		boolean uniqueLoop = true;
		int tries = 0;
		int tempId = -1;
		while(uniqueLoop && tries < 100){
			tempId = rand.nextInt((83333333 - 80000000) + 1) + 80000000;
			boolean match = false;
			tries++;
			Iterator<Student> it = allStudents.iterator();
			while(it.hasNext()){
				Student current = it.next();
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
		this.GPA = 4;
		this.hoursCompleted = 0;
		dropsAvailable = 6;
	}
	public static Student findStudent(Set<Student> allStudents, String userName){
		Iterator<Student> it = allStudents.iterator();
		while(it.hasNext()){
			Student current = it.next();
			if(current.getUserName().equals(userName)){
				return current;
			}
		}
		return null;
	}
	
	public void addCourse(Set<Course> allCourses, String courseName){
		if(currentCourses.size() > 6){
			System.out.println("You can't take more than 6 courses!");
			return;
		}
		Course toBeAdded = Course.findCourse(allCourses, courseName);
		if(toBeAdded != null && toBeAdded.activeStudents < toBeAdded.studentCap){
			this.currentCourses.add(toBeAdded);
			toBeAdded.students.add(this);
			toBeAdded.activeStudents++;
		}
	}
	
	public void dropCourse(Set<Course> allCourses, String inputCourse){
		if(dropsAvailable > 0){
			Course courseToDelete = Course.findCourse(allCourses, inputCourse);
			this.currentCourses.remove(courseToDelete);
			this.dropsAvailable--;
		}
	}
	
	public void viewTranscript(){
		Iterator<Course> it = this.coursesCompleted.iterator();
		while(it.hasNext()){
			Course current = it.next();
			System.out.println("Course name: " +current.name);
			System.out.println("CRN: "+current.CRN);
			System.out.println("Hours: "+current.hours);
			if(current.passed){
				System.out.println("Completed");
			}else{
				System.out.println("Failed");
			}
		}
		System.out.println();
		System.out.println("Total Hours: " +this.hoursCompleted);
	}
	
	public void viewWaitingList(Set<Course> allCourses, String inputCourse){
		Course current = Course.findCourse(allCourses, inputCourse);
		System.out.println("Available spots in the waiting list:" +current.activeWaitingList);
	}
	
	public void registerWaitingList(Set<Course> allCourses, String inputCourse){
		Course current = Course.findCourse(allCourses, inputCourse);
		if(current.activeWaitingList < current.waitingListCap){
			current.waitingList.add(this);
			current.activeWaitingList++;
		}
	}
	
	public void viewClasses(){
		Iterator<Course> it = this.currentCourses.iterator();
		while(it.hasNext()){
			Course current = it.next();
			System.out.println("Course name: "+current.name);
			System.out.println("CRN: "+current.CRN);
			System.out.println("Professor: "+current.teacher.lastName+", "+current.teacher.firstName);
		}
	}
	
	public int getDropsLeft(){
		return this.dropsAvailable;
	}
}
