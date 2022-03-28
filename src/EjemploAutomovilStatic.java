public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        //asigno valores a los atributos staticos (genericos de la clase)
        Automovil.setTanqueGenerico(50);  // asigno el valor de un tanque generico
        Automovil.setColorPatente(Color.BLANCO);   // a TODOS los objetos de esta clase les asigna este valor, porque es un atributo static y afecta a todos los objetos

        // Instancio los objetos de la clase Automovil
        Automovil camaro = new Automovil("Chevrolet","Camaro",Color.ROJO,new Motor(2.3,TipoMotor.BENCINA),new Tanque(30), TipoAutomovil.HATCHBACK);   // agregamos el color con la clase enum o enumerador
        Automovil raptor = new Automovil("Ford","Raptor",Color.AZUL,new Motor(3.5,TipoMotor.BENCINA),new Tanque(80),TipoAutomovil.PICKUP);
        Automovil ram =new Automovil("RAM","TRex 1500",Color.GRIS,new Motor(5.2,TipoMotor.BENCINA),new Tanque(100), TipoAutomovil.PICKUP);
        Automovil sandero = new Automovil("Renult","Sandero", Color.AMARILLO,new Motor(2.3,TipoMotor.BENCINA),new Tanque(50), TipoAutomovil.STATION_WAGON);
        Automovil duster = new Automovil("Renult","Duster", Color.ROJO, new Motor(3.2,TipoMotor.BENCINA), new Tanque(), TipoAutomovil.STATION_WAGON);

        // imprimo en pantalla los atributos de los objetos de la clase Automovil
        System.out.println("\n"+camaro.verDetalle()+ camaro+"\n");
        System.out.println("\n"+raptor.verDetalle()+raptor+"\n");
        System.out.println("\n"+ram.verDetalle()+ram+"\n");
        System.out.println("\n"+sandero.verDetalle()+sandero+"\n");
        System.out.println("\n"+duster.verDetalle()+duster+"\n");

        // ejemplo de un metodo estatico (Generico para todas las instancias de la clase) de la case automovil
        System.out.println("Consumo con un tanque generico = " + Automovil.calcularConsumoEstatico(300,60));
        System.out.println("El consumo de la duster es = " +Automovil.calcularConsumoEstatico(300,70));


        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);


    }
}
