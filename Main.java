import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup sg=new StudentGroup(10);

	Date date=new Date(1997,2,10);
	Student s=new Student(559,"niha",date,70.90);

                sg.addFirst(s);

              System.out.println(sg.getStudent(0).getId());






	}

}
