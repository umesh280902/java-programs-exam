import java.awt.*;
import java.util.EventListener;

//import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
public class QbQuestion2 extends Frame implements EventListener{
    QbQuestion2(){
        setTitle("Registration Form");
        Label l1=new Label("Surname Name: ");
        Label l2=new Label("First Name: ");
        Label l3=new Label("Father's Name: ");
        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField t3=new TextField();
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        l1.setBounds(20,80,90,30);
        t1.setBounds(70,80,270,30);
        t1.addActionListener(null);
        t1.addTextListener(null);
        l2.setBounds(20,120,90,30);
        t2.setBounds(70,120,270,30);
        // l3.setBounds(20,160,90,30);
        // t3.setBounds(70,160,270,30);
        
        
        // Button b=new Button("Click Me!!");
        // b.setBounds(15,50,80,30);
        // add(b);
        // setLayout(null);
        setVisible(true);
        setSize(600,600);
    }
    public static void main(String[] args) {
       QbQuestion2 qb=new QbQuestion2();
        
    }

    
}
