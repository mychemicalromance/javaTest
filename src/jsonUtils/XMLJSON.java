package jsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLJSON {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("yangzhe", "yanzggg");
		map.put("apge", "aggf");
		XmlMapper xmlMapper  = new XmlMapper();
		ObjectMapper om = new ObjectMapper();
		try {
			String s = xmlMapper.writeValueAsString(map);
			System.out.println(s);
			map = xmlMapper.readValue(s, new TypeReference<Map<String,String>>() {});
			System.out.println(om.writeValueAsString(map));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
