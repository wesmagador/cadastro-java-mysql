package JFrame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

//@author Wesley

public class Painel extends JFrame implements ActionListener{
    
    public static String URL = "jdbc:mysql://localhost:3306/";
    
    //Declaração das variáveis
    JLabel lblNome;
    JTextField txtNome;
    JLabel lblCpf;
    JFormattedTextField ftxtCpf;
    JButton btnEnviar;
    JLabel cmbNome;
    JComboBox cmbCombo;
    JLabel dtaNome;
    JFormattedTextField ftxtData;
    JLabel slaNome;
    JFormattedTextField ftxtSalario;
    JLabel lblidade;
    JFormattedTextField ftxtidade;
    JLabel lblemail;
    JTextField txtemail;
    JLabel lblsexo;
    JComboBox cmbsexo;
    
    public Painel() throws ParseException{
        
     //Declaração dos objetos
     lblNome = new JLabel("Nome");
     txtNome = new JTextField();
     lblCpf = new JLabel("CPF");
     ftxtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
     
     btnEnviar = new JButton("Enviar");
     btnEnviar.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent ae) { {
             try {
                 //throw new UnsupportedOperationException("Not supported yet.");
                 btnEnviar.setToolTipText("Enviar dados");
                 Funcionario();
             } catch (SQLException ex) {
                 Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
             }
             } 
         }
     });
     
     cmbNome = new JLabel("Tipo de usuário");
     cmbCombo = new JComboBox(new Object[]{"Diretor", "Gestor", "Técnico"});
     cmbCombo.setToolTipText("Expandir");
     dtaNome = new JLabel("Data de Nascimento");
     ftxtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
     slaNome = new JLabel("Salário");
     ftxtSalario = new JFormattedTextField(new MaskFormatter("R$#.###,##"));
     ftxtidade = new JFormattedTextField(new MaskFormatter("##"));
     lblidade = new JLabel("Idade");
     lblemail = new JLabel("Email");
     txtemail = new JTextField();
     lblsexo = new JLabel("Sexo");
     cmbsexo = new JComboBox(new Object[]{"Masculino", "Feminino"});
     cmbsexo.setToolTipText("Expandir");
     
     
     //Configuração do Frame
     setSize(390, 550);
     setTitle("Cadastro de Colaboradores Supermarket");
     setLayout(null);
     
     
     //Posições (X, Y, LARGURA, ALTURA)
     lblNome.setBounds(0, 0, 100, 25);
     txtNome.setBounds(150, 0, 200, 25);
     lblCpf.setBounds(0, 50, 100, 25);
     ftxtCpf.setBounds(150, 50, 100, 25);
     btnEnviar.setBounds(150, 400, 100, 100);
     cmbNome.setBounds(0, 100, 200, 25);
     cmbCombo.setBounds(150, 100, 120, 25);
     dtaNome.setBounds(0, 150, 200, 25);
     ftxtData.setBounds(150, 150, 80, 25);
     slaNome.setBounds(0, 200, 200, 25);
     ftxtSalario.setBounds(150, 200, 80, 25);
     lblidade.setBounds(0, 250, 200, 25);
     ftxtidade.setBounds(150, 250, 25, 25);
     lblemail.setBounds(0, 300, 100, 25);
     txtemail.setBounds(150, 300, 200, 25);
     lblsexo.setBounds(0, 350, 200, 25);
     cmbsexo.setBounds(150, 350, 120, 25);
     
     
     //Adicionando itens
     getContentPane().add(lblNome);
     getContentPane().add(txtNome);
     getContentPane().add(lblCpf);
     getContentPane().add(ftxtCpf);
     getContentPane().add(btnEnviar);
     getContentPane().add(cmbNome);
     getContentPane().add (cmbCombo);
     getContentPane().add(dtaNome);
     getContentPane().add (ftxtData);
     getContentPane().add(slaNome);
     getContentPane().add (ftxtSalario);
     getContentPane().add(lblidade);
     getContentPane().add (ftxtidade);
     getContentPane().add(lblemail);
     getContentPane().add(txtemail);
     getContentPane().add(lblsexo);
     getContentPane().add (cmbsexo);
     
     
    }     

    public void Funcionario() throws SQLException {
        
        String nome=txtNome.getText();
        System.out.println(nome);
        
        String cpf=ftxtCpf.getText();
        System.out.println(cpf);
        String replace = cpf.replace(".", "");
        String replace1 = replace.replace("-", "");
        
        String combo=cmbCombo.getSelectedItem().toString();
        System.out.println(combo);
        
        String data=ftxtData.getText();
        System.out.println(data);
        String replace2 = data.replace("/", "");
        
        String salario=ftxtSalario.getText();
        System.out.println(salario);
        String replace3 = salario.replace(".", "");
        String replace4 = replace3.replace(",", "");
        String replace5 = replace4.replace("R$", "");
        
        String idade=ftxtidade.getText();
        System.out.println(idade);
        
        String email=txtemail.getText();
        System.out.println(email);
        String replace6 = email.replace(".", "");
        String replace7 = replace6.replace("@", "");
        
        String sexo=cmbsexo.getSelectedItem().toString();
        System.out.println(sexo);
        
        Connection con = (Connection) DriverManager.getConnection(URL,"","");
        Statement comandoSql = (Statement) con.createStatement();
        comandoSql.executeUpdate("insert into Colaboradores (nome,cpf,combo,data,salario,idade,email,sexo) values ('" + nome + "', '" + replace1 + "', '" + combo + "', '" + replace2 + "', '" + replace5 + "', '" + idade + "', '" + replace7 + "', '" + sexo + "')");
        con.close();
        
        JOptionPane.showMessageDialog(null, "Usuário " +nome+ " inserido com sucesso");
        
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
