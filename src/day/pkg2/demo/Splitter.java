/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg2.demo;
/**
 *
 * @author MIDO
 */
public class Splitter {
    public void doOperation(String ip){
    String[] parts = ip.split("\\.");
    if (parts.length !=4){
        System.out.println("Error write the ip correctly");
    }
    else{
        int[] arrInt = new int[4]; 
        arrInt[0] = Integer.parseInt(parts[0]);
        arrInt[1] = Integer.parseInt(parts[1]);
        arrInt[2] = Integer.parseInt(parts[2]);
        arrInt[3] = Integer.parseInt(parts[3]);
        for(int i=0; i<4; i++){
            System.out.println(arrInt[i]);
        }
    }
    }
}
