/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr2;

public class Multiplicacion {
    
   //Multiplicación de arreglos
    public double [][] xpoxt(double[][] x,double[][]xt){
    //Filas y Columans de la primera matriz
    int filas = x.length;
    int columnas=x[0].length;
    
    //Filas y Columans de la Segunda Matriz
    int filas2 = xt.length;
    int columnas2 = xt[0].length;
    
    double[][] aux = new double [filas][columnas2];
    
    for(int i=0; i<filas; i++){
        for(int j=0; j<columnas2;j++){
            for(int k=0; k<columnas;k++){
                aux[i][j] += x[i][k]*xt[k][j];
            }
        }
    }
    return aux;
}
    
}
