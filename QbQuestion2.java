import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.plaf.LabelUI;
public class QbQuestion2 extends Frame {
 private Font font=new Font("Tahoma",Font.BOLD,15);
 private Font font1=new Font("Tahoma",Font.PLAIN,16);

    QbQuestion2()
 {
    //for title of the form
    setTitle("Registration Form of Library");
    setVisible(true);
    setSize(500,650);
    setLayout(null);
    setBackground(Color.LIGHT_GRAY);
    //for heading of the form
    Label head=new Label("Registration Form",Label.CENTER);
    head.setBackground(Color.BLACK);
    head.setFont(font);
    head.setForeground(Color.WHITE);
    head.setBounds(0,30,500,30);
    head.setVisible(true);
    add(head);
    //for first name
    Label firstname=new Label("FirstName");
    firstname.setBounds(20, 80, 100, 30);
    firstname.setVisible(true);
    firstname.setFont(font);
    firstname.setForeground(Color.BLACK);
    add(firstname);
    //for first name
    TextField first=new TextField();
    first.setBounds(180,80,300,30);
    first.setVisible(true);
    first.setFont(font1);
    first.setForeground(Color.BLACK);
    add(first);
     //for second name
     Label secondname=new Label("SecondName");
     secondname.setBounds(20, 130, 100, 30);
     secondname.setVisible(true);
     secondname.setFont(font);
     secondname.setForeground(Color.BLACK);
     add(secondname);
     //for second name
     TextField second=new TextField();
     second.setBounds(180,130,300,30);
     second.setVisible(true);
     second.setFont(font1);
     second.setForeground(Color.BLACK);
     add(second);
      //for father name
      Label fathername=new Label("Fathername");
      fathername.setBounds(20, 180, 100, 30);
      fathername.setVisible(true);
      fathername.setFont(font);
      fathername.setForeground(Color.BLACK);
      add(fathername);
      //for father name
      TextField father=new TextField();
      father.setBounds(180,180,300,30);
      father.setVisible(true);
      father.setFont(font1);
      father.setForeground(Color.BLACK);
      add(father);
      //for selecting gender
      Label gender=new Label("Select Gender");
      gender.setBounds(20,230,140,30);
      gender.setFont(font);
      gender.setForeground(Color.BLACK);
      add(gender);
      CheckboxGroup cg=new CheckboxGroup();
      Checkbox c1=new Checkbox("Male",cg,true);
      Checkbox c2=new Checkbox("Female",cg,false);
      Checkbox c3=new Checkbox("Others",cg,false);
      c1.setBounds(170,230,50,30);
      c2.setBounds(230,230,70,30);
      c3.setBounds(310,230,70,30);
      add(c1);
      add(c2);
      add(c3);
      //for course selection
      Label course=new Label("Course");
      course.setBounds(20, 280, 100, 30);
      course.setForeground(Color.BLACK);
      course.setFont(font1);
      add(course);
      Choice c=new Choice();
      c.setBounds(170,286,50,20);
      c.setVisible(true);
      c.add("B.E.");
      c.add("B.Tech");
      add(c);
      //for fees receipt number
      Label fees=new Label("FeeRecptNo:");
     fees.setBounds(20, 330, 100, 30);
     fees.setVisible(true);
     fees.setFont(font);
     fees.setForeground(Color.BLACK);
     add(fees);
     TextField feesno=new TextField();
     feesno.setBounds(180,330,300,30);
     feesno.setVisible(true);
     feesno.setFont(font1);
     feesno.setForeground(Color.BLACK);
     add(feesno);
     //for phoneno receipt number
     Label phoneno=new Label("PhoneNo:");
     phoneno.setBounds(20, 380, 100, 30);
     phoneno.setVisible(true);
     phoneno.setFont(font);
     phoneno.setForeground(Color.BLACK);
     add(phoneno);
     TextField phonenono=new TextField();
     phonenono.setBounds(180,380,300,30);
     phonenono.setVisible(true);
     phonenono.setFont(font1);
     phonenono.setForeground(Color.BLACK);
     add(phonenono);
     //for signature
     Label Area= new Label("Signature");
     Area.setBounds(20, 430, 100, 30);
     Area.setFont(font);
     Area.setForeground(Color.BLACK);
     add(Area);
     TextArea area=new TextArea();
     area.setBounds(20, 460, 460, 100);
     area.setBackground(Color.WHITE);
     area.setFont(font1);
     add(area);
    //Buttons to submit or reset 
    Button b1=new Button("Submit");
    b1.setBounds(20, 580, 220, 50);
    b1.setBackground(Color.WHITE);
    add(b1);
    b1.addActionListener((new  ActionListener(){
    public void actionPerformed(ActionEvent e){
     if((first.getText().length()==0)||(second.getText().length()==0)||(father.getText().length()==0)||(feesno.getText().length()==0)||(phonenono.getText().length()==0)||(area.getText().length()==0))
     {
        head.setBackground(Color.RED);
        head.setText("Wrong Input");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ex)
        {
            throw new RuntimeException(ex); 
        }
     }
     else{
        head.setBackground(Color.GREEN);
        head.setText("Successful");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ex)
        {
            throw new RuntimeException(ex); 
        }
    }
    head.setBackground(Color.black);
    head.setText("Registration Form");
    
    }
    }
    )
    );
    Button b2=new Button("Reset");
    b2.setBounds(260, 580, 220, 50);
    b2.setBackground(Color.WHITE);
    add(b2);
    b2.addActionListener((new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        first.setText("");
        second.setText("");
        father.setText("");
        phonenono.setText("");
        feesno.setText("");
        area.setText("");
        
        }
        }));
 }   
 
    public static void main(String[] args) {
       QbQuestion2 qb=new QbQuestion2();
        
    }

    
}
