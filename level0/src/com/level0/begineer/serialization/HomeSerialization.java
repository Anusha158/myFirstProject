package com.level0.begineer.serialization;


import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HomeSerialization {
	public static void main(String[] args) {
	
	Rooms bed1=new Rooms("bedroom",1);
	Rooms toilet1=new Rooms("toilet",1);
	
	Rooms bed2=new Rooms("bedroom",2);
	Rooms toilet2=new Rooms("toilet",2);
	
	ArrayList<Rooms> r1=new ArrayList<>();
	r1.add(bed1);
	r1.add(toilet1);
	ArrayList<Rooms> r2=new ArrayList<>();
	r1.add(bed2);
	r1.add(toilet2);
		
	HomeXML home=new HomeXML();
	home.setRm(r1);
	home.setRm(r2);
	File f=new File("home.xml");
	XMLEncoder encoder=null;
	encoder=new XMLEncoder();
	/* need to complete */
	}
}
