package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	public String getPropertydata(String key) throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyfilepath);
		p.load(fis);
		String appURL = p.getProperty("url");
		return p.getProperty(key);
	}

}
