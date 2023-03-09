package view;

import controller.Thread_Id;

public class main {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			Thread Thread_Id = new Thread_Id();
			Thread_Id.start();
		}

	}

}
