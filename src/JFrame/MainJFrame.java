package JFrame;

import java.text.ParseException;
import javax.swing.JFrame;

//@author Wesley
public class MainJFrame {
    
    public static void main(String args[]) throws ParseException {
     
        Painel JPainel;
        JPainel = new Painel();
        JPainel.setVisible(true);
        JPainel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPainel.setResizable(false);
  
 }
    
}
