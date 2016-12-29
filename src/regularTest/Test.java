package regularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		/*String str = "export+PATH=$PROBE_HOME:$STORM_HOME/bin:/opt/kubernetes/bin:$JAVA_HOME/bin:$PATH";
		//System.out.println(str);
		Pattern p = Pattern.compile("^export\\+PATH.+\\$STORM_HOME.*$");
		Matcher m = p.matcher(str);
		if(m.find()){
			System.out.println(str);
		}*/
		/*Pattern p = Pattern.compile("^/(?<first>[^/]+)/(.*)$");
		String s = "/errer/eeee";
		Matcher m = p.matcher(s);
		if(m.find()){
			System.out.println(m.group("first"));
			System.out.println(m.group(2));
		}*/
		
		/*String reg = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
		String reg3 = "^((25[0-5])|(2[0-4]\\d)|(1\\d{2})|([1-9]?\\d))$";
		Pattern p = Pattern.compile(reg);
		String s = "13.34.22.123";
		Matcher m = p.matcher(s);
		System.out.println(m.find());*/
		
		/*String line="Linux version 2.6.18-164.el5 (mockbuild@x86-002.build.bos.redhat.com) "
				+ "(gcc version 4.1.2 20080704 (Red Hat 4.1.2-46)) #1 SMP Tue Aug 18 15:51:54 EDT 2009";
		String line2="Linux version 3.10.0-327.el7.x86_64 (builder@kbuilder.dev.centos.org) "
				+ "(gcc version 4.8.3 20140911 (Red Hat 4.8.3-9) (GCC) ) #1 SMP Thu Nov 19 22:10:57 UTC 2015";
		String pattern = "\\([.A-Za-z0-9\\s]+\\(([-.A-Za-z0-9\\s]+)\\)([\\s]+\\(.*\\)[\\s]+)?\\)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		if(m.find()){
			System.out.println("--"+m.group(1)+"--");
		}*/
		
		Pattern p = Pattern.compile("^[-A-Z0-9a-z]+:[0-9]+$");
		String s = "cloud-ui:8080";
		Matcher m = p.matcher(s);
		System.out.println(m.find());
		
	}
}	
