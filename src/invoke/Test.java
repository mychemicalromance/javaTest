package invoke;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws Exception {
		Class<ClassT> clazz = (Class<ClassT>) Class.forName("invoke.ClassT");
		ClassT obj = clazz.newInstance();
		List<String> list = new ArrayList<String>();
		System.out.println(list.getClass().getName());
		
		Method[] methods =  clazz.getDeclaredMethods();
		for(Method m:methods){
			if(m.getName().equals("setName")){
				m.invoke(obj, "xkq");
				System.out.println(m.getParameterTypes()[0].getSimpleName());
			}else if(m.getName().equals("setInfo")){
				m.invoke(obj, "a good girl");
			}
		}
		System.out.println(obj.getName());
		System.out.println(obj.getInfo());
		
	}
}
class ClassT {
	private String name;
	private String info;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}

