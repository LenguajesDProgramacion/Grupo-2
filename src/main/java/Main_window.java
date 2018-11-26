import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main_window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("League of Futbol Soccer");
        JMenuBar menuBar = new JMenuBar();


        JMenu menuArchivo = new JMenu("Register");
        JMenuItem menuItem1 = new JMenuItem("Record Players");
        JMenuItem menuItem2 = new JMenuItem("Record Team");
        JMenuItem menuItem3 = new JMenuItem("Record Arbitrators");
        JMenuItem menuItem4 = new JMenuItem("Views Players");
        JMenuItem menuItem5 = new JMenuItem("Exit");

        JMenu menuArchivo1 = new JMenu("Schedule");
        JMenuItem menuItem6 = new JMenuItem("Date Matchs");

        JMenu menuArchivo2 = new JMenu("Table Position");
        JMenuItem menuItem7 = new JMenuItem("Position");

        menuArchivo.add(menuItem1);
        menuArchivo.add(menuItem2);
        menuArchivo.add(menuItem3);
        menuArchivo.add(menuItem4);
        menuArchivo.add(menuItem5);
        menuBar.add(menuArchivo);
        menuBar.add(menuArchivo1);
        menuBar.add(menuArchivo2);

        menuArchivo1.add(menuItem6);
        menuArchivo2.add(menuItem7);

        menuItem5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        JLabel background;
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

        ImageIcon img = new ImageIcon("../descarga.jpg");
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1200,700);
        frame.add(background);
    }
}
