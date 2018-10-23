
package exemplostatic;


public class Alumno {
    private String nome;
    private float nota;
    private int numReferencia;
    public static int referencia = 6220; //variable de clase comun a todos los objetos
    
    public Alumno(){
        numReferencia = ++ referencia;
    }
    public Alumno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
        numReferencia = ++ referencia;
        
//    }
//   // public void setNumReferencia(int refe){
//        numReferencia = refe;
//    }
//   // public int getNumReferencia(){
//        return numReferencia;
        
    }
    public void amosar(){
        System.out.println("nome: "+nome+" ; nota: "+nota+" ; referencia: "+numReferencia);
    }
}
