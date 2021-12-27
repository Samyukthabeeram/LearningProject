package com.java.beginner3;

public class Contact {

	private long call;
	private long telephone;
	private String email;
	private long messenger;
	private boolean isMessengerSameAsCall;

	public long getCall() {
		return call;
	}

	public void setCall(long call) {
		this.call = call;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMessenger() {
		return messenger;
	}

	public void setMessenger(long messenger) {
		this.messenger = messenger;
	}

	public boolean isMessengerSameAsCall() {
		return isMessengerSameAsCall;
	}

	public void setMessengerSameAsCall(boolean isMessengerSameAsCall) {
		this.isMessengerSameAsCall = isMessengerSameAsCall;
	}
}
