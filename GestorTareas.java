import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
        }
    }

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
            return;
        }
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + ". " + tareas.get(i));
        }
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}