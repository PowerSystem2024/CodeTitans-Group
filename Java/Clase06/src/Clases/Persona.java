package Clases;

public class Persona {
    //Atributos de la clase (Caracteristicas)
    public String nombre;
    public String apellido;
    

    /*Metodos de la clase(Acciones)
    Un metodo puede recibir valor, esto se lo conoce como argumentos,
    un metodo puede recibir valor, llamado valor de retorno que tambien puede
    regresar a nuestro metodo
    */

    /*Podemos definir un metodo utilizando public o private,
    que indica que se puede utilizar fuera de esta clase.
    Void indica que no regresa ningun tipo de informacion
    Los parentesis indican que puede recibir informacion, lo que se encuentra
    dentro de los parentesis se conoce como argumento que puede recibir o no un metodo
    El metodo main es para ejecutar hacia la consola nuestros programas
    se recomienda hacerlo fuera, creando otra clase
     */

    public void obtenerInformacion(){
        System.out.println("Nombre: "+nombre); //aqui nombre es un atributo de la clase
                                               //definido en la clase, puede utilizarce dentro de cualquier metodo
                                                //dentro de esa clase
        System.out.println("apellido = " + apellido);
    }

    //para generar un constructor en la clase persona, hacemos
    //click derecho en persona y seleccionamos generate - constructor
}
