import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Thread1 extends Thread{ @Override
public void run() {
    new About();
}
}
public class About extends JFrame implements ActionListener{
    JButton b1;
    About(){
        setBounds(600, 200, 700,600);
        setLayout(null);



        JLabel l3 = new JLabel("<html>You Can find any help from here<br>Notepad is generic text editor" +
                "included with all versions of Microsoft Windows that lets you create,open and save your file");
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l3.setBounds(150, 130, 500, 300);
        add(l3);

        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
        setVisible(true);

    }

public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    }

