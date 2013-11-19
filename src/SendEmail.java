
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LifeBook
 */
public class SendEmail {

    public SendEmail(String mesaj) {
        
        
final String username = "esaruhan43@gmail.com";
		final String password = "ertugrulsaruhan";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("esaruhan43@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("macit.yesilyurt@eba.gov.tr"));
			message.setSubject("Testing Subject");
			message.setText("Sayın Macit Abim ,"
				+ "\n\n Bu mesaj otomatik bir mesajla olmakla birlikte"
                                + "\n\n bilgisayarımın bataryasının az olduğunu göstermektedir"
                                + "\n\n Bataryam %30 un altına düşmüştür, şarjı artık benim bilgisayarıma takabilirmisin abicim ?"
                                + "\n\n "
                                + "\n\n "
                                + "\n\n Batarya Durumum Şu anki : "
                                + "\n\n "+mesaj);
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }
    
    
    
    
}
