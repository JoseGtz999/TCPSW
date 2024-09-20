/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inyeccion;

/**
 *
 * @author j_dev
 */
public class SaludoConcreto implements IMensajeID{

    @Override
    public void imprimir() {
        System.out.println("Hola mundo inyectado");
    }
    
    
}
