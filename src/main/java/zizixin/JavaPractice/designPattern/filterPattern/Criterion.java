package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.List;

public interface Criterion<T> {

	public List<T> critertion(List<T> lists);
	
}
