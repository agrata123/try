import javax.swing.JFrame;

public class MyFrame {
    public static void main(String [] args) {
        JFrame frmobj = new JFrame();
        
        frmobj.setTitle("OK Button");
        frmobj.setSize(450,300);
        frmobj.setResizable(false);
        frmobj.setVisible(true);
        frmobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}