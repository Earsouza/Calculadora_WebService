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
        ClienteRest c = new ClienteRest();

        System.out.println(c.olaJSON());
        System.out.println(c.olaTexto());
        System.out.println(c.olaXML());
        System.out.println(c.olaOutroXML("STD"));
        c.close();
    }

}
