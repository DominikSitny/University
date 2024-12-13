import java.util.Stack;

public class Befehlshistorie {

	private Stack<IBefehl> befehle = new Stack<IBefehl>();
	
	public void addBefehl(IBefehl befehl) {
		this.befehle.push(befehl);
	}

	public IBefehl undo(IBefehl befehl) {
		if(befehl == this.befehle.get( befehle.size() -1 )) {
			System.out.println(befehl.toString() + " wurde rückgängig gemacht");
			return befehle.pop();
		}else {
			return null;
		}
	}
	
	public void getAllBefehle() {
		System.out.println("Befehlshistorie:");
		for(IBefehl b : this.befehle) {
			System.out.println(" " +b.toString());
		}
	}
}
