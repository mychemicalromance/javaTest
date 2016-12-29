import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.map.LazyMap;


public class TestLazy {
	public static void main(String[] args) {
		Transformer tf = new Transformer(){
			@Override
			public Object transform(Object arg0) {
				return null;
			}
		};
		Map map = LazyMap.decorate(new HashMap(), tf);
		
	}
}