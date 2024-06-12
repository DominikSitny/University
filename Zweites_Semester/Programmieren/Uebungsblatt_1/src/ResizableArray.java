
public class ResizableArray<T> {

	private T[] data;
	
	public ResizableArray(int size) {
		data = (T[]) (new Object[size]);
	}
	
	public void add(int index, T newData) {
		
		if(index >= data.length) {
		 T[] copyData = (T[]) (new Object[index + 1]);
		 copyData[index] = newData;
		 data = copyData;
		}else {
			data[index] = newData;
		}
	}
	
	public void resize(int size) {
		
		T[] copyData = (T[]) (new Object[size]);
		
		for(int i=0;i<size;i++) {
			if(i<data.length) {
				copyData[i] = data[i];
			}
		}
		
		data = copyData;
	}
	
	public String toString() {
		String s = "";
		for(T value : data) {
			s += value + ";";
		}
		return s;
	}
	
}
