package zizixin.JavaPractice.javaAlgorithm.sort;

public class QuickSortMultiThread<T extends Comparable<T>> implements SortAbilityTurbo,Runnable{

	
	public void sort(){
		new Thread(this).start();
	}
	
	public QuickSortMultiThread(T[] array){
		this.array = array;
		this.begain = 0;
		this.end = array.length -1;
	}
	
	public QuickSortMultiThread(T[] array,int begain,int end){
		this.array = array;
		this.begain = begain;
		this.end  = end;
	}
	
	public T[] array;
	
	public int begain;
	
	public int end;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int low = this.begain;
		
		int high = this.end;
		
		T sign = this.array[this.begain];
		
		while(low<high){
			while(low<high){
				if(this.array[high].compareTo(sign)>=0){
					high--;
				}else{
					break;
				}
			}
			while(low<high){
				if(this.array[low].compareTo(sign)<=0){
					low++;
				}else{
					break;
				}
			}
			if(low!=high){
				SortUtil.doExchange(this.array, low, high);
			}
			
		}

		if(this.array[low].compareTo(sign)>0){
			SortUtil.doExchange(this.array, this.begain, low-1);
		}
		else{
			SortUtil.doExchange(this.array, this.begain, low);
		}

		
		if(begain<low-1){
			new Thread(new QuickSortMultiThread<>(array, begain, low-1)).start();;
		}
		if(high+1<end){
			new Thread(new QuickSortMultiThread<>(array, high+1, end)).start();
		}
	}
	
}
