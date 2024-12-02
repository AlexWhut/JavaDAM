package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnSi, btnNo;
    private JLabel lblTitulo;

    public Code() {
        // Configuración de la ventana
        this.setSize(500, 500);
        this.setTitle("Apostemos 10€ a que no le puedes dar al No");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Evitar que la ventana se maximice
        this.setResizable(false);

        // Cambiar color de fondo de la ventana
        this.getContentPane().setBackground(Color.BLACK);

        // Crear y configurar el título
        lblTitulo = new JLabel("a ver son 10€");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setSize(lblTitulo.getPreferredSize());
        int xTitulo = (getWidth() - lblTitulo.getWidth()) / 2;
        lblTitulo.setLocation(xTitulo, 100);
        this.add(lblTitulo);

        // Crear y configurar el botón "Sí"
        btnSi = new JButton("Sí");
        btnSi.setBounds(150, 200, 80, 30);
        btnSi.setBackground(Color.GREEN);
        btnSi.setForeground(Color.BLACK);
        btnSi.setFocusPainted(false); // Evitar el borde de enfoque
        btnSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Gracias: paypal.me/alexwhut");
            }
        });
        this.add(btnSi);

        // Crear y configurar el botón "No"
        btnNo = new JButton("No");
        btnNo.setBounds(250, 200, 80, 30);
        btnNo.setBackground(Color.RED);
        btnNo.setForeground(Color.WHITE);
        btnSi.setFocusPainted(false); 
        btnNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int maxX = getWidth() - btnNo.getWidth() - 20;
                int maxY = getHeight() - btnNo.getHeight() - 40;
                int x = (int) (Math.random() * maxX);
                int y = (int) (Math.random() * maxY);
                btnNo.setLocation(x, y);
            }
        });
        this.add(btnNo);
    }
}
