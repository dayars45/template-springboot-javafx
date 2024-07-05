package com.dayars45.mynote;

import com.dayars45.mynote.config.JavaFxApplication;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
//	Initializer Springboot javafx
	public static void main(String[] args) {
		Application.launch(JavaFxApplication.class, args);
	}
}
