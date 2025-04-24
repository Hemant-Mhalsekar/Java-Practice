package Expt_6;

import java.awt.*;
import java.awt.event.*;

public class MCA6 extends Frame implements ActionListener {
    Label nl, idl, dl, gen, sk;
    TextField nf, id, df;
    CheckboxGroup gender;
    Checkbox ma, fem;
    Checkbox javaCB, pythonCB, csharpCB;
    Button submitBtn;

    public MCA6() {
        setTitle("Employee Profile Form - AWT");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        nl = new Label("Name:");
        nl.setBounds(50, 50, 100, 20);
        add(nl);

        nf = new TextField();
        nf.setBounds(160, 50, 150, 20);
        add(nf);

        idl = new Label("Employee ID:");
        idl.setBounds(50, 90, 100, 20);
        add(idl);

        id = new TextField();
        id.setBounds(160, 90, 150, 20);
        add(id);

        dl = new Label("Designation:");
        dl.setBounds(50, 130, 100, 20);
        add(dl);

        df = new TextField();
        df.setBounds(160, 130, 150, 20);
        add(df);

        gen = new Label("Gender:");
        gen.setBounds(50, 170, 100, 20);
        add(gen);

        gender = new CheckboxGroup();

        ma = new Checkbox("Male", gender, false);
        ma.setBounds(160, 170, 60, 20);
        add(ma);

        fem = new Checkbox("Female", gender, false);
        fem.setBounds(230, 170, 70, 20);
        add(fem);

        sk = new Label("Skills:");
        sk.setBounds(50, 210, 100, 20);
        add(sk);

        javaCB = new Checkbox("Java");
        javaCB.setBounds(160, 210, 60, 20);
        add(javaCB);

        pythonCB = new Checkbox("Python");
        pythonCB.setBounds(230, 210, 70, 20);
        add(pythonCB);

        csharpCB = new Checkbox("C#");
        csharpCB.setBounds(310, 210, 50, 20);
        add(csharpCB);

        submitBtn = new Button("Submit");
        submitBtn.setBounds(160, 260, 80, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);
    }

    public void actionPerformed(ActionEvent ae) {
        String name = nf.getText();
        String i = id.getText();
        String designation = df.getText();
        String gender = "";

        if (ma.getState()) gender = "Male";
        else if (fem.getState()) gender = "Female";
        else gender = "Not selected";

        String skills = "";
        if (javaCB.getState()) skills += "Java ";
        if (pythonCB.getState()) skills += "Python ";
        if (csharpCB.getState()) skills += "C# ";

        System.out.println("=== Employee Profile ===");
        System.out.println("Name      : " + name);
        System.out.println("Employee ID: " + i);
        System.out.println("Designation: " + designation);
        System.out.println("Gender     : " + gender);
        System.out.println("Skills     : " + skills.trim());
    }

    public static void main(String[] args) {
        new MCA6();
    }
}
