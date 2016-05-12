import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;

public class sendmail
{
 private static guardias x =new guardias(10,10,"AlejandroVenegas","testcorreocetysiot@gmail.com");
  public static void main (String[] poi)
  {
    int algo;
    String y;
    y= new String(x.getcorr());
    algo=Integer.parseInt(poi[1]);
    if((algo/2)==0)
    {
      correos(y);
    }
    else
    {
      System.out.println("No se manda correo ya que la persona se encuentra dentro del hogar");
    }// if(asdasd)
  }//public static void main (String[] poi)
  public  static void correos(String algocorreo)
  {
    final String username = "terminallyquack@gmail.com";
    final String password = "terminal97";
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");
    Session session = Session.getInstance
    (
    props,new javax.mail.Authenticator()
     {
        protected PasswordAuthentication getPasswordAuthentication()
        {
          return new PasswordAuthentication (username, password);
        }
      }
    );

    try
    {
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("poi@poi.com"));
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(algocorreo));
      message.setSubject("Test Email");
      message.setText("Message");
      Transport.send(message);
      System.out.println("The message was sent");
    }
    catch (MessagingException e)
    {
      throw new RuntimeException(e);
    }
  }//
}// public class sendmail
