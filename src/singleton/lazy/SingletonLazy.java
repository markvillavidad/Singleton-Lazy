/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.lazy;


public class SingletonLazy {
    
    private static SingletonLazy newSingletonInstance = null;
    
    private SingletonLazy(){}
    
    public static SingletonLazy newSingletonInstance(){
        if(newSingletonInstance == null){
            newSingletonInstance = new SingletonLazy();     
        } 
       return newSingletonInstance();
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}