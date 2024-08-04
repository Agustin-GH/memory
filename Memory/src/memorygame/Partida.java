package memorygame;
import java.time.*;


//Variables de Partida
//Las variables tipo "Duration" son temporales. Aun tenemos que investigar cual opción le corresponde más. 
public class Partida {

	private String nombreJugador;
	private int idPartida;
	private Duration tiempoFinal;
	private Duration temporizador;
	
	


	//Constructor. No estoy seguro de si habría que ponerlo en Partida.
	public Partida(String nombreJugador, int idPartida, Duration tiempoFinal, Duration temporizador) {
	    this.nombreJugador = nombreJugador;
	    this.idPartida = idPartida;
	    this.tiempoFinal = tiempoFinal;
	    this.temporizador = temporizador;
		}



	//Getters y Setters. ¿Lo quieren separar en primero Getters y luego Setters? x2
	public String getNombreJugador() {
		return nombreJugador;
	}


	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}


	public int getIdPartida() {
		return idPartida;
	}


	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}


	public Duration getTiempoFinal() {
		return tiempoFinal;
	}


	public void setTiempoFinal(Duration tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}


	public Duration getTemporizador() {
		return temporizador;
	}


	public void setTemporizador(Duration temporizador) {
		this.temporizador = temporizador;
	}
	
	
}

