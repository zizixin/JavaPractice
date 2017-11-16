package zizixin.JavaPractice.designPattern.iteratorPattern;

public interface Iterator<T> {

	public Boolean hasNext();
	
	public T next();
}
