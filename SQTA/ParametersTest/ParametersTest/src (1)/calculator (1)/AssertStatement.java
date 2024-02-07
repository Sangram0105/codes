/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Admin
 */
public class AssertStatement { 
    
    
    
    public static boolean search(int arr[],int key){
        
        
       for(int i=0;i<arr.length;i++){
           if(key==arr[i]){
               return true;
           }
           else{
               return false;
           }
       }
       
       return false;
    }
    
public static double[]  sortBy2(double arr[]){
      
      double temp;
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length-i-1;j++){
              if(arr[j]>arr[j+1]){
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
      }
      
  }
 return   arr;
  }
    
  

    
}
