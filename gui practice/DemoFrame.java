import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class DemoFrame extends JFrame  {

    JPanel panel;
    JButton btnOK;
   
    public DemoFrame() {
        super("OK Button");

        panel = new JPanel();
        getContentPane().add(panel);

        btnOK = new JButton("ok");
        panel.add(btnOK);
        ButtonListener blisten = new ButtonListener();
        btnOK.addActionListener(blisten);
        
        setSize(400,600);
        setVisible(true);
    }
    public class ButtonListener implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        Object obj = evt.getSource();
        if(obj == btnOK)
        {
            JOptionPane.showMessageDialog(null, "Button is clicked");
        }
    }
}

    public static void main(String [] args) {
        DemoFrame df = new DemoFrame();

    }

}