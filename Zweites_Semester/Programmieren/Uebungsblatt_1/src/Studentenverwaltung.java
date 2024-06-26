import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Nur die Funktionen: 
 * 	- size()
 *  - add(E e)
 *  - remove(E e)  
 *  sind aus dem List-Interface implementiert
 */
public class Studentenverwaltung<E> implements List<E>{

	private Student[] studentArr = new Student[0];
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return studentArr.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return studentArr;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		try {
			Student[] copyStudArr = new Student[studentArr.length + 1];
			int i = 0;
			for(Student s : studentArr) {
				copyStudArr[i] = s;
				i++;
			}
			copyStudArr[studentArr.length] = (Student)e;	
			studentArr = copyStudArr;
			return true;
		}catch(Exception exc) {
			return false;
		}
	}

	@Override
	public boolean remove(Object o) {
		try {
			Student[] copyStudArr = new Student[studentArr.length - 1];
			boolean startCopy = false;
			for(int i = 0; i<studentArr.length;i++) {
				if(o.equals(studentArr[i])) {	
					for(int y = i; y<studentArr.length;y++) {		
						if(y+1 == studentArr.length) {
							break;
						}else {
							copyStudArr[y] = studentArr[y+1];
						}
					}				
					break;				
				}
				copyStudArr[i] = studentArr[i];
			}
			studentArr = copyStudArr;		
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void showAll() {
		for(Student s : studentArr) {
			System.out.println(s + ";");
		}
	}

}
