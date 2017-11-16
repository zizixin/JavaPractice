package zizixin.JavaPractice.hadoop;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class ReduceClass extends Reducer{  
	 
		
	@Override
	protected void reduce(Object arg0, Iterable values, Context context) throws IOException, InterruptedException {
		  Text key = (Text)arg0;
		  int sum = 0;  
		  Iterator valuesIt = values.iterator();  
		  while(valuesIt.hasNext()){  
			  sum = sum + ((IntWritable) valuesIt.next()).get();  
	      }
	      context.write(key, new IntWritable(sum));  
	}
	
	
//    protected void reduce(Text key, Iterable values,Context context)  throws IOException, InterruptedException {  
//      
//      
//    }     
}  