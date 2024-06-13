import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>studList = new ArrayList<Student>();
		
		Student stud1 = new Student();
			stud1.setNachname("Sitny");
			stud1.setVorname("Dominik");
		Student stud2 = new Student();
			stud2.setNachname("Sitny");
			stud2.setVorname("Jennifer");
		Student stud3 = new Student();
			stud3.setNachname("Müller");
			stud3.setVorname("Thomas");
		
		studList.add(stud1);
		studList.add(stud2);
		studList.add(stud3);
		
		File f = new File("/Users/dominiksitny/Development/University/Zweites_Semester/Programmieren/Uebungsblatt_4/src/Test.dat");
		try(FileOutputStream fout = new FileOutputStream(f)){
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			//schreiben
			obj.writeObject(studList);
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		try(FileInputStream fout = new FileInputStream(f)){
			ObjectInputStream obj = new ObjectInputStream(fout);
			//lesen
			try {
				ArrayList<Student> data = (ArrayList<Student>)obj.readObject();
				System.out.println("Test:");
				for(Student stud: data) {
					System.out.println("Nachname: " + stud.getNachname() + " Vorname: " + stud.getVorname());
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}

}
