
package mlr2;


public class Imprimir {
    
//Imprimir Matrizes 
public void Imprimir(double x[][]){
    double fila= x.length;
    double columnas= x[0].length;
    
    for(int i=0;i<fila;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(x[i][j]+" ");
            }
             System.out.println("\n");
        }
}

}
