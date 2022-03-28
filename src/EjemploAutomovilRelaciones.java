public class EjemploAutomovilRelaciones {
    public static void main(String[] args) {
        Persona conductor = new Persona("Libardo", "Lozano");

        Automovil raptor = new Automovil("Ford","Raptor", Color.AZUL, new Motor(3.5, TipoMotor.BENCINA), new Tanque(100), TipoAutomovil.PICKUP,conductor);

        Rueda [] rue = new Rueda[5];
        for (int i = 0; i <rue.length ; i++) {
            raptor.addRueda(new Rueda("Pirelli",16,7.5));
        }

        System.out.println("\n"+ raptor + raptor.verDetalle() + raptor.desc(raptor.getTipo())+raptor.getRueda()+ "\n");


    }
}
