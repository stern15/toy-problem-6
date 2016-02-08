/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;
import java.util.*;
/**
 *
 * @author semasuka
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int [] x={4,5,2,34,5,12,43,89};
        int  largest=x[0];
        int smalest=x[0];
        for (int i=0;i<x.length;i++){
            if(x[i]>largest){
                largest=x[i];
            }
            else if(x[i]<smalest){
                 smalest=x[i];
        }       
        }
        System.out.println("the maximum is:"+largest);
        System.out.println("the minimum is:"+smalest);
    }  
}
