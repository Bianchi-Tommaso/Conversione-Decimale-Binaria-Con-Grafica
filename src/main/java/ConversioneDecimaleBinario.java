import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ConversioneDecimaleBinario extends JFrame implements ActionListener
{
    private Container c = new Container();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JTextField Decimale = new JTextField(15);
    private JTextField Binario = new JTextField(15);
    private JButton btnConverti = new JButton("Converti Decimale");
    private JButton btnConverti2 = new JButton("Converti Binario");
    
    public ConversioneDecimaleBinario()
    {
        c = this.getContentPane();
        c.setLayout(new GridLayout(3,2));
        this.setTitle("Coversione Decimale <-> Binario");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(400, 200);
        this.setResizable(false);
        
        p1.add(new JLabel("Numero Decimale"));
        p1.add(Decimale);
        p2.add(new JLabel("Numero Binario "));
        p2.add(Binario);
        p2.add(btnConverti2);
        
        c.add(p1);
        c.add(p2);
        c.add(btnConverti);
        c.add(btnConverti2);
        btnConverti.addActionListener(this);
        btnConverti2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Pila p = new Pila();
        String s = "";
        String evento = e.getActionCommand();
        String numeroletto = Decimale.getText();
        String binarioletto = Binario.getText();
        int Resto = 0;
        int N = Integer.parseInt(numeroletto);
        int B = 0;
        int i = 0;
        
        switch(evento)
        {
            case "Converti Decimale":
                do
                {
                    Resto = N % 2;
                    p.push(Resto);
                    N = (N - Resto) / 2;
                } while (N != 0);
                
                while(!p.vuota())
                    s += String.valueOf(p.pop());
                
                Binario.setText("" + s.toString());
                break;
                
            case "Converti Binario":
                
                B = Integer.parseInt(binarioletto,2);                
                Decimale.setText("" + B);
        }
    }
}
