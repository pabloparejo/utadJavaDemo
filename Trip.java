package com.utad.prueba;

import java.util.List;

import android.util.Log;

public class Trip {

	private String destination;
	private List<Person> attendees;
	
	public Trip(String destinationArg){
		destination = destinationArg;
	}
	
	public void addAttendant(Person person){
		attendees.add(person);
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public List<Person> getAttendees() {
		return attendees;
	}
	
	public void printAttendees(){
		String out = "Attending:";
		for (int i=0; i==attendees.size(); i++) {
			out += attendees.get(i).toString();
		}
		Log.v("trip", out);
	}

}
