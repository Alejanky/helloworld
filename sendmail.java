import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;

public class sendmail{

public static void main (String[] poi){

    final String username = "terminallyquack@gmail.com";
    final String password = "terminal97";

    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");


    Session session = Session.getInstance(props,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication (username, password);
        }
    });

    try{
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("poi@poi.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("terminallyquack@gmail.com"));
        message.setSubject("Test Email");
        message.setText("Message");
        Transport.send(message);

        System.out.println("The message was sent");


        } 
        catch (MessagingException e){
            throw new RuntimeException(e);
        }
    }
}