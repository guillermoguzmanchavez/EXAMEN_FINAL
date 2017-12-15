/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import java.io.File;
import java.io.FileWriter;

public class jasontxt
{
public static void main(String []args)
{


String saludo="Hola";
 
try
{

File archivo=new File("texto.txt");

FileWriter escribir=new FileWriter(archivo,true);

escribir.write(saludo);

escribir.close();
}

catch(Exception e)
{
System.out.println("Error al escribir");
}
}
}

