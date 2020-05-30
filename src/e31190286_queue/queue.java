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
public class queue {
    //Mengidentifikasi Variabel
    int queue[]=new int[5];
    int size;
    int front;
    int rear;
    
    //Membuat method untuk menambahkan data
    public void enQueue(int data){
        if (!isFull()) {
        queue[rear]=data;
        rear=(rear+1)%5;
        size=size+1;
        }else{
            System.out.println("queue is Full");
        }
    }
    
    //Membuat methot untuk menghapus data
    public int dequeue(){
        int data=queue[front];
        if (!isEmpty()) {
             front=(front+1)%5;
             size=size-1;
        }else{
            System.out.println("queue is Empty");
        }
       
        
        return data;
    }
    
    //membuat method untuk menampilkan data
    public void show(){
        System.out.print("Data queue : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5]+" ");
            
        }
        System.out.println("");
        System.out.println("Data Sebelumnya : ");
        
        for (int n : queue) {
            System.out.print(n+" ");
        }
    }
    
    //untuk mengembalikan nilai size
    public int getSize(){
        return size; 
    }
    
    //identifikasi jika queue belum full
    public boolean isEmpty(){
        return getSize()==0;
    } 
    
     //identifikasi jika queue sudah full
    public boolean isFull(){
        return getSize()==5;
    } 
    
}

