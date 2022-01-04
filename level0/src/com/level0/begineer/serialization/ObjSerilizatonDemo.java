package com.level0.begineer.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjSerilizatonDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		save obj=new save();
		obj.i=7;
		File f=new File("ObjectDemo.txt");
		FileOutputStream out=new FileOutputStream(f);
		ObjectOutputStream dobj=new ObjectOutputStream(out);
		
		dobj.writeObject(obj);
		
		
		FileInputStream in=new FileInputStream(f);
		ObjectInputStream Oin=new ObjectInputStream(in);
		save s=(save) Oin.readObject();
		System.out.println(obj.i);
	}
}
	class save implements Serializable{
		int i;
	}



