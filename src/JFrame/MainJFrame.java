package JFrame;

import java.text.ParseException;
import javax.swing.JFrame;

/**
 * @author wesle
 */
public class MainJFrame {
    
    /**
     * Classe principal(main) do código.
     * 
     * @param args String padrão.
     * @param JPanel criando painel do JFrame.
     * @param setVisible deixar vísivel o JFrame.
     * @param setDefaultCloseOperation fechar código ao fechar JFrame.
     * @param setResizable não deixar reajustável o JFrame.
     * @throws ParseException tira a exceção caso ocorra.
     */
    public static void main(String args[]) throws ParseException {
     
        Painel JPainel;
        JPainel = new Painel();
        JPainel.setVisible(true);
        JPainel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPainel.setResizable(false);
  
 }
    
}
