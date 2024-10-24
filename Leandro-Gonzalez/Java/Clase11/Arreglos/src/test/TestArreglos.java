public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3]; // Del lado izq. declaramos la variable, lado derec. instanciamos un objeto de
                                   // tipo object
        System.out.println("edades = " + edades);

        // Modificamos elementos del arreglo
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        edades[1] = 33;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 37;
        System.out.println("edades 2 = " + edades[2]);

        // edades[3] = 15; Da error de ejecucion ya que que esta fuera del rango
        // permitido

        // Recorremos todos los elementos con un ciclo for
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades y sus elementos " + i + ": " + edades[i]);
        }

    }
}