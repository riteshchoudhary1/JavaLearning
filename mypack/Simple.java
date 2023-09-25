package mypack;  

import myrk.PublicInt;

class Simple implements PublicInt { 

    public void temp(int abc){
        int arr[]= new int[5];
        arr[1]=4;
        System.out.println(arr[1]);
    }

    public static void main(String args[]){  
     System.out.println("Hello Java");
     Simple s= new Simple();
     s.temp(12);  
    }  
}  