package main;// Java-программа для реализации
// Простая форма регистрации
// используя Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Main

        extends JFrame
        implements ActionListener {
    // Компоненты формы

    private Container c;
    private JLabel name;
    private JTextField tname;
    private JLabel surname;
    private JTextField tsurname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel quantity;
    private JTextField tquantity;
    private JLabel wages;
    private JTextField twages;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
// через календарь
    private String dates[]

            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };

    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    // конструктор для инициализации компонентов

    // со значениями по умолчанию.

    public Main()
    {
        setTitle("Registration Form");
        setBounds(300, 70, 900, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);

        JLabel title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Имя");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        surname = new JLabel("Фамилия");
        surname.setFont(new Font("Arial", Font.PLAIN, 20));
        surname.setSize(100, 20);
        surname.setLocation(100, 130);
        c.add(surname);

        tsurname = new JTextField();
        tsurname.setFont(new Font("Arial", Font.PLAIN, 15));
        tsurname.setSize(190, 20);
        tsurname.setLocation(200, 130);
        c.add(tsurname);

        mno = new JLabel("Телефон");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 160);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(200, 160);
        c.add(tmno);

        quantity = new JLabel("Сумма");
        quantity.setFont(new Font("Arial", Font.PLAIN, 20));
        quantity.setSize(100, 20);
        quantity.setLocation(100, 200);
        c.add(quantity);

        tquantity = new JTextField();
        tquantity.setFont(new Font("Arial", Font.PLAIN, 15));
        tquantity.setSize(190, 20);
        tquantity.setLocation(200, 200);
        c.add(tquantity);

        wages = new JLabel("З/П");
        wages.setFont(new Font("Arial", Font.PLAIN, 20));
        wages.setSize(100, 20);
        wages.setLocation(100, 250);
        c.add(wages);

        twages = new JTextField();
        twages.setFont(new Font("Arial", Font.PLAIN, 15));
        twages.setSize(190, 20);
        twages.setLocation(200, 250);
        c.add(twages);

        gender = new JLabel("Пол");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 470);
        c.add(gender);

        male = new JRadioButton("Муж");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 470);
        c.add(male);

        female = new JRadioButton("Жен");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 470);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("Дата");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 500);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 500);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(260, 500);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 500);
        c.add(year);

        add = new JLabel("Адрес");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 550);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 550);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Подтверждение.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 650);
        c.add(term);

        sub = new JButton("Отправить");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 700);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Обновить");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 700);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 600);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 720);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }
    // метод actionPerformed ()
    // чтобы выполнить действие
    // пользователем и действуем соответственно
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                        = "Name : "
                        + tname.getText() + "\n"
                        +"Surname : "
                        + tsurname.getText() + "\n"
                        + "Mobile : "
                        + "Сумма желаемого кредита : "
                        + tquantity.getText() + "\n"
                        + "Ваша зп : "
                        + twages.getText() + "\n"
                        + tmno.getText() + "\n";

                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";

                String data2
                        = "DOB : "
                        + (String)date.getSelectedItem()
                        + "/" + (String)month.getSelectedItem()
                        + "/" + (String)year.getSelectedItem()
                        + "\n";

                String data3 = "Address : " + tadd.getText();

                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);

                res.setText("Registration Successfully..");

            }

            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tquantity.setText(def);
            twages.setText(def);
            tsurname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
// Код драйвера

class Registration {

    public static void main(String[] args) throws Exception
    {
        Main f = new Main();
    }
}