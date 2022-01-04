package com.level0.begineer.serialization;

import java.util.ArrayList;
import java.util.List;

public class HomeXML {
	
	List<Rooms> rm= new ArrayList<Rooms>();

	

	public List<Rooms> getRm() {
		return rm;
	}

	public void setRm(List<Rooms> rm) {
		this.rm = rm;
	}

	@Override
	public String toString() {
		return "HomeXML [rm=" + rm + "]";
	}

}
