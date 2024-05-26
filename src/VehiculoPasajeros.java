public class VehiculoPasajeros extends Vehiculo {

    private int numPasajeros;

    // Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros(int numPasajeros) {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    // sobreescribir el metodo mostrar info()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Pasajeros " + numPasajeros);
    }
}
