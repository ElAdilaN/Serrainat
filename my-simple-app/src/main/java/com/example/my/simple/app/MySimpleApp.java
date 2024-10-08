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
<<<<<<< HEAD

=======
>>>>>>> c60204de85b3579eac0b81283a9e4c42c80b817d
                    System.out.println("Selecciona el número de la tasca que vols marcar com completada:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + 1 + ". " + tasks.get(i).getDescription() + " (Completada: " + tasks.get(i).isCompleted() + ")");
                    }
                    int taskIndex = scanner.nextInt() - 1;
                    if (taskIndex >= 0 && taskIndex < tasks.size()) {
                        tasks.get(taskIndex).setCompleted(true);
                        System.out.println("Tasca marcada com a completada!");
                    } else {
                        System.out.println("Índex no vàlid.");
                    }
                    break;

                case 3:

                    System.out.println("Llista de tasques:");
                    for (Task task : tasks) {
                        System.out.println(task);
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
