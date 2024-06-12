
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentenverwaltung<Student> stdArr = new Studentenverwaltung<Student>();
		
		Student s = new Student();
		
		stdArr.add(new Student());

		stdArr.add(new Student());
		
		stdArr.showAll();
		
		System.out.println("----");
		
		stdArr.remove(s);
	
		
		stdArr.showAll();
	}

}
