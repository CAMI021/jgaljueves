import skibidi.*;;

public class AppHerencia {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona();
        p.setNombre("Pepe");
        p.seEdad(25);

        Estudiante e = new Estudiante();
        e.setNombre("Juan Giraldo");
        e.setCodigo(123);
        e.setCarrera("Electronica");

        Profesor pro = new Profesor();
        pro.setNombre("Ever");
        pro.setMateria("Ingles");
        pro.setCargo("Conserge");

        System.out.println("Objeto p de tipo Persona");
        System.out.printf("Nombre: %s, Edad: %d \n", p.getNombre(), p.getEdad());
        System.out.println("Objeto e de tipo Estudiante");
        System.out.printf("Nombre: %s, Carrera: %s, Codigo: %d \n", e.getNombre(), e.getCarrera(), e.getCodigo());
        System.out.println("Objeto pro de tipo Profesor");
        System.out.printf("Nombre: %s, Materia: %s, Cargo: %s \n", pro.getNombre(), pro.getMateria(), pro.getCargo());
    }
}