package tasksesion2;

import java.util.ArrayList;
import java.util.List;

public class ListarCliente {

    private List<String> nombresCliente = new ArrayList<String>();;
    private List<Boolean> estadosCliente = new ArrayList<Boolean>();

    public void agregarCliente(String nombreCliente, boolean estadoCliente) {
        nombresCliente.add(nombreCliente);
        estadosCliente.add(estadoCliente);
    }

    public List<String> obtenerClientesPorEstado(boolean estado) {
        List<String> clientesPorEstado = new ArrayList<String>();
        for (int i = 0; i < nombresCliente.size(); i++) {
            if (estadosCliente.get(i) == estado) {
                clientesPorEstado.add(nombresCliente.get(i));
            }
        }
        return clientesPorEstado;
    }

    public static void main(String[] args) {
        ListarCliente listaClientes = new ListarCliente();

        // Agregar clientes a la lista
        listaClientes.agregarCliente("Cliente 1", true);
        listaClientes.agregarCliente("Cliente 2", true);
        listaClientes.agregarCliente("Cliente 4", false);
        listaClientes.agregarCliente("Cliente 5", true);
        listaClientes.agregarCliente("Cliente 6", false);
        listaClientes.agregarCliente("Cliente 7", false);
        listaClientes.agregarCliente("Cliente 8", true);
        listaClientes.agregarCliente("Cliente 9", true);
        listaClientes.agregarCliente("Cliente 10", false);
        listaClientes.agregarCliente("Cliente 11", true);
        listaClientes.agregarCliente("Cliente 12", true);
        listaClientes.agregarCliente("Cliente 13", false);
        listaClientes.agregarCliente("Cliente 14", true);
        listaClientes.agregarCliente("Cliente 15", true);
        listaClientes.agregarCliente("Cliente 16", false);
        listaClientes.agregarCliente("Cliente 17", true);
        listaClientes.agregarCliente("Cliente 18", true);
        listaClientes.agregarCliente("Cliente 19", false);
        listaClientes.agregarCliente("Cliente 20", false);
        listaClientes.agregarCliente("Cliente 21", true);
        listaClientes.agregarCliente("Cliente 22", true);
        listaClientes.agregarCliente("Cliente 23", false);
        listaClientes.agregarCliente("Cliente 24", true);
        listaClientes.agregarCliente("Cliente 25", true);
        listaClientes.agregarCliente("Cliente 26", false);
        listaClientes.agregarCliente("Cliente 27", true);
        listaClientes.agregarCliente("Cliente 28", true);
        listaClientes.agregarCliente("Cliente 29", false);
        listaClientes.agregarCliente("Cliente 30", false);
        listaClientes.agregarCliente("Cliente 31", true);
        listaClientes.agregarCliente("Cliente 32", true);
        listaClientes.agregarCliente("Cliente 33", false);
        listaClientes.agregarCliente("Cliente 34", true);
        listaClientes.agregarCliente("Cliente 35", true);
        listaClientes.agregarCliente("Cliente 36", false);
        listaClientes.agregarCliente("Cliente 37", true);
        listaClientes.agregarCliente("Cliente 38", true);
        listaClientes.agregarCliente("Cliente 39", false);
        listaClientes.agregarCliente("Cliente 40", false);

        long tiempoInicio = System.nanoTime();
        List<String> clientesActivos = listaClientes.obtenerClientesPorEstado(true);
        System.out.println("Clientes activos:");
        clientesActivos.stream().forEach(s -> System.out.print(s + ","));
        long tiempoFin = System.nanoTime();
        System.out.println("\n" + "Diferencia de tiempo sin prog. paralela: " + (tiempoFin - tiempoInicio) + "\n");

        tiempoInicio = System.nanoTime();
        List<String> clientesAct = listaClientes.obtenerClientesPorEstado(true);
        clientesAct.stream().parallel().forEach(s -> System.out.print(s + ","));
        tiempoFin = System.nanoTime();
        System.out.println("\n" + "Diferencia de tiempo con prog. paralela: " + (tiempoFin - tiempoInicio));
    }
}
