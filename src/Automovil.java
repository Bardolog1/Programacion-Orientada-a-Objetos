public class Automovil {  // esta clase no lleva main porque es una clase entidad
// puede ser publica o simplemente class que es igual que default

    //apartir de aqui van los atributos de la clase
    // siempre deben ser privados y se presentan mediante metodos

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda [] ruedas;
    private int indRueda=0;

    private TipoAutomovil tipo;

    private static Color colorPatente= Color.BLANCO;  //staticdefine que es un metodo de la clase y al modificarlo cambia a todos los de la clase
    private static int tanqueGenerico;
    private static int ulId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; // los final son constantes, no se puede modificar y la nomenclatura es en mayuscula toda y seperada por raya al piso, puede ser privada o publica
    public static final Integer VELOCIDAD_MAX_CIUDAD=60;


    /*ahora creamos los metodos
    public se puede usar en cualquier parte del codigo void vacio, no retorna nada
     los metodos y atributos en minusculas
    */

    // creamos la sobre carga de constructores de la clase

    public Automovil(){// constructor vacio sobre carga de constructor para no requerir argumentos al inicializar la clase
        this.id=++ulId;
        this.ruedas = new Rueda[5];
    }
    public Automovil(String fabricante, String modelo){// constructor
        this();
        this.fabricante=fabricante;
       this.modelo=modelo;
    }
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, TipoAutomovil tipo) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
        this.tipo = tipo;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, TipoAutomovil tipo ,Persona conductor) {
        this(fabricante, modelo, color, motor,tanque,tipo);
        this.conductor = conductor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, TipoAutomovil tipo,Persona conductor, Rueda[] rueda) {
        this(fabricante, modelo, color, motor,tanque,tipo,conductor);
        this.ruedas = rueda;

    }


    // metodos para mostrar atributos   metodos get y set son llamados POJO
    public String getFabricante(){
        return this.fabricante;
    }
    public String getModelo(){
        return this.modelo;
    }
    public Color getColor(){
        return this.color;
    }
    public Motor getMotor(){
        return this.motor;
    }
    public Tanque getTanque() {
        return tanque;
    }
    public static Color getColorPatente() {
        return colorPatente;
    }
    public static int getTanqueGenerico() {
        return tanqueGenerico;
    }
    public TipoAutomovil getTipo() {
        return tipo;
    }
    public Persona getConductor() {
        return conductor;
    }
    public Rueda[] getRueda() {
        return ruedas;
    }


    // metodos para modificar atributos

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public void setTanque(Tanque tanque){
        this.tanque=tanque;
    }
    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }
    public static void setTanqueGenerico(int tanqueGenerico) {
        Automovil.tanqueGenerico = tanqueGenerico;
    }
    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }
    public void setRueda(Rueda[] rueda) {
        this.ruedas = rueda;
    }
    public void addRueda (Rueda rueda){
        if (indRueda < this.ruedas.length) {
            this.ruedas[indRueda++] = rueda;
        }
    }

    // metodos de funcionalidad de la clase

    public String verDetalle(){   // static se usa cuando los metodos pueden ser invocados sin instanciar la clase
      /* si se van a retornanr datos
      se debe colocar el tipo de dato
      que retorna despues del public*/

        return  "\nId: "+this.id+
                "\nFabricante: " + this.fabricante +
                "\nModelo: " + this.modelo +
                "\n"+this.getTipo()+
                "\nColor: " + this.color +
                "\nCilindrada: " + this.motor.getCilindrada() +
                "\nColor de Patente: "+colorPatente+
                "\nConductor: "+this.conductor+
                "\nRueda: "+ruedas+
                "\n";  // color patente al ser estatica no permite asociarla a this sino que pertenece a todos los objetos de esta clase

        /*
        this  se usa para indicar que se trata de la variable asignada como atributo del objeto
        this se usa para diferenciar una variable de atributo de la clase y otra que depronto se pueda llamar igual dentro de metodo
        lo ideal es que nunca dentro una clase se impriman datos
         return devuelve el resultado de la operacion del metodo y puede ser de cualquier tipo de dato
        */
    }
    public String acelerar(int rpm){   // en este metodo podemos pasar datos desde afura (argumentos) definimos el tipo de argumento y el nombre dentro de los ()
        return "el auto "+this.fabricante+" esta acelerando a "+rpm+"rpm";// rpm variable del metodo
    }
    public String frenar(){
        return this.fabricante+" "+this.modelo+" frenando";
    }
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm); // this tambien se usa para referirse a metodos dentro de la clase
        String frenar =this.frenar();
        return acelerar+"\n"+frenar;

    }


    //Sobrecarga de metodos es un metodo que se repite pero recibe diferentes argumentos


    public float calcularConsumo(int km, float gastoGas){
        return km/(this.tanque.getCapacidad() * gastoGas);
    }
    public float calcularConsumo(int km, int gastoGas){
        return km/(this.tanque.getCapacidad() *(gastoGas/100f) );
    }
    public static float calcularConsumoEstatico(int km, int gastoGas){
        return km/(tanqueGenerico *(gastoGas/100f) );  // para un metodo estaico no podemos usar atributos que hagan referencia a la instancia u objetos, debe tener sus propios atributos staticos
    }
    public String desc (TipoAutomovil tipo){
        tipo = this.getTipo();
        String descrip;

        switch(tipo){
            case CONVERTIBLE ->{
                descrip = "El auto es deporivo y descapotable de dos puertas ";
                return descrip;
            }
            case COUPE ->{
                descrip = "El auto es pequeño de dos puertas tipicamente deportivo";
                return descrip;
            }
            case FURGON ->{
                descrip= "El auto es de transporte de carga seca";
                return descrip;
            }
            case HATCHBACK ->{
                descrip = "El auto es mediano y es compacto de aspecto deportivo";
                return descrip;
            }
            case PICKUP ->{
                descrip = "El auto es una camioneta de alta gama y gran capacidad de traccion";
                return descrip;
            }
            case STATION_WAGON ->{
                descrip="El auto es mediano con maletero de gran amplitud";
                return descrip;
            }
            case SEDAN -> {
                descrip = "El auto es mediano de tipo corriente de uso diario";
                return descrip;
            }
            default -> descrip = "No hay datos";
        }

        return "Descripción: "+descrip;
    }




    // vamos a tomar un metodo de la clase padre = objet para modificarlo a nuestra necesidad


    @Override
    public boolean equals(Object obj) {
        Automovil a =(Automovil) obj; // hacemos un cast o forzado de tipo para indicar que obj ahora es de tipo automovil
        return (this.fabricante!= null && this.modelo!= null | this.fabricante.equals(a.getFabricante())&& this.modelo.equals(a.getModelo()));
    }
    @Override
    public String toString() {
        return this.id + " "+ fabricante+" "+modelo;
    }
    //  @Override marca al compilador para indicar que estamos sobrescribiendo






}
