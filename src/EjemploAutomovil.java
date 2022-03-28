public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil camaro = new Automovil("Chevrolet","Camaro",Color.ROJO,new Motor(2.3,TipoMotor.BENCINA), new Tanque(100), TipoAutomovil.PICKUP);
        Automovil raptor = new Automovil("Ford","Raptor");
        Automovil ram =new Automovil();
        Automovil sandero = new Automovil("Renult","Sandero",Color.AMARILLO,new Motor(2.5, TipoMotor.DISEL), new Tanque(100), TipoAutomovil.PICKUP);
        // instanciamos la clase es decir creamos
        // un objeto aparatir de la clase, en este
        // caso creamos el objeto auto y tomamos como
        // modelo la clase automovil y le asignamos
        // el operador new y el constructor de la clase
        // los constructores solo se pueden llamar mediante el operador new
        //creamos el constructor y le pasamos los parametros
        // que requiere sin necesidad de pasarlos mpor el set de la clase



        System.out.println("auto.fabricante: " +camaro.getFabricante());
        System.out.println("auto.modeloe: " + camaro.getModelo());
        System.out.println("auto.color: " + camaro.getColor());
        System.out.println("auto.cilindrada: " + camaro.getMotor());
        // ahora creamos otro auto apartir de la misma clase Automovil
        // ahora imprimimos pero usando el metodo del objeto


        raptor.setColor(Color.AZUL);
        raptor.setMotor(new Motor(3.5, TipoMotor.BENCINA));
        raptor.setTanque(new Tanque(100));

        ram.setMotor(new Motor(3.8, TipoMotor.BENCINA));
        ram.setFabricante("RAM");
        ram.setModelo("TReX 15000");
        ram.setTanque(new Tanque(80));
        ram.setColor(Color.GRIS);




        System.out.println(raptor.verDetalle());
        System.out.println(camaro.verDetalle());
        System.out.println(ram.verDetalle());




        System.out.println(camaro.acelerar(7000));
        System.out.println(camaro.frenar());

        System.out.println(raptor.acelerar(5000));
        System.out.println(raptor.frenar());

        System.out.println(ram.acelerar(120000));
        System.out.println(ram.frenar());


        System.out.println(camaro.acelerarFrenar(4000));
        System.out.println(raptor.acelerarFrenar(4000));
        System.out.println(ram.acelerarFrenar(4000));



        System.out.println(" Kilometros por litro " + camaro.calcularConsumo(300, 0.75F));// metodo que recibe float
        System.out.println(" Kilometros por litro " + raptor.calcularConsumo(300, 75));// metodo que recibe int
        System.out.println(" Kilometros por litro " + ram.calcularConsumo(300, 75));// metodo que recibe int



        // Aplicamos el encapsulamiento ya
        // que son el mismo metodo no sabe como actua
        // el otro metodo de la sobrecarga
        // es posible por la sobre carga de metodos
        // tambien aplicamos el polomorfismo ya que
        // obtuvimos el mismo resultado pero lo
        // implementamos de diferente forma





    }
}
