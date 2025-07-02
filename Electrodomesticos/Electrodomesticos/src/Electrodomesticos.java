public class Electrodomesticos {

/* Variables o Atributos */

    private String tipoElectrodomestico; // una nevera, un horno, una lavadora, etc//
    private String marca;
    private double potencia; // Consumo en KW por hora//



/* Constructor/es */

    public Electrodomesticos(String tipoElectrodomestico, String marca, double potencia){

        this.tipoElectrodomestico = tipoElectrodomestico;
        this.marca = marca;
        this.potencia = potencia;

    }


/*^Metodos Getter y Setter */

    public String getTipoElectrodomestico() {
        return tipoElectrodomestico;
    }



    public void setTipoElectrodomestico(String tipoElectrodomestico) {
        this.tipoElectrodomestico = tipoElectrodomestico;
    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public double getPotencia() {
        return potencia;
    }



    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


 /* Metodo toString */   
    
    @Override
    public String toString() {
       
    String cadena;

            cadena = "Caracteristicas de los Electrodomesticos \n";
cadena += "-----------------------------------------------------------\n";

        cadena += "Electrodomestico : " + tipoElectrodomestico+ "\n";

        cadena += "Marca : " + marca+ "\n";

        cadena += "Potencia : " + potencia + "\n";
   
   
            return cadena;
     }



/* Metodo getConsumo */

    public double getConsumo(int horasConsumo){

        double consumoKW = this.potencia*horasConsumo;

            return consumoKW;


    }

/* Metodo getCosteConsumo */

    public double getCosteConsumo( int horas, double costeKwHora){

        double costeTotalConsumo = horas * costeKwHora;

            return costeTotalConsumo;

        }



/* */
    





}
