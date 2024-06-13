import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import org.json.JSONArray;
import org.json.JSONObject;

public class Student implements Comparable<Student>, java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int matrikelNr = (new Random()).nextInt(100_000, 999_999);
	private String vorname;
	private String nachname;
	private String[]telefonNr;
	private Random rand = new Random();
	private static final String[] telefonNrArt = {"Mobil", "Privat", "Fax", "---"};
	
	public Student() {	
		this.telefonNr= new String[]{
				telefonNrArt[
				             this.rand.nextInt(this.telefonNrArt.length-1)+0
				             ],
				"+49" + this.rand.nextInt(9999 - 1000 + 1) + 1000
				};
	}
	
	public Student(boolean defaultStudent) {
		if(defaultStudent) {
		setMatrikelNr(999999999);
		setVorname("---");
		setNachname("---");
		String[]telefonData = {"---", "---"};
		setTelefonNr(telefonData);
		}else {
			new Student();
		}
	}
	
	public int getMatrikelNr() {
		return matrikelNr;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String[] getTelefonNr() {
		return telefonNr;
	}

	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public void setTelefonNr(String[] telefonNr){
		if(Arrays.stream(this.telefonNrArt).anyMatch(telefonNr[0]::equals)) {
			this.telefonNr = telefonNr;
		}else {
			System.out.println("Fehler: Setzen setTelefonNr");
		}
	}

	public int hashValue() {
		return this.hashCode();
	}
	
	//Sortierung nach MatrikelNr; Ue 2 Aufgabe 2 
	@Override
	public int compareTo(Student o) {	
		if(this.matrikelNr > o.matrikelNr) {
			return 1;
		}
		else if(this.matrikelNr == o.matrikelNr) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	/*Sortierung nach TelefonNr; Ue 2 Aufgabe 3c
	@Override
	public int compareTo(Student o) {
		int compare = this.getTelefonNr()[0].compareTo(o.getTelefonNr()[0]);
	    if (compare == 0) {
	        compare = this.getTelefonNr()[1].compareTo(o.getTelefonNr()[1]);
	    }
	    return compare;
				
	}	*/
	
	public static List<Student> getNames() {
		try {
            URL url = new URL("https://narutodb.xyz/api/character?page=1&limit=1000");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            //Getting the response code
            int responsecode = conn.getResponseCode();
            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {
                String inline = "";
                Scanner scanner = new Scanner(url.openStream());
                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine() + "\n";                  
                }
                //Close the scanner
                scanner.close();              
            	List<Student> listStudents = new ArrayList<Student>();
                JSONObject obj = new JSONObject(inline);
                JSONArray arr = obj.getJSONArray("characters");
                for(int i=0;i<arr.length();i++) {
                	String name = arr.getJSONObject(i).getString("name");
                	String[] names = name.split(" ", 2);
                	Student stud = new Student();
                	stud.setVorname(names[0]);
                	if(names.length == 1) {
                		stud.setNachname("");
                	}else {
                		stud.setNachname(names[1]);
                	}
                	listStudents.add(stud);
                }
                Collections.sort(listStudents, new StudentSortByNames());
                return listStudents;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
	
	public String toString() {
		return "Matrikelnummer: " + this.getMatrikelNr() + "\n" + 
				"Vorname: " + this.getVorname() + "\n"+ 
				"Nachname: " + this.getNachname() + "\n"+ 
				"Telefonart: " + this.getTelefonNr()[0] + "\n"+ 
				"Telefonnummer: " + this.getTelefonNr()[1] + "\n";			
	}
	
	
}
