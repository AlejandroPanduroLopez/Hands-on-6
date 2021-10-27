
package mlr2;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;


public class MLR2 extends Agent {
    
    @Override
    public void setup(){
        System.out.println("Agente "+getLocalName()+" iniciado");
       
        Multiplicacion multi = new Multiplicacion();
        Imprimir imprimir = new Imprimir();
        Transpuesta trans = new Transpuesta();
        Inversa inversa = new Inversa();
        
         double x [][]={{1,41.9,29.1},{1,43.9,29.5},{1,43.9,29.5},{1,44.5,29.7},{1,47.3,29.9},{1,47.3,30.3},
                        {1,47.9,30.5},{1,50.2,30.7},{1,52.8,30.8},{1,53.2,30.9},{1,56.7,31.5},{1,57,31.7},
                        {1,63.5,31.9},{1,65.5,32},{1,71.1,32.1},{1,77,32.5},{1,77.8,32.9}}; //Filas [i] Columnas [j]
         
         double y [][]={{251.3},{251.3},{248.3},{267.5},{273},{276.5},{270.3},{274.9},{285},{290},{297},
                        {302.5},{304.5},{309.3},{321.7},{330.7},{349}};
         double xt [][];
         double xporxt [][];
         double xtpory [][];
         double deter;
         double inv[][];
         double adj [][];
         double ffinal [][];
         
         
        System.out.println("------------La matriz X es: \n"); 
        imprimir.Imprimir(x);
        System.out.println("------------La matriz Y es: \n"); 
        imprimir.Imprimir(y);
        //Transpuesta 
        xt = trans.Transpuesta(x);
        xporxt = multi.xpoxt(xt,x);
        System.out.println("---------X * XT: \n"); 
        imprimir.Imprimir(xporxt);
        xtpory = multi.xpoxt(xt,y);
        System.out.println("---------XT * Y: \n"); 
        imprimir.Imprimir(xtpory);
         //System.out.println("\n");
        System.out.println("---------Determinante: \n"); 
        deter= inversa.Determinante(xporxt);
        System.out.println(deter);
        System.out.println("---------Adjunta: \n"); 
        adj=inversa.Adjunta(xporxt);
        imprimir.Imprimir(adj);
        System.out.println("---------Inversa: \n"); 
        inv=inversa.Inversa(xporxt);
        imprimir.Imprimir(inv);
        System.out.println("---------Final: \n"); 
        ffinal=multi.xpoxt(inv,xtpory);
        imprimir.Imprimir(ffinal);
        addBehaviour(new MyOneshotBehaviour());
    }
    
    private class MyOneshotBehaviour extends OneShotBehaviour {

        @Override
        public void action() {
            System.out.println("Agente ejecutado");
        }
        
        @Override
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }
    
}

   
    

