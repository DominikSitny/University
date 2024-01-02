package Probeklausur_PfA;

public class Start {

	public static void main(String[] args) {

		Auto car0 = new Auto();
		Auto car1 = new Auto();
		Auto car2 = new Auto();

		Auto[] autoArr = new Auto[3];
		autoArr[0] = car0;
		autoArr[1] = car1;
		autoArr[2] = car2;
		
		for(Auto auto : autoArr) {
			
			if(auto==null) {
				System.out.println("leer");
			}else {
				System.out.println(auto);
			}
			
		}
		
	}

}
