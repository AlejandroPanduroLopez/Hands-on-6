package mlr2;
public class Inversa {
    
    //Inversa de una Matriz
    public double [] [] Inversa(double [][]xt){
    double aux = Determinante(xt);
    double aux2[][]=Adjunta(xt);
    int filas = aux2.length;
    int columnas = aux2[0].length;
    double resultado[][]= new double [filas][columnas];
    //Este for rellena nuestra ultima matriz con los resultados
    for(int i=0;i<filas;i++){
        for(int j=0;j<columnas;j++){
            resultado[i][j]= aux2[i][j]/aux;
        }
    }
  return resultado; 
}

    //Determinante de una matriz
public double Determinante(double xt [][]){
    double aux,aux2,aux3,resultado;
    aux = ((xt[1][1] * xt[2][2])-(xt[2][1]*xt[1][2])) * xt[0][0];
    aux2 = ((xt[1][0]*xt[2][2])-(xt[2][0]*xt[1][2])) * -xt[0][1];
    aux3= ((xt[1][0]*xt[2][1])-(xt[2][0]*xt[1][1])) * xt[0][2];
    resultado = aux+aux2+aux3; 
    return resultado; 
}

    //Adjunta de una matriz
public double [][] Adjunta (double xt[][]){
    double adj [][]= new double [3][3];
    adj[0][0]=((xt[1][1]*xt[2][2]))-((xt[2][1]*xt[1][2]));
    adj[0][1]=-1*(((xt[1][0]*xt[2][2]))-((xt[2][0]*xt[1][2])));
    adj[0][2]=(xt[1][0]*xt[2][1])-(xt[2][0]*xt[1][1]);
    adj[1][0]=-1*((xt[0][1]*xt[2][2])-(xt[2][1]*xt[0][2]));
    adj[1][1]=(xt[0][0]*xt[2][2])-(xt[2][0]*xt[0][2]);
    adj[1][2]=-1*((xt[0][0]*xt[2][1])-(xt[2][0]*xt[0][1]));
    adj[2][0]=(xt[0][1]*xt[1][2])-(xt[1][1]*xt[0][2]);
    adj[2][1]=-1*((xt[0][0]*xt[1][2])-(xt[1][0]*xt[0][2]));
    adj[2][2]=(xt[0][0]*xt[1][1])-(xt[1][0]*xt[0][1]);
    return adj;
}

}
