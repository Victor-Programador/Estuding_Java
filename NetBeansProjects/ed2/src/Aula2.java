/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author visitante
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void preOrdem(NodeTree node){
        if(node!=null){
            System.out.print(node.getValue() + "");
            preOrdem(node.getFilhoEsquerdo());
            preOrdem(node.getFilhoDireito());
        }
    }
    
    public static void emOrdem(NodeTree node) {
        if(node != null){
            emOrdem(node.getFilhoEsquerdo());
            System.out.print(node.getValue() + "");
            emOrdem(node.getFilhoDireito());
        }
    }
    
    public static void posOrdem(NodeTree node){
        if(node != null){
            posOrdem(node.getFilhoEsquerdo());
            posOrdem(node.getFilhoDireito());
            System.out.print(node.getValue() + "");
        }
    }
    
    public static void emNivel_Queue(){
        NodeTree nodeAux;
        Queue_Dinamic queue;
        
        queue = new Queue_Dinamic();
        queue.enqueue(raiz);
        while(!queue.isEmpty()){
            nodeAux = (NodeTree)queue.dequeue();
            if(nodeAux.getFilhoEsquerdo() != null)
                queue.enqueue(nodeAux.getFilhoEsquerdo());
            
            if(nodeAux.getFilhoDireito() != null)
                queue.enqueue(nodeAux.getFilhoDireito());
            
            System.out.println(nodeAux.getValue() + "");
        }
    }
}
