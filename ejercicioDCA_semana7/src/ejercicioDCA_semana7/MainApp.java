package ejercicioDCA_semana7;

import processing.core.PApplet;

public class MainApp {

	public static MainApp app;
	Logica logica;

	public static void main(String[] args) {

		PApplet.main("MainApp");
	}

	public void setup() {

		MainApp.app = this;
		logica = new Logica();

	}

	public void settings() {
		size(1200, 700);
		//hola

	}

	public void draw() {
		background(255);
		

	}

}
