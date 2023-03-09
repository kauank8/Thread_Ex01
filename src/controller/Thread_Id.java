package controller;

public class Thread_Id extends Thread {
	
	public Thread_Id() {
		// TODO Auto-generated constructor stub
	}
	// Gera um id para uma Thread;
	public void run() {
		System.out.println("Thread #" + getId());
	}

}
