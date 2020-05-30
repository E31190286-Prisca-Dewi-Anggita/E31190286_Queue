/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190286_queue;

/**
 *
 * @author Prisca Dewi Anggita
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        queue q=new queue();
        q.enQueue(3);
        q.enQueue(6);
        q.enQueue(9);
        
        
        
        q.dequeue();
        q.dequeue();
        
        
        q.enQueue(5);
        q.enQueue(2);
        
        System.out.println(q.isFull());
        
        System.out.println("Size "+q.getSize());
        q.show();
        
    }
}
