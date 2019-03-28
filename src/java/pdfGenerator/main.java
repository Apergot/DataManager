/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfGenerator;

import com.itextpdf.text.DocumentException;
import dbws.Reservation;
import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        int id = getReservationId("apergot95@gmail.com");
        Reservation reservation = getReservation(id);        
        
        String pdfbody = 
                "Thank you for your reservation, as soon as you have gotten this message, we have\n "
                + "have received your client info and we are preparing your reservation for you to come\n"
                + "over at the time you specified. You can show this pdf at our videoclub with the following\n"
                + "data:\n"
                +"Client name: "+reservation.getName()+
                "\nClient phone:" +reservation.getPhone()+
                "\nPick up date:" +reservation.getDate()+
                "\nPidck up time:" +reservation.getTime()+
                "\nnMovie id: " +reservation.getMovieId()+
                "\n\n Remember we are open 24 hrs, even if we are close, we have an automatic dispenser.";
        
        pdfGenerator prueba = new pdfGenerator(pdfbody, "prueba");
        
    }

    private static Reservation getReservation(int id) {
        dbws.AddDB_Service service = new dbws.AddDB_Service();
        dbws.AddDB port = service.getAddDBPort();
        return port.getReservation(id);
    }

    private static int getReservationId(java.lang.String email) {
        dbws.AddDB_Service service = new dbws.AddDB_Service();
        dbws.AddDB port = service.getAddDBPort();
        return port.getReservationId(email);
    }
}
