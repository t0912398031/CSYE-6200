package edu.neu.csye6200.api;

public abstract class AbstractSend {

	public abstract void send();
	public abstract void send(String data);
	public abstract void send(String host, int port, String data);
}
