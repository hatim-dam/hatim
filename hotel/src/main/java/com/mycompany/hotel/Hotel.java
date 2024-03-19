package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

        Cliente cliente = null;
        Empleado empleado = null;
        Habitacion habitación = null;
        int idCliente;
        int idEmpleado;
        String nombre;
        String apellidos;
        String DNI;
        int numeroTelefono;
        int idHabitacion;
        String tipo;
        int numeroCamas;
        double costePorDia;

        int opcion = 10;

        do {

utils.ResgitroCliente();
            
            switch (opcion) {
                case 1:
utils.idCliente();
                    

                    break;
                case 2:

utils.idClienteBaja();
                    
                    

                    break;
                case 3:
utils.idEmpleado();

               

                    break;
                case 4:
                    
 utils.Idempleado();                   
                  
                    break;
                case 5:
                    
utils.idHabitacion();
                    
                 

                    break;
                case 6:
                    
utils.idHabitacionEliminar();
                    
                  

                    break;
                case 7:
                    
 
utils.Nohaycliente();
                 

                    break;
                case 8:
utils.Nohayprofesores();                    
                   

                    break;
                case 9:
utils.Nohayhabitaciones();                   
                   

                    break;
                case 10:
utils.cerrarprograma();                   

                    break;
                default:
utils.seleccion();              
            }
        } while (opcion != 10);      
    }
}
