public enum TipoAutomovil {
    SEDAN("Sedan",4,"Auto mediano"),
    STATION_WAGON("Station Wagon",4,"Auto Grande"),
    HATCHBACK("Hatchback",4,"Auto Compacto"),
    PICKUP("Pickup", 4, "Camioneta"),
    COUPE("Coupé",2,"Auto pequeño"),
    CONVERTIBLE("Convertible",2 ,"Auto Deportivo"),
    FURGON("Furgon",4,"Auto utilitario");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripción;

    TipoAutomovil(String nombre, int numeroPuertas, String descripción) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripción = descripción;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripción() {
        return descripción;
    }

    @Override
    public String toString() {
        return  "Tipo: " +nombre + "\n" +
                "Puertas: " +numeroPuertas + "\n" +
                "Caracteristicas: " +descripción;
    }
}
