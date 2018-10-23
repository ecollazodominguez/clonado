
package exemplostatic;

public class ExemploStatic {


    public static void main(String[] args) {
        Alumno alum1 = new Alumno("Ana",5f);
        alum1.amosar();
        Alumno alum2 = new Alumno("Pepe",8f);
        alum2.amosar();
        alum1.amosar();
        System.out.println("Referencia: "+Alumno.referencia);
    }
    
}
