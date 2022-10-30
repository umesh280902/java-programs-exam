import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class QbQuestion10 extends Frame {
    private Font font=new Font("Tahoma",Font.BOLD,15);
    private Font font1=new Font("Tahoma",Font.PLAIN,16);
    QbQuestion10()
    {
        //for the title and background color of the form
        setTitle("Registration Form");
        setVisible(true);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setSize(500,650);
        //for the heading 
        Label head=new Label("Registration Form",Label.CENTER);
        head.setBackground(Color.BLACK);
        head.setFont(font);
        head.setForeground(Color.WHITE);
        head.setBounds(0,30,500,30);
        add(head);
        // for the naming of the form
        Label l1=new Label("Name");
        l1.setBounds(20,70,130,30);
        l1.setForeground(Color.BLACK);
        l1.setFont(font);
        add(l1);
        // for the naming of the form
        TextField name=new TextField();
        name.setBounds(20,105,460,30);
        name.setForeground(Color.BLACK);
        name.setFont(font1);
        add(name);
        CheckboxGroup cg=new CheckboxGroup();
        Label gender=new Label("Select Gender");
        gender.setBounds(20,155,130,30);
        gender.setForeground(Color.BLACK);
        gender.setFont(font);
        add(gender);
        Checkbox c1=new Checkbox("Male",cg,true);
        Checkbox c2=new Checkbox("Female",cg,false);
        Checkbox c3=new Checkbox("Others",cg,false);
        c1.setBounds(160,155,60,30);
        c2.setBounds(240,155,70,30);
        c3.setBounds(330,155,70,30);
        c1.setFont(font1);
        c2.setFont(font1);
        c3.setFont(font1);
        add(c1);
        add(c2);
        add(c3);
        CheckboxGroup cg1=new CheckboxGroup();
        Label marriagestatus=new Label("Marriagestatus");
        marriagestatus.setBounds(20,205,130,30);
        marriagestatus.setForeground(Color.BLACK);
        marriagestatus.setFont(font);
        add(marriagestatus);
        Checkbox Married=new Checkbox("Married",cg1,true);
        Checkbox Unmarried=new Checkbox("Unmarried",cg1,false);
        Married.setBounds(160,205,80,30);
        Unmarried.setBounds(260,205,100,30);
        Married.setFont(font1);
        Unmarried.setFont(font1);
        add(Married);
        add(Unmarried);
        Label course=new Label("Course");
        course.setBounds(20, 255, 100, 30);
        course.setForeground(Color.BLACK);
        course.setFont(font);
        add(course);
        Choice c=new Choice();
        c.setBounds(160,261,80,20);
        c.setVisible(true);
        c.setFont(font1);
        c.add("B.E.");
        c.add("B.Tech");
        add(c);
        
        }
    public static void main(String[] args)
    {
        QbQuestion10 qb=new QbQuestion10();

    }
}
