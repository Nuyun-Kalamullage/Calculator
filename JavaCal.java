package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCal {

    private String console ="+";
    private double total1 =0.00;
    private double total2 =0.00;
    private JPanel JavaCal;
    private JTextField TextDisplay;
    private JButton BCE;
    private JButton BMinas;
    private JButton BPlus;
    private JButton BPersentage;
    private JButton BBack;
    private JButton BDevide;
    private JButton BMultiply;
    private JButton BEqual;
    private JButton B3;
    private JButton B2;
    private JButton B1;
    private JButton B4;
    private JButton B5;
    private JButton B6;
    private JButton B7;
    private JButton B8;
    private JButton B9;
    private JButton B0;
    private JButton BDot;
    private JButton BCl;

    public JavaCal() {
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B1Text = TextDisplay.getText() + B1.getText();
                TextDisplay.setText(B1Text);
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B2Text = TextDisplay.getText() + B2.getText();
                TextDisplay.setText(B2Text);
            }
        });
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B3Text = TextDisplay.getText() + B3.getText();
                TextDisplay.setText(B3Text);
            }
        });
        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B4Text = TextDisplay.getText() + B4.getText();
                TextDisplay.setText(B4Text);
            }
        });
        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B5Text = TextDisplay.getText() + B5.getText();
                TextDisplay.setText(B5Text);
            }
        });
        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B6Text = TextDisplay.getText() + B6.getText();
                TextDisplay.setText(B6Text);
            }
        });
        B7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B7Text = TextDisplay.getText() + B7.getText();
                TextDisplay.setText(B7Text);
            }
        });
        B8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B8Text = TextDisplay.getText() + B8.getText();
                TextDisplay.setText(B8Text);
            }
        });
        B9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B9Text = TextDisplay.getText() + B9.getText();
                TextDisplay.setText(B9Text);
            }
        });
        B0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B0Text = TextDisplay.getText() + B0.getText();
                TextDisplay.setText(B0Text);
            }
        });
        BDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(TextDisplay.getText().equals("")){
                    TextDisplay.setText("0.");
                }
                else if(TextDisplay.getText().contains(".")){
                    BDot.setEnabled(false);
                }
                else {
                    String BDotText =TextDisplay.getText() + BDot.getText();
                    TextDisplay.setText(BDotText);
                }
                BDot.setEnabled(true);
            }
        });
        BPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1=total1 + Double.parseDouble(TextDisplay.getText().replace("%",""));
                TextDisplay.setText("");
                console="+";
            }
        });
        BDevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1=total1 + Double.parseDouble(TextDisplay.getText().replace("%",""));
                TextDisplay.setText("");
                console="/";
            }
        });
        BMinas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1=total1 + Double.parseDouble(TextDisplay.getText().replace("%",""));
                TextDisplay.setText("");
                console="-";
            }
        });
        BMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1=total1 + Double.parseDouble(TextDisplay.getText().replace("%",""));
                TextDisplay.setText("");
                console = "*";
            }
        });
        BEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(console=="+"){
                    total2=total1+Double.parseDouble(TextDisplay.getText());
                }else if(console=="-"){
                    total2= total1 - Double.parseDouble(TextDisplay.getText());
                }else if (console=="/"){
                    total2= total1 / Double.parseDouble(TextDisplay.getText());
                }else if (console=="*"){
                    total2= total1 * Double.parseDouble(TextDisplay.getText());
                }
                TextDisplay.setText(Double.toString(total2));
                total1=0;
            }
        });
        BCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 =0;
                total2 =0;
                TextDisplay.setText("");
            }
        });
        BCl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                TextDisplay.setText("");
            }
        });
        BPersentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(TextDisplay.getText().equals("")){
                    TextDisplay.setText("0%");
                }
                else if(TextDisplay.getText().contains("%")){
                    BPersentage.setEnabled(false);
                }
                else {
                    String BPersentageText =Double.parseDouble(TextDisplay.getText())/100 + BPersentage.getText();
                    TextDisplay.setText(BPersentageText);
                }
                BPersentage.setEnabled(true);

            }
        });
        BBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String BBackText = TextDisplay.getText();
                if(BBackText==""){
                    BBack.setEnabled(false);
                    TextDisplay.setText("error");
                }else{
                BBackText = removeLastChars(BBackText, 1);
                TextDisplay.setText(BBackText);
                BBack.setEnabled(true);}

            }


        });

    }

    public static String removeLastChars(String str, int chars) {

        return str.substring(0, str.length() - chars);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new JavaCal().JavaCal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
