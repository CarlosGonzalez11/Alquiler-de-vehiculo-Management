import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.Placa = "1H528P";
        vehiculo1.Modelo = "Toyota";

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.Placa = "9H57R2";
        vehiculo2.Modelo = "Honda";

        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Marcos Lopez";
        cliente1.vehiculo = vehiculo1;
        cliente1.edad = 28;

        Cliente cliente2 = new Cliente();
        cliente2.nombre = "Daniel Caceres";
        cliente2.vehiculo = vehiculo1;
        cliente2.edad = 25;

        Empleado empleado1 = new Empleado();
        empleado1.Id_emp = "654871";
        empleado1.nombre_emp = "Jorge Avila";

        Empleado empleado2 = new Empleado();
        empleado2.Id_emp = "576421";
        empleado2.nombre_emp = "Brayan Perez";

        Cliente[] mis_clientes = new Cliente[3];
        mis_clientes[0] = cliente1;
        mis_clientes[1] = cliente2;

        vehiculo1.vehiculos.add(cliente1);
        vehiculo1.vehiculos.add(cliente2);

        vehiculo1.vehiculos.get(0);

        for (Cliente g: vehiculo1.vehiculos) {
            System.out.println(g.enunciado());
        }
    }

}

class Cliente{

    Vehiculo vehiculo;
    Empleado emp;
    String nombre;
    short edad;
    String genero;

    public String enunciado(){  return "El cliente: " + this.nombre + " Alquilara el vehiculo de modelo: " + this.vehiculo.Modelo + ", Con Placa: " + this.vehiculo.Placa;
    }

}

class Vehiculo {

    String Placa;
    String Modelo;
    int anio;
    String Color;

    List<Cliente> vehiculos;

    public Vehiculo() {
        this.vehiculos = new ArrayList<Cliente>();

    }
}

class Empleado{

    String nombre_emp;
    String Id_emp;

}