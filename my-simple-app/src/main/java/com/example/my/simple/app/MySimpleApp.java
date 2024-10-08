/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.example.my.simple.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author noure
 */
public class MySimpleApp {

public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        // Aquí irá la lógica principal de la aplicación
        // Por ejemplo, un menú sencillo para agregar tareas, marcarlas como completadas y mostrar la lista

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");

            int option = scanner.nextInt();
            

            switch (option) {
                case 1:
                  System.out.println("Introdueix la descripció de la tasca:");
                 scanner.nextLine();  // Consumir la línia buida
                String description = scanner.nextLine();
                 tasks.add(new Task(description));
                     System.out.println("Tasca afegida correctament!");
                    break;
                case 2:
                    // Marcar una tarea como completada
                    break;
                case 3:
                    // Mostrar la lista de tareas
                    break;
                case 4:
                    System.exit(0);
            }
        }
}
}
