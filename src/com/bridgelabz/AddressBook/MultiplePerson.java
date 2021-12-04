package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiplePerson {
	
	Map<String, ArrayList<AddressBook>> mapBook = new HashMap<>();

	@Override
	public String toString() {
		return "MultipleAddressBooks [mapBook=" + mapBook + "]";
	}
}