/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava001;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alessandro
 */
public class Prjava001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer.html");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

            bw.write("<html>");
            bw.newLine();
            bw.write("  <head>");
            bw.newLine();
            bw.write("    <title>");
            bw.newLine();

            bw.write("      Nova p&agrave;gina  web");
            bw.newLine();

            bw.write("    </title>");
            bw.newLine();
            bw.write("  </head>");
            bw.newLine();
            bw.write("  <body>");
            
            bw.write("    <h1>DAW2 m08uf4pr2</h1>");
            bw.newLine(); 
            
            bw.newLine();

            bw.write("    Nova p&agrave;gina web");
            bw.newLine();
            bw.write("  </body>");
            bw.newLine();
            bw.write("</html>");
            bw.newLine();

            bw.close();
        }
    }

}
