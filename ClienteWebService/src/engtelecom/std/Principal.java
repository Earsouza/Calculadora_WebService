/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package engtelecom.std;

/**
 *
 * @author Eduardo
 */
public class Principal {

    public static void main(String[] args) {
        int i = somar(10, 2);
        int j = subtrair(10, 2);

        System.out.println("i: " + i + ", j: " + j);
    }

    private static int somar(int a, int b) {
        engtelecom.std.Calculadora_Service service = new engtelecom.std.Calculadora_Service();
        engtelecom.std.Calculadora port = service.getCalculadoraPort();
        return port.somar(a, b);
    }

    private static int subtrair(int a, int b) {
        engtelecom.std.Calculadora_Service service = new engtelecom.std.Calculadora_Service();
        engtelecom.std.Calculadora port = service.getCalculadoraPort();
        return port.subtrair(a, b);
    }

}
