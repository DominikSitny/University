import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentenTableController {
	
	public static void saveDataInTxt(File f, List<Student> list) {
		
		try(FileOutputStream fout = new FileOutputStream(f)){
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			//schreiben
			for(Student stud: list) {
				obj.writeObject(stud);
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static List<Student> readDataFromText(File f) {
		ArrayList<Student> al = new ArrayList<Student>();
	    boolean cont = true;
	        try {
	            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
	            for (;;) {
	                try {
	                    Student stud = (Student) ois.readObject();
	                    al.add(stud);
	                }
	                catch (EOFException exc) {
	                    break;
	                } catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		return al;
	}
	
}
