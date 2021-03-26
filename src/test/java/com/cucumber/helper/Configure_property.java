package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configure_property {
	public static Properties p;


public Configure_property() throws IOException {
	
	  File f = new File(
	  "C:\\Users\\Mani\\eclipse-workspace\\T_Cucumber\\src\\test\\java\\com\\cucumber\\properties\\Configuration.properties"); 
	//  FileInputStream fis = new FileInputStream(f);
	FileReader fis= new FileReader(f);
	p = new Properties();
	p.load(fis);
}

public static String brow() {
	String brow = p.getProperty("browser");
	//System.out.println(brow);
	return brow;
}
public static String url() {
String url = p.getProperty("url");

//System.out.println(url);
return url;
}
public static String username() {
	String username = p.getProperty("username");
	//System.out.println(username);
	return username;
}
public static String password() {
	// TODO Auto-generated method stub
String pass= p.getProperty("password");
//System.out.println(pass);
return pass;
}


}
