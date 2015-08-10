package johnny.omg.prac.design.observer;

public interface Observable {
	
	public void add(Observer ob);
	public void del(Observer ob);
	public void notifyAllObs();

}
