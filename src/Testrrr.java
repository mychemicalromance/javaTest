import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;


public class Testrrr {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
	    prop.setProperty("server.port", "8080");
	    prop.setProperty("server.context-path", "/");
	    prop.setProperty("spring.datasource.url", "jdbc:mysql://221.178.232.93:3307/springboot-demo?useSSL=false");
	    prop.setProperty("spring.datasource.username", "springboot");
	    prop.setProperty("spring.datasource.password", "12345678");
	    prop.setProperty("spring.datasource.type", "com.zaxxer.hikari.HikariDataSource");
	    prop.setProperty("spring.datasource.driver-class-name", "com.mysql.jdbc.Driver");
	    prop.setProperty("spring.datasource.initial-size", "1");
	    prop.setProperty("spring.datasource.maximum-pool-size", "10");
	    prop.setProperty("spring.datasource.connection-timeout", "5000");
	    prop.setProperty("spring.thymeleaf.cache", "false");
	    prop.setProperty("spring.thymeleaf.mode", "LEGACYHTML5");
	    prop.setProperty("eureka.client.serviceUrl.defaultZone", "http://mscx-eureka-server-mgr.eastdc.cn:82/eureka/,http://mscx-eureka-server-mgr-2.eastdc.cn:82/eureka/");
	    prop.setProperty("eureka.client.registry-fetch-interval-seconds", "10");
	    prop.setProperty("eureka.client.initial-instance-info-replication-interval-seconds", "5");
	    prop.setProperty("eureka.instance.lease-renewal-interval-in-seconds", "10");
	    prop.setProperty("eureka.instance.lease-expiration-duration-in-seconds", "10");
	    prop.setProperty("platform.invokeTrace.enabled", "true");
	    prop.setProperty("platform.invokeTrace.url", "http://invoke-trace.eastdc.cn:82/invoke.do");
	    prop.setProperty("spring.application.name", "spring-boot-demo");
	    prop.setProperty("spring.application.projectName", "mscx");
	    prop.setProperty("logging.level.root", "INFO");
	    prop.setProperty("logging.level.com.digitalchina", "DEBUG");
	    prop.setProperty("cas.loginSccessBackUrl", "http://localhost:8080/login/cas");
	    prop.setProperty("cas.loginUrl", "http://mscxsso.eastdc.cn:82");
	    prop.setProperty("cas.loginSuccessBackUrl", "http://localhost:8080/login/cas");
	    prop.setProperty("cas.providerKey", "key4CasAuthenticationProvider");
	    prop.setProperty("cas.ignoreAuthUrls", "/lib/**,/,/favicon.ico");
	    prop.setProperty("cas.rejectPublicInvocations", "false");
	    prop.setProperty("cas.authPomptType", "true");
	    prop.setProperty("cas.filterProcessesUrl", "/login/cas");
	    prop.setProperty("cas.alwaysTarget", "true");
	    prop.setProperty("cas.targetUrl", "http://localhost:8080");
	    prop.setProperty("cas.redirectCurrentUrl", "false");
	    prop.setProperty("sc.pCode", "demo");
	    prop.setProperty("sc.apiKey", "543df6e9aed348dc85e05593b1c9c24d");
	    prop.setProperty("sc.allApplicationUrl", "http://mscxupms.eastdc.cn:82/api/allApplication.json");
	    prop.setProperty("sc.userInfoUrl", "http://mscxupms.eastdc.cn:82/api/userInfo.json");
	    prop.setProperty("sc.authApplicationUrl", "http://mscxupms.eastdc.cn:82/api/authApplication.json");
	    prop.setProperty("sc.httpConnectionTimeout", "60");
	    for(Map.Entry<Object, Object> entry:prop.entrySet()){
	    	System.out.println(entry.getKey()+"="+entry.getValue());
	    }
	    
	}
}
