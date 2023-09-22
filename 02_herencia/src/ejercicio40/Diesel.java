package ejercicio40;

public class Diesel extends Viaje {
    
    public Diesel(Trayecto trayecto, int cantVagones, int cantMaxPasajeros){
        super(trayecto,cantVagones,cantMaxPasajeros);
    }

    @Override
    public double tiempoDemora() {
        return (trayecto.getDistancia() * trayecto.getCantEstaciones() /2.0 ) + 
        (trayecto.getCantEstaciones() + this.cantMaxPasajeros)/10.0 ;
    }
}
