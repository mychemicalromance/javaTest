package nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NIODeleteLine {
	public static void main(String[] args) throws IOException {
		
		//删除行号
		int deleteLineNumber = 17;
		try(
				RandomAccessFile raf = new RandomAccessFile
				("C:\\Users\\yangzhec\\Desktop\\new 15.txt","rw");
				FileChannel fc = raf.getChannel();){
				ByteBuffer b = ByteBuffer.allocate(10);
				int i = 0;
				int length;
				int start = 0;
				int end = 0;
				String s = "\n";
				byte line = s.getBytes()[0];
				int totalLine = 0;
				while((length = fc.read(b))!=-1){
					long position = fc.position();
					b.flip();
					byte[] n = new byte[length];
					System.arraycopy(b.array(), 0, n, 0, length);
					for(int m=0;m<n.length;m++){
						if(n[m] == line){
							totalLine++;
							if(totalLine == deleteLineNumber -1){
								start = (int) (position - length + m +1);
							}
							if(totalLine == deleteLineNumber){
								end = (int) (position - length + m);
							}
						}
					}
					i++;
				}
				
				System.out.println(start);
				System.out.println(end);
				
				MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, start, end - start +1);
				/*for(int j = 0;j<end-start+1;j++){
					byte src = mbb.get(j);
					System.out.println(src);
					if(src != line){
						mbb.put(j,null);
					}
				}*/
				/*for(int j = 0;j<end-start+1;j++){
					byte src = mbb.get(j);
					System.out.println(src);
					mbb.put(j,(byte)-1);
				}
				mbb.position(0);
				mbb.limit(0);*/
				mbb.force();
				
		}
	}
}
