package ejercicio40;

public class Main {

    static public void main(String[] args){
      
        Trayecto bariloche = new Trayecto("CABA","Bariloche",1500,5);

        Viaje barilocheDiesel = new Diesel(bariloche, 10, 500);

        System.out.println(barilocheDiesel.tiempoDemora());
  
    }
}
