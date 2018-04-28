package edu.neu.csye6200;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class GreetingClient {
	String data = "...";
	public void clientConnect() {
		clientConnect("localhost", 6066);
	}
	public void writeData(String data) {
		this.data = data;
	}
	   public void clientConnect(String hostname, int port) {
	      String serverName = hostname;
//	      int port = Integer.parseInt("6066");
	      try {
	         System.out.println("Connecting to " + serverName + " on port " + port);
	         Socket client = new Socket(serverName, port);
	         
	         System.out.println("Just connected to " + client.getRemoteSocketAddress());
	         OutputStream outToServer = client.getOutputStream();
	         DataOutputStream out = new DataOutputStream(outToServer);
	         
	         out.writeUTF("Hello from " + client.getLocalSocketAddress() + data);
	         InputStream inFromServer = client.getInputStream();
	         DataInputStream in = new DataInputStream(inFromServer);
	         
	         System.out.println("Server says " + in.readUTF());
	         client.close();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	   }
	   public static void demo() {
		   GreetingClient obj = new GreetingClient();
		   obj.clientConnect("localhost", 6066);
	   }
	}