package Proyecto;

import java.time.Duration;
import java.time.LocalDateTime;

public class partida {
private int idpartida;
private LocalDateTime incio;
private LocalDateTime fin;

public void iniciarpartida() {
	incio=LocalDateTime.now();
}
public void terminapartida() {
	fin=LocalDateTime.now();
}
public Duration calcularduracion() {
	if (incio!=null && fin !=null) {
		return Duration.between(incio, fin);
		
	} else {
		return Duration.ZERO;
	}
	
}
public void mostrarduracion () {
	Duration duracion = calcularduracion();
	long minutos = duracion.toMinutes();
	long segundos = duracion.getSeconds();
	System.out.println("Duracion en minutos" + minutos + segundos + "segundos");
}
}
