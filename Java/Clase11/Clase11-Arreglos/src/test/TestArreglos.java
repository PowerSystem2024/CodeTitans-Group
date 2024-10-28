
package test;


public class TestArreglos {
    
    public static void main(String[] args) {
        
        int edades[] = new int[3];//Arreglo de tres elementos
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        edades[1] = 15;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 27;
        System.out.println("edades 2 = " + edades[2]);
        //edades[3] = 7;
        //System.out.println("edades 3 = " + edades[3]); Error en tiempo de ejecucion
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+i+": "+edades[i]);
        }        
    }    
}
