/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

/**
 *
 * @author Swarupa Pedapalli
 */
public class RecursiveDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
   
        int x = 5;
       
        int array[] = new int[] { 12, 64, 7, 6, 42, 56 ,32};
     
        int y= recursiveSearch(array, 0, array.length - 1, x);
        if (y != -1)
           System.out.println("Element " + x + " is located at index " +
                                                    y);
        else
            System.out.println("Element " + x + " is not there");
        }

    private static int recursiveSearch(int[] arr, int i, int j, int k) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if (j < i)
             return -1;
          if (arr[i] == k)
             return i;
          if (arr[j] == k)
             return j;
          return recursiveSearch(arr, i+1, j-1, k);
     }
    }

    
 
    
    

