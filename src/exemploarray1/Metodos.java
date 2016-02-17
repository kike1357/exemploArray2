package exemploarray1;

/**
 *
 * @author epastorizalorenzo
 */
public class Metodos {
    //collemos espazo para 7 elementos tipo float
    // float[]temperaturas={1f,2f,3f,4f,5f,6f,7f};
   
    public void crearArray(float[]temp){
        for(int i=0; i<temp.length;i++)
            temp[i]=i+1;                           
    }

    public void visualizar(float[]temperaturas){
        for(int i=0;i<temperaturas.length;i++)
        System.out.println("temperaturas ["+i+"]= "+temperaturas[i]);
}
    public float[]duplicar(float[]tem){
        for(int i=0;i<tem.length;i++)
        tem[i] = tem[i]*2;
        return tem;   
    }
}