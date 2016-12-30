import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException{
		/*int i ;int j;int k;
		j = i = 6*5;
		printTwo(k = j,k);
		String s = printTwo(i,j);
		System.out.println(s);*/
		File f = new File("D:/ggg.log");
		if(f.exists()){
			f.delete();
		}
		f.createNewFile();
		//不能new两个，不支持并发
		System.setOut(new PrintStream(new FileOutputStream(f),true));
		System.setErr(System.out);
		//System.setErr(new PrintStream(new FileOutputStream(f),true));
		System.out.println("111111111111");
		System.out.println("3333333333");
		System.out.println("erer");
		System.out.println("erer");
		for(int i = 0;i<100;i++){
			if(i%2 == 0){
				System.err.println("ggghgh");				
			}else{
				System.out.println(Math.random());
			}
		}
		//System.out.flush();
		//System.err.flush();
	}
	
	public static String printTwo(int obj1,int obj2){
		return "";
	}
}
