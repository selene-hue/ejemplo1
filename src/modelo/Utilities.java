/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author David.Castro
 */
public class Utilities {

    public static boolean saveFile(LinkedList<Estudiante> le) throws IOException {
        boolean t = false;
        FileWriter fileWriter = new FileWriter("estudiantes.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (int i = 0; i < le.size(); i++) {
            Estudiante get = le.get(i);
            printWriter.println(get.toString());

        }
        t = true;
        printWriter.close();
        return t;
        //printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
    }

    public static LinkedList<Estudiante> readFile() throws IOException {
        LinkedList<Estudiante> le = new LinkedList<>();

        try {
            File myObj = new File("estudiantes.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.equals("")){
                    
                }else{
                    String[] arrLinea = data.split(",");
                le.add(new Estudiante(arrLinea[3], arrLinea[4], arrLinea[0], 
                        Integer.parseInt(arrLinea[1]), arrLinea[2]));
                }
                
//        System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return le;

    }

    public LinkedList<Estudiante> ordering(LinkedList<Estudiante> le) {
        LinkedList<Estudiante> lorden = new LinkedList<>();

        return lorden;
    }
    
}
