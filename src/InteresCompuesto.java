public class InteresCompuesto {
    public static void main(String[] args) {
        double inversion = 1000;
        double tasaAnual= 0.05;
        double cantidad = 0;

        for( int anio = 1; anio <= 10; anio ++){
            cantidad = inversion  * Math.pow( 1 + tasaAnual, anio);
            System.out.println("La cantidad acumulada al finalizar el año " + anio + " es de: $" + Math.round(cantidad));
        }
    }


}
