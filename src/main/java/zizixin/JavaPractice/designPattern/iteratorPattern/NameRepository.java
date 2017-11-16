package zizixin.JavaPractice.designPattern.iteratorPattern;

/**
 * @author zizixin
 * 使用迭代器的好处可以对一个数组在多个线程同时迭代
 */
public class NameRepository implements Container<String>{

	public String[] names ={"personA","personB","personC","personD"};
	
	
	@Override
	public Iterator<String> getIterator() {
		return new NameRepositoryIterator();
	}

	private class NameRepositoryIterator implements Iterator<String>{
		
		int index;

		@Override
		public Boolean hasNext() {
			if(index<names.length){
				return true;
			}else{
				return false;
			}
		}

		@Override
		public String next() {
			if(this.hasNext()){
				return names[index++];
			}else{
				return null;
			}
			
		}
	}
	
}
