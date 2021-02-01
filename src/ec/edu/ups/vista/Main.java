/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorBanco;
import ec.edu.ups.modelo.Banco;

/**
 *
 * @author ariel
 */
public class Main {
    
    public static void main(String[] args) {
        ControladorBanco controladorBanco = new ControladorBanco();
        Banco b = new Banco();
        b.setNombre("Ariel");
        controladorBanco.crear(b);
        controladorBanco.buscarTodo().stream().forEach(p -> System.out.println(p));
    }
    
}
