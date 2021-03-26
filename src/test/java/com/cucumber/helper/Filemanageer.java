package com.cucumber.helper;

import java.io.IOException;

public class Filemanageer {
	public static Filemanageer frm;

	private Filemanageer() {
		System.out.println("dinsh");
	}

	public static Filemanageer instance() {
		
		if (frm==null) {
			 frm = new Filemanageer();	
		}
		return frm;

	}

	public static Configure_property config() throws IOException  {
		Configure_property cr = new Configure_property();
		return cr;

	}
}
