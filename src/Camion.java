public class Camion extends VehiculoCarga {
    private int numEjes;

    // constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    // Getter y Setter para tipoCombustible
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    // Sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    @Override
    public void RealizarMantenimiento(){
        System.out.println("1. Cambio de Aceite");
        System.out.println("2. Cambio de Neumatico");
        System.out.println("3. Cambio de Frenos");
    }
}
