package swingspinner;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener,ListSelectionListener,ChangeListener
{
    JComboBox cb;
    JList list;
    JSpinner sp1,sp2;
    JTextField tf;
    
    MyFrame()
    {
        super("Spinner Demo");
        
        String countries[]={"India","US","UK","Canada","Australia"};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Firday","Saturday","Sunday"}; 
        
        cb=new JComboBox(countries);
        list=new JList(months);
        list.setVisibleRowCount(5);
        tf=new JTextField(15);
        
        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2=new JSpinner(new SpinnerListModel(days));
        
        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);
        
        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        tf.setText((String)cb.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        tf.setText((String)list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) 
    {
        if(e.getSource()==sp1)
            tf.setText(sp1.getValue()+"");
        else
            tf.setText((String)sp2.getValue());
    }
    
}

public class SwingSpinner 
{
    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(300,300);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}



























/*JComboBox cb;
    JList list;
    JSpinner sp1,sp2;
    JTextField tf;
    MyFrame()
    {
        String countries[]={"India","US","UK","Canada","Australia"};
        String days[]={"Moday","Tuesday","Wednesday","Thursday","Firday","Saturday","Sunday"}; 
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        cb=new JComboBox(countries);
        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2=new JSpinner(new SpinnerListModel(days));
        sp2.setValue("Wednesday");
        list=new JList(months);
        tf=new JTextField(15);
        setLayout(new FlowLayout());
        
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);
        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
    }
    public void actionPerformed(ActionEvent ce)
    {
        tf.setText((String)cb.getSelectedItem());
    }
    public void stateChanged(ChangeEvent ce)
    {
        if(ce.getSource()==sp1)
            tf.setText(sp1.getValue()+"");
        else
            tf.setText(sp2.getValue()+"");

    }

    
    public void valueChanged(ListSelectionEvent e) 
    {
        
          tf.setText((String)list.getSelectedValue());

    }

    */