public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        //asigno valores a los atributos staticos (genericos de la clase)
        Automovil.setTanqueGenerico(50);  // asigno el valor de un tanque generico
        Automovil.setColorPatente("rojo");   // a TODOS los objetos de esta clase les asigna este valor, porque es un atributo static y afecta a todos los objetos

        // Instancio los objetos de la clase Automovil
        Automovil camaro = new Automovil("Chevrolet","Camaro",Automovil.COLOR_ROJO,2.3,30);
        Automovil raptor = new Automovil("Ford","Raptor",Automovil.COLOR_AZUL,3.5,80);
        Automovil ram =new Automovil("RAM","TRex 1500",Automovil.COLOR_GRIS,5.2,100);
        Automovil sandero = new Automovil("Renult","Sandero",Automovil.COLOR_AMARILLO,2.3,50);


        // imprimo en pantalla los atributos de los objetos de la clase Automovil
        System.out.println("\n"+camaro.verDetalle()+"\n"+ camaro);
        System.out.println("\n"+raptor.verDetalle()+"\n"+raptor);
        System.out.println("\n"+ram.verDetalle()+"\n"+ram);
        System.out.println("\n"+sandero.verDetalle()+"\n"+sandero);

        // ejemplo de un metodo estatico (Generico para todas las instancias de la clase) de la case automovil
        System.out.println("Consumo con un tanque generico = " + Automovil.calcularConsumoEstatico(300,60));


        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);


    }
}
