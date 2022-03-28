public class EjemploAutomovilStaticEnum {
    public static void main(String[] args) {


        // creamos clases relacionadas para agregar los datos de los atributos de la clase automovil y esa clase la instanciamos en esta clase la clase main

        Automovil raptor = new Automovil("Ford","Raptor",
                Color.AZUL,new Motor(3.5, TipoMotor.BENCINA),
                new Tanque(100),TipoAutomovil.PICKUP);

        System.out.println("\n"+raptor+raptor.verDetalle()+
                raptor.desc(TipoAutomovil.PICKUP)+"\n");




        // ver constantes del enum mediante un foreach
        TipoAutomovil [] tipos = TipoAutomovil.values();

        for (TipoAutomovil tip:tipos){
            System.out.print(tip.getNombre()+", "+tip.getDescripción()+", "+tip.getNumeroPuertas());
            System.out.println("\n"+tip+"\n");
        }
    }
}
