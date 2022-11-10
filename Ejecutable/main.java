package Ejecutable;

import modelo.Coordenada;


public class main 
{
  public static void main(String[] args) 
  {
    Coordenada C1 = new Coordenada(0,0);

    Coordenada C2 = new Coordenada(1.3, 5.3);

    Coordenada C3 = C1;

    Coordenada C4 = C2;

    System.out.println("Coordenada 1");
    System.out.println(" X = " + C1.getX());
    System.out.println(" Y = " + C1.getY());
    System.out.println(C1);
    System.out.println("Coordenada 2");
    System.out.println(" X = " + C2.getX());
    System.out.println(" Y = " + C2.getY());
    System.out.println(C2);

// Comparar Coordenadas    
    if (C3.equals(C1)==true ) {
    System.out.println("Las Coordenadas son iguales");
    }
    else
    {
        System.out.print("Las Coordenadas son distintas");
        
    } 
    if (C4.equals(C2)==true ) {
        System.out.println("Las Coordenadas son iguales");
        }
        else
        {
            System.out.print("Las Coordenadas son distintas");
            
        } 

// Calcular la distancia entre dos puntos

 }
}