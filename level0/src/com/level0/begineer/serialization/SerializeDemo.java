package com.level0.begineer.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		File f=new File("Demo.txt");
		FileOutputStream out=new FileOutputStream(f);
		DataOutputStream dout=new DataOutputStream(out);
		
		dout.writeUTF("success");
		
		
		FileInputStream in=new FileInputStream(f);
		DataInputStream din=new DataInputStream(in);
		String str=din.readUTF();
		System.out.println(str);
	}

}
