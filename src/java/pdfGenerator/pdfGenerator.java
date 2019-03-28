/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfGenerator;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Apergot
 */

public class pdfGenerator {
    
    private final String body;
    private final String name;
    private Document document;
    
    public pdfGenerator(String body, String name) throws DocumentException, FileNotFoundException{
        this.body = body;
        this.name = name;
        InitDocument(body, name, document);
    }
    
    public void InitDocument(String body, String name, Document document) throws DocumentException, FileNotFoundException{
        document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(name + ".pdf"));
        document.open();
        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, BaseColor.BLACK);
        Paragraph p = new Paragraph();
        p.add(body);
        document.add(p);
        document.close();
        //return document;
    }

    public Document getDocument() {
        return document;
    }

    public String getBody() {
        return body;
    }

    public String getName() {
        return name+".pdf";
    }    
}