package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.List;

/**
 * @author zizixin
 *
 *  通过实际效果来看，这个是没有必要的
 *
 */
public interface PersonCriterion extends Criterion<Person>{

	@Override
	public List<Person> critertion(List<Person> sources);

}
