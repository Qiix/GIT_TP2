/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.util.Scanner;

/**
 *
 * @author i__t__s
 */
public class Main {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
  
        
       /*
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    char monChar= sc.next().charAt(0); 
    char charMystere;
    int nombreMystere;
    nombreMystere = (int)(Math.random() * (122+1-97))+97;
    charMystere = (char)nombreMystere;
    */
    /* Tri par selection 
    for (i=0;i<n-1;i++)
    {
        min=i ;
        for (j=i+1;j<n;j++)              // Recherche du minimum en commençant à partir de l'indice i+1
        {  
            if (T[j]<T[min])
             min=j;
        }
        tampon=T[i];
        T[i]=T[min];
        T[min]=tampon;
        }

    */
    
    
    /* Tri à bulles
    do
    {
    permut = 0;                          // initialement pas de permutation
    for( i = 0 ; i < n-1 ; i++ )
    {
    if ( T [i] > T [i+1] )            
       {  // permutation
           aux = T[i];
           T[i] = T[i+1];
           T[i+1] = aux ;
            permut = 1;             // on a fait une permutation
         }
    }
    }
    while (permut == 1);

    */
    
    
    /* Tri par insertion 
    
    for (i=1;i<n;i++)
    {
       tmp  = T[i];    // mémoriser T[i] dans une variable tmp
       j = i;

    // décaler vers la droite les éléments de T[0]..T[i-1] qui sont plus grands que tmp en 
    // partant de T[i-1]
      while(j > 0 && (T[j-1] > tmp ))
       {
          T[j] = T[j-1];
          j--;
       }
       T[j] = tmp;
    }

    */
    
    
    /* Recherche dichotomique :
    
    trouve = -1;  debut = 0 ;  fin = n-1 ;
    while ((trouve == -1)&&(debut <= fin ))
    {
        milieu = (debut + fin)/2;
        if (T[milieu] > X )
            fin=milieu - 1;
        else if (T[milieu] < X)
            debut = milieu + 1;
        else 
            trouve=1;
    }

    */
    /*
    System.out.println(charMystere);
    System.out.println(nombreMystere); 
    
    */
            
    }
    }
   