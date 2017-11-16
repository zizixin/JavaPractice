package zizixin.JavaPractice.hadoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class MyDFSTest {
		public static void main(String[] args) {
			try {
				Configuration conf = new Configuration();
				conf.set("","hdfs://localhost:9000");//fs.default.name
				FileSystem hdfs = FileSystem.get(conf);
				Path path = new Path("in/test3.txt");
				FSDataOutputStream outputStream = hdfs.create(path);
				byte[] buffer = "你好Hello".getBytes();
				outputStream.write(buffer,0,buffer.length);
				outputStream.flush();
				outputStream.close();
				System.out.println("CreateOK");
				}
				catch (IOException e) {
				e.printStackTrace();
				}
		}
}
