import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;

public class projet {
    public static void main(String[] agrs) {
                JFrame fenetre = new JFrame("Nouveau projet");
                JButton btn = new JButton("Cliquez ici");
                ;

                String[] colum = new String[] {
                    "Nom", "Prenom", "Telephone", "A temps partiel"};

                    Object[][] data = new Object[][] {
                        {"Thomas", "Paris", 20.0, true },
                        {"Jean", "Marseille", 50.0, false },
                        {"Yohan", "Lyon", 30.0, true },
                        {"Emily", "Toulouse", 60.0, false },
                        {"Alex", "Nice", 10.0, false },
                    };
                
                JTable table = new JTable (data, colum);
                table.setBounds(30, 200, 200, 100);

                JLabel text1 = new JLabel("Nom :");
                text1.setBounds(30,40,200,30);

                JTextField a = new JTextField("");
                a.setBounds(130,40,200,25);

                JLabel text2 = new JLabel("Prénom :");
                text2.setBounds(30,80,200,30);

                JTextField b = new JTextField("");
                b.setBounds(130,80,200,25);

                JLabel text3 = new JLabel("Téléphone :");
                text3.setBounds(30,120,200,30);

                JTextField c = new JTextField("");
                c.setBounds(130,120,200,25);

                btn.setBounds(30, 160,200,30);
                btn.setForeground(Color.BLACK);
                btn.setBackground(Color.WHITE);
                Border line = new LineBorder(Color.BLACK);
                Border margin = new EmptyBorder(5, 15, 5, 15);
                Border compound = new CompoundBorder(line, margin);
                btn.setBorder(compound);


                fenetre.add(text1);
                fenetre.add(text2);
                fenetre.add(text3);
                fenetre.add(btn);
                fenetre.add(a);
                fenetre.add(b);
                fenetre.add(c);
                fenetre.add(table);



             





                fenetre.setSize(255, 255);
                fenetre.setLayout(null);
                fenetre.setVisible(true);
                
    }
    
}
