/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lexer_v01;

import java.io.File;

/**
 *
 * @author cereb
 */
public class Proyecto_Lexer_V01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "C://Users//cereb//Documents//NetBeansProjects//Proyecto_Lexer_V01//src//proyecto_lexer_v01//Lexer.flex";
        generarLexer(path);
    }
      
     public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
}
