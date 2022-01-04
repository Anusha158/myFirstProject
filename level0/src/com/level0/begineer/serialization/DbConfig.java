package com.level0.begineer.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class DbConfig {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		File f1=new File("dbconfig.properties");
		OutputStream os=new FileOutputStream(f1);
		
		p.setProperty("url", "http://localhost:3306");
		p.setProperty("username", "anu");
		p.setProperty("pas", "00");
		
		p.store(os, null);
		
		InputStream in=new FileInputStream(f1);
		p.load(in);
				System.out.println("url="+p.getProperty("url"));
				System.out.println("usernme="+p.getProperty("username"));
		
	}
}
