package mailer;

import com.itextpdf.text.Document;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Apergot
 */
public class MailBox {

    static final String FROM = "perdoflix@gmail.com";
    static final String FROMNAME = "PERDOFLIX";

    //static final String TO = "apergot95@gmail.com";
    static final String SMTP_USERNAME = "perdoflix@gmail.com";

    static final String SMTP_PASSWORD = "pelicula123";

    static final String CONFIGSET = "ConfigSet";

    static final String HOST = "smtp.gmail.com";

    static final int PORT = 587;

    static final String SUBJECT = "Perdoflix reservation confirmed!";

    static final String BODY = String.join(
            System.getProperty("line.separator"),
            "Reservation confirmed on Perdoflix",
            "Here you have a pdf document with your reservation details"
    );

    public static void sendMail(String email) throws Exception {
        String TO = email;
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");

        // Create a Session object
        Session session = Session.getDefaultInstance(props);
        // Create a message with the specified information. 
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM, FROMNAME));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        msg.setSubject(SUBJECT);
        msg.setContent(BODY, "text/html");

        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(BODY);
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        messageBodyPart = new MimeBodyPart();
        String filename = "D:/Netbeans_projects/PDFGenerator/prueba.pdf";
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);
        msg.setContent(multipart);
        
        // Add a configuration set header
        msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
        // Create a transport.
        Transport transport = session.getTransport();

        // Send the message.
        try {
            System.out.println("Sending...");

            // Connect to Google host using smtp user and password
            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);

            // Send the email.
            transport.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Email sent!");
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());
        } finally {
            transport.close();
        }
    }
}
