package exemploarray1;

/**
 *
 * @author epastorizalorenzo
 */
public class ExemploArray1 {
    float[]temperaturas=new float[7];
    public void traballarArray(){
        Metodos obxArray = new Metodos();
        obxArray.visualizar(temperaturas);
        obxArray.crearArray(temperaturas);
        obxArray.visualizar(temperaturas);
        obxArray.duplicar(temperaturas);
        float[]resposta=obxArray.duplicar(temperaturas);
        obxArray.visualizar(resposta);
    }
    
    public static void main(String[] args) {
        ExemploArray1 aux=new ExemploArray1();
        aux.traballarArray();
        
       
}
}