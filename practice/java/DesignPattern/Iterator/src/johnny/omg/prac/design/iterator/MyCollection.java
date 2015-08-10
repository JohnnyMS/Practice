package johnny.omg.prac.design.iterator;

public class MyCollection implements Collection {
	
	private String[] data = {"A","B","C","D","E"};

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return data[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.length;
	}

}
