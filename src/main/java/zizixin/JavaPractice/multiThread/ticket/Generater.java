package zizixin.JavaPractice.multiThread.ticket;

import java.util.List;

/**
 * @author zizixin
 *
 * @param <T> target
 * @param <S> seed
 */
public interface  Generater<T,S> {
	
	/**
	 * @param s
	 * @return 通过一个Seed生成一系列目标的List
	 */
	public List<T> GeneraterListBySeed(S s);
	
}
