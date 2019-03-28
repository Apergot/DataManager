/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfGenerator;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        pdfGenerator prueba = new pdfGenerator("probando", "prueba");
        
    }
}
