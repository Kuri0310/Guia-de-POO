public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    // constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    // Sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);

    }

    @Override 
    public void RealizarMantenimiento(){
        System.out.println("1. Cambio de Aceite");
        System.out.println("2. Cambio de Neumatico");
        System.out.println("3. Cambio de Color");
        System.out.println("4. Cambio de Frenos");
    }

    public double CostoDeMantenimiento(double CostoPorKm, double Km){
        double CostoTotal = CostoPorKm * Km;
        return CostoTotal;
    }

}
