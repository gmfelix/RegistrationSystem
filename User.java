import java.util.Iterator;
import java.util.Set;

public class User {
	private int ID;
	public String firstName;
	public String lastName;
	private String userName;
	private String password;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static User findUser(Set<User> allUsers, String inputUsername){
		Iterator<User> it = allUsers.iterator();
		while(it.hasNext()){
			User current =it.next();
			if(current.userName == inputUsername){
				return current;
			}
		}
		return null;
	}
	
	public static int login(Set<User> allUsers, String inputUsername, String inputPassword){
		User current = findUser(allUsers, inputUsername);
		if(current!= null){
			if(current.getPassword() == inputPassword){
				switch(current.getClass().getName()){
				case "Student":
					return 1;
				case "Professor":
					return 2;
				case "Registrar":
					return 3;
				default:
					return 0;
				}
			}
		}
		return 0;
	}
	public void ViewClasses() {
	}
}
