
package mlr2;


public class Transpuesta {
  
 
//Transpuesta de una Matriz
public double[][] Transpuesta(double x [][]){
    double xt[][]= new double [3][17];
    for(int i=0;i<3;i++){
        for(int j=0;j<17;j++){
            xt[i][j]=x[j][i];
        }
    }
    return xt;
}  
}
