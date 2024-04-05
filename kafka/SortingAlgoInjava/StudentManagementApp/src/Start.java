import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to student management app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to add student");
			System.out.println("presss 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit the app");
			int c = Integer.parseInt(br.readLine());
			if(c==1) {
				//code to add student
				System.out.println("enter user name:");
				String name =br.readLine();
				System.out.println("enter user phone:");
				String phone = br.readLine();
				System.out.println("enter user city:");
				String city = br.readLine();
				//create student object//
				Student st = new Student(name, phone, city);
				boolean answer =StudentDao.InsertStudentToDb(st);
				if(answer) {
					System.out.println("student is added successfully");
				}else {
					System.out.println("something went wrong...try again");
				}
				System.out.println(st);
				
			}else if(c==2) {
				//code to delete student
				System.out.println("enter student id to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("entry of student deleted successfully");
				}else {
					System.out.println("something went wrong...try again");
				}
			}else if(c==3) {
				
				//code to display student
				StudentDao.showAllStudents();
			}else if(c==4) {
				//exit
				break;
			}else {
				
			}
		}
		System.out.println("thank you for using may appalication");
		System.out.println("see you soon***Bye!");
		

	}

}
