package testRuby;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class MainClass {
	public static void main(String[] args) throws Exception {
		/*System.setProperty("com.sun.script.jruby.loadpath",
				"C:/Users/yangzhec/Downloads/jruby-bin-9.1.6.0/jruby-9.1.6.0/");*/
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("jruby");
		File f = new File("r.rb");
		engine.eval(new BufferedReader(new FileReader(f)));

		Invocable invocable = (Invocable) engine;
		Object tempconverter = invocable.invokeFunction("getTempConverter");

		double degreesCelsius = (Double) invocable.invokeMethod(tempconverter,
				"f2c", 98.6);
		System.out.println(degreesCelsius);

		double degreesFahrenheit = (Double) invocable.invokeMethod(
				tempconverter, "c2f", 100.0);
		System.out.println(degreesFahrenheit);
	}
}
