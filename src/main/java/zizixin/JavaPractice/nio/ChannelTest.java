package zizixin.JavaPractice.nio;

import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;

public class ChannelTest {

	public static void main(String[] args) {
		
		
//		try {
//		
//			FileInputStream fin = new FileInputStream("c:\\test.txt");
//			FileChannel inChannel = fin.getChannel();
//
//			ByteBuffer buf = ByteBuffer.allocate(48);
//
//			int bytesRead = inChannel.read(buf);
//			while (bytesRead != -1) {
//
//				System.out.println("Read " + bytesRead);
//				buf.flip();
//	
//				while(buf.hasRemaining()){
//					System.out.print((char) buf.get());
//				} 
//	
//				buf.clear();
//				
//				bytesRead = inChannel.read(buf);
//			}
//			fin.close();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
//		Selector selector = Selector.open();
//		channel.configureBlocking(false);
//		SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
//		while(true) {
//		  int readyChannels = selector.select();
//		  if(readyChannels == 0) continue;
//		  Set selectedKeys = selector.selectedKeys();
//		  Iterator keyIterator = selectedKeys.iterator();
//		  while(keyIterator.hasNext()) {
//		    SelectionKey key = keyIterator.next();
//		    if(key.isAcceptable()) {
//		        // a connection was accepted by a ServerSocketChannel.
//		    } else if (key.isConnectable()) {
//		        // a connection was established with a remote server.
//		    } else if (key.isReadable()) {
//		        // a channel is ready for reading
//		    } else if (key.isWritable()) {
//		        // a channel is ready for writing
//		    }
//		    keyIterator.remove();
//		  }
//		}
		
	}
}
