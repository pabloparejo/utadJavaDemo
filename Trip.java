package com.utad.prueba;

import java.util.ArrayList;

import android.util.Log;

public class Trip {

	private String destination;
	ArrayList<Person> attendees = new ArrayList<Person>();
	
	public Trip(String destinationArg){
		destination = destinationArg;
	}

	public Trip(String destinationArg, ArrayList<Person> attendeesArg){
		destination = destinationArg;
		attendees = attendeesArg;
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
		String out = "Attending: ";

		for (Person item: attendees) {
			Log.v("trip", item);
		}

		Log.v("trip", out);
	}

}
