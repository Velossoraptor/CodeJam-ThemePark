import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class PanelStart extends JFrame implements ActionListener {
    
    public PanelStart(){
        setTitle("Target Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);


        JTextField powerInput = new JTextField("Power (N)");
        powerInput.setHorizontalAlignment(SwingConstants.RIGHT);
        powerInput.setBounds(20, 20, 80, 25);
        panel.add(powerInput);

        JTextField angle = new JTextField("Angle (drg)");
        angle.setHorizontalAlignment(SwingConstants.RIGHT);
        angle.setBounds(20, 50, 80, 25);
        panel.add(angle);

        JButton fireConfirm = new JButton("Shoot");
        fireConfirm.setBounds(30, 100, 80, 25);
        fireConfirm.addActionListener(this);
        panel.add(fireConfirm);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
