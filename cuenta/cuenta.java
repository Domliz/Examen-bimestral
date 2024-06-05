/**
 * EJERCICIO
 * Crea una clase Cuenta
 * que use diferentes niveles de acceso para sus miembros.
 * */
public class cuenta {
    private double saldo; // Accesible solo dentro de la clase
    private String titular; // Accesible desde cualquier lugar

    public cuenta(double saldoInicial, String titular) {
        this.saldoInicial = saldoInicial;
        this.titular = titular;
}
protected void depositar (double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
        }
}
private void retirar(double cantidad){
    if (cantidad > 0 && saldo >= cantidad){
    saldo -= cantidad;}
}
void mostrarSaldo(){
    System.out.println("Saldo: " saldo);

    