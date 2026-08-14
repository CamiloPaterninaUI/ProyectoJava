import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\n--- Sistema de TODO List ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String desc = scanner.nextLine();
                    System.out.print("Prioridad (1=alta, 2=media, 3=baja): ");
                    int prioridad = scanner.nextInt();
                    gestor.agregarTarea(new Tarea(desc, prioridad));
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.print("Índice a eliminar: ");
                    int indice = scanner.nextInt();
                    gestor.eliminarTarea(indice);
                    break;
                case 4:
                    System.out.print("Índice a completar: ");
                    int idx = scanner.nextInt();
                    if (idx >= 0 && idx < gestor.getTareas().size()) {
                        gestor.getTareas().get(idx).marcarCompletada();
                    }
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        scanner.close();
    }
}