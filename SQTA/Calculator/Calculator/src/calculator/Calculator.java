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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
 public static  int add(int a,int b){
    
        return a+b;
    } 
  public static  int multiple(int a,int b){
    
        return a*b;
    } 
  
  public static int max(int arr[]){
  
 int   max= arr[0];
  
  for(int i=0;i<arr.length;i++){
      
      if(max<arr[i]){
      max=arr[i];
      }
  } 
  
  return max;
  } 
  
  public static double cube(double a){
  
  return (a*a*a);
  }
 
  }
    
    

