import javax.imageio.ImageIO.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Initiation {
    private static Object ImageIO;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome the League Soccer");
        JButton boton = new JButton("Enter");
        boton.setBounds(250,250,95,30);
        frame.add(boton);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setVisible(true);

    }
}