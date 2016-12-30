import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.map.LazyMap;


public class TestLazyMap {
	public static void main(String[] args) {
		Map<String,Student> map = LazyMap.lazyMap(new HashMap<String,Student>(), new Transformer<String,Student>(){
			@Override
			public Student transform(String name) {
				Student s = new Student();
				s.setName(name);
				s.setInfo("good boy.");
				return s;
			}
		});
		
		System.out.println(map.size());
		Student s = map.get("yangzhe");
		System.out.println(map.size());
	}
}

class Student{
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
	@Override
	public String toString() {
		return name+":"+info;
	}
}