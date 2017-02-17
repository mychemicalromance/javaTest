package collections;

import org.apache.commons.collections4.keyvalue.DefaultMapEntry;

import com.alibaba.fastjson.JSON;

public class Test {
	public static void main(String[] args) {
		 DefaultMapEntry<Long,Long> defaultMapEntry = new DefaultMapEntry<Long, Long>(100L,100L);
	     System.out.println(JSON.toJSONString(defaultMapEntry));
	}
}
