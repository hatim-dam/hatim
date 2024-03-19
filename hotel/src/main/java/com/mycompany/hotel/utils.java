/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumnado
 */
public class utils {
    
    
    
    public static void ResgitroCliente() {

        Scanner sca = new Scanner(System.in);

        int opcion = 10;

        System.out.println("1. Registrar cliente.");
        System.out.println("2. Dar de baja a un cliente.");
        System.out.println("3. Registrar empleado.");
        System.out.println("4. Dar de baja a un empleado.");
        System.out.println("5. Agregar nueva habitación.");
        System.out.println("6. Eliminar una habitación.");
        System.out.println("7. Mostrar todos los clientes.");
        System.out.println("8. Mostrar todos los empleados.");
        System.out.println("9. Mostrar todas las habitaciones.");
        System.out.println("10. Salir del programa.");
        System.out.println("Introduce el número de la opcion deseada: ");

        opcion = sca.nextInt();
    }

    public static void idCliente() {

        Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente = null;
        int idCliente;
        String nombre;
        String apellidos;
        int numeroTelefono;

        System.out.println("Introduzca el id del nuevo cliente: ");
        idCliente = sca.nextInt();
        cliente = new Cliente(idCliente);
        sca.nextLine();
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        nombre = sca.nextLine();
        cliente.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        apellidos = sca.nextLine();
        cliente.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        cliente.setDNI(sca.nextLine());
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        numeroTelefono = sca.nextInt();
        cliente.setNumeroTelefono(numeroTelefono);
        clientes.add(cliente);
    }

    public static void idClienteBaja() {

        Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente = null;

        int idCliente;

        System.out.println("Introduzca el id del cliente a dar de baja: ");
        idCliente = sca.nextInt();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para dar de baja...");
        } else {
            for (Cliente clienteABorrar : clientes) {
                if (clienteABorrar.getIdCliente() == idCliente) {
                    clientes.remove(clienteABorrar);
                }
            }
        }
    }

    public static void idEmpleado() {
        
        
        Scanner sca = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
      

        Empleado empleado = null;
        int idEmpleado;
        String nombre;
        String apellidos;
        String DNI;
        int numeroTelefono;
        int idHabitacion;
        String tipo;
       
    

        int opcion = 10;

        System.out.println("Introduzca el id del nuevo empleado: ");
        idEmpleado = sca.nextInt();
        empleado = new Empleado(idEmpleado);
        sca.nextLine();
        System.out.println("Introduzca el nombre del nuevo empleado: ");
        nombre = sca.nextLine();
        empleado.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        apellidos = sca.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo empleado: ");
        DNI = sca.nextLine();
        empleado.setDNI(DNI);
        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        numeroTelefono = sca.nextInt();
        empleado.setNumeroTelefono(numeroTelefono);
        empleados.add(empleado);
    }

    public static void Idempleado() {
        
          Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        Cliente cliente = null;
        Empleado empleado = null;
        
        int idCliente;

        int opcion = 10;
        
         
        
        System.out.println("Introduzca el id del empleado a dar de baja: ");
                    idCliente = sca.nextInt();
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados para dar de baja...");
                    } else {

                        for (Empleado clienteABorrar : empleados) {
                            if (clienteABorrar.getIdEmpleado() == idCliente) {
                                empleado = clienteABorrar;

                            }
                        }
                        empleados.remove(empleado);
                    }
        
    }

    public static void idHabitacion() {
        
            Scanner sca = new Scanner(System.in);
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
        Habitacion habitación = null;
        int idHabitacion;
        String tipo;
        int numeroCamas;
        double costePorDia;

        int opcion = 10;
        
        
        System.out.println("Introduzca el id de la nueva habitación: ");
        idHabitacion = sca.nextInt();
        habitación = new Habitacion(idHabitacion);
        sca.nextLine();
        System.out.println("Introduzca el tipo de la nueva habitación: ");
        tipo = sca.nextLine();
        habitación.setTipo(tipo);
        System.out.println("Introduzca número de camas de la nueva habitación: ");
        numeroCamas = sca.nextInt();
        habitación.setNumeroCamas(numeroCamas);
        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        costePorDia = sca.nextDouble();
        habitación.setCostePorDia(costePorDia);
        sca.nextLine();
        habitaciones.add(habitación);
    }

    public static void idHabitacionEliminar() {
        
       Scanner sca = new Scanner(System.in);
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

        Cliente cliente = null;
        Habitacion habitación = null;
        int idCliente;
        
        
       
        
       
        
       
       
        
        
        System.out.println("Introduzca el id de la habitación a eliminar: ");
        idCliente = sca.nextInt();
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para borrar...");
        } else {

            for (Habitacion clienteABorrar : habitaciones) {
                if (clienteABorrar.getIdHabitacion() == idCliente) {
                    habitación = clienteABorrar;

                }
            }

            habitaciones.remove(habitación);
        }
    }

    public static void Nohaycliente() {
        
           Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente = null;
      
        
        
      
        
if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para mostrar...");
                    } else {
                        for (Cliente clienteAMostrar : clientes) {
                            System.out.println("ID: " + clienteAMostrar.getIdCliente());
                            System.out.println("Nombre: " + clienteAMostrar.getNombre());
                            System.out.println("Apellidos: " + clienteAMostrar.getApellidos());
                            System.out.println("DNI: " + clienteAMostrar.getDNI());
                            System.out.println("Número de teléfono: " + clienteAMostrar.getNumeroTelefono());
                            System.out.println("");
                        }
                    }    }

    public static void Nohayprofesores() {
        
         Scanner sca = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();


        int opcion = 10;
        
        if (empleados.isEmpty()) {
            System.out.println("No hay profesores para mostrar...");
        } else {

            for (Empleado empleadoAMostrar : empleados) {
                System.out.println("ID: " + empleadoAMostrar.getIdEmpleado());
                System.out.println("Nombre: " + empleadoAMostrar.getNombre());
                System.out.println("Apellidos: " + empleadoAMostrar.getApellidos());
                System.out.println("DNI: " + empleadoAMostrar.getDNI());
                System.out.println("Número de teléfono: " 
                + empleadoAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
    }

    public static void Nohayhabitaciones() {
        
          Scanner sca = new Scanner(System.in);
        
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

       
        
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {

            for (Habitacion claseAMostrar : habitaciones) {
                System.out.println("ID: " + claseAMostrar.getIdHabitacion());
                System.out.println("Tipo: " + claseAMostrar.getTipo());
                System.out.println("Número de camas: " + claseAMostrar.getNumeroCamas());
                System.out.println("Coste por día: " + claseAMostrar.getCostePorDia());
                System.out.println("");
            }
        }
    }

    public static void cerrarprograma() {
        
        System.out.println("Cerrando el programa...");
    }

    public static void seleccion() {
        
      System.out.println("La opción seleccionada no existe...");    }
    
}





    
    

