package GUI_Caculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Storage_ConvertPanel extends JPanel {
    private Border border = BorderFactory.createLineBorder(Color.black,2);
    private JPanel subPanel1 = new JPanel();
    private JPanel subPanel2 = new JPanel();
    private JPanel subPanel3 = new JPanel();
    private JPanel subPanel2_1 = new JPanel();
    private JPanel subPanel2_2 = new JPanel();
    private JLabel title = new JLabel("STORAGE CONVERT",JLabel.CENTER);
    private JTextField jTextField = new JTextField();

    private JButton jButton1 = new JButton("<~~");
    private JButton jButton2 = new JButton("1");
    private JButton jButton3 = new JButton("2");
    private JButton jButton4 = new JButton("3");
    private JButton jButton6 = new JButton("4");
    private JButton jButton7 = new JButton("5");
    private JButton jButton8 = new JButton("6");
    private JButton jButton9 = new JButton("7");
    private JButton jButton10 = new JButton("8");
    private JButton jButton11 = new JButton("BYTES");
    private JButton jButton12 = new JButton("0");
    private JButton jButton16 = new JButton("TBYTES");
    private JButton jButton17 = new JButton("PBYTES");
    private JButton jButton18 = new JButton("KBYTES");
    private JButton jButton19 = new JButton("CONVERT");
    private JButton jButton22 = new JButton("GBYTES");
    private JButton jButton23 = new JButton("MBYTES");
    private JButton jButton24 = new JButton("AC");
    private JButton jButton25 = new JButton("BACK");
    private JButton jButton26 = new JButton("EXIT");
    private JButton jButton27 = new JButton("9");

    private void createTitle(){
        title.setPreferredSize(new Dimension(1200,50));
        title.setFont(new Font("arial", Font.BOLD,60));
    }
    private void createSubPanel1(){
        subPanel1.setPreferredSize(new Dimension(1920,100));
        subPanel1.setBackground(Color.cyan);
        subPanel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(50,100,0,100);
        gbc.anchor = GridBagConstraints.CENTER;
        createTitle();
        subPanel1.add(title,gbc);
    }
    private void createTextField(){
        jTextField.setBorder(border);
        jTextField.setBackground(Color.white);
        jTextField.setOpaque(true);
        jTextField.setColumns(20);
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.setFont(new Font("ariel", Font.BOLD,45));
    }
    private void createSubPanel2_1(){
        createTextField();
        subPanel2_1.setPreferredSize(new Dimension(1920,150));
        subPanel2_1.setBackground(Color.cyan);
        subPanel2_1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,50,10,50);
        gbc.gridy=0;
        gbc.gridx=0;
        gbc.anchor = GridBagConstraints.CENTER;
        subPanel2_1.add(jTextField,gbc);
    }
    private void createSubPanel2_2(){
        subPanel2_2.setPreferredSize(new Dimension(1920,650));
        subPanel2_2.setBackground(Color.cyan);
        subPanel2_2.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        createButton();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton1,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton2,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton3,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=3;
        gbc.gridy=0;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton4,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton6,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton7,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=3;
        gbc.gridy=1;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton8,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton9,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=2;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton10,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton11,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=3;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton12,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=4;
        gbc.gridy=4;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton16,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=3;
        gbc.gridy=4;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton17,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton18,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=4;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton19,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton22,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=3;
        gbc.gridy=3;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton23,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=4;
        gbc.gridy=0;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton24,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=3;
        gbc.gridy=2;
        gbc.insets = new Insets(10,10,10,10);
        subPanel2_2.add(jButton27,gbc);

    }
    private void createSubPanel2(){
        subPanel2.setPreferredSize(new Dimension(1920,800));
        subPanel2.setBackground(Color.cyan);
        subPanel2.setLayout(new BorderLayout());
        createSubPanel2_1();
        subPanel2.add(subPanel2_1,BorderLayout.NORTH);
        createSubPanel2_2();
        subPanel2.add(subPanel2_2,BorderLayout.CENTER);

    }
    private void createButton(){
        StringBuilder texts = new StringBuilder(" ");
        jButton1.setBorder(border);
        jButton1.setBackground(Color.white);
        jButton1.setOpaque(true);
        jButton1.setPreferredSize(new Dimension(200,50));
        jButton1.setFont(new Font("arial", Font.BOLD,30));
        jButton1.addActionListener(e -> {
            texts.delete(texts.length()-1,texts.length());
            jTextField.setText(String.valueOf(texts));
        });

        jButton2.setBorder(border);
        jButton2.setBackground(Color.white);
        jButton2.setOpaque(true);
        jButton2.setPreferredSize(new Dimension(200,50));
        jButton2.setFont(new Font("arial", Font.BOLD,30));
        jButton2.addActionListener(e -> {
            texts.append("1");
            jTextField.setText(String.valueOf(texts));
        });

        jButton3.setBorder(border);
        jButton3.setBackground(Color.white);
        jButton3.setOpaque(true);
        jButton3.setPreferredSize(new Dimension(200,50));
        jButton3.setFont(new Font("arial", Font.BOLD,30));
        jButton3.addActionListener(e -> {
            texts.append("2");
            jTextField.setText(String.valueOf(texts));
        });

        jButton4.setBorder(border);
        jButton4.setBackground(Color.white);
        jButton4.setOpaque(true);
        jButton4.setPreferredSize(new Dimension(200,50));
        jButton4.setFont(new Font("arial", Font.BOLD,30));
        jButton4.addActionListener(e -> {
            texts.append("3");
            jTextField.setText(String.valueOf(texts));
        });

        jButton6.setBorder(border);
        jButton6.setBackground(Color.white);
        jButton6.setOpaque(true);
        jButton6.setPreferredSize(new Dimension(200,50));
        jButton6.setFont(new Font("arial", Font.BOLD,30));
        jButton6.addActionListener(e -> {
            texts.append("4");
            jTextField.setText(String.valueOf(texts));
        });

        jButton7.setBorder(border);
        jButton7.setBackground(Color.white);
        jButton7.setOpaque(true);
        jButton7.setPreferredSize(new Dimension(200,50));
        jButton7.setFont(new Font("arial", Font.BOLD,30));
        jButton7.addActionListener(e -> {
            texts.append("5");
            jTextField.setText(String.valueOf(texts));
        });

        jButton8.setBorder(border);
        jButton8.setBackground(Color.white);
        jButton8.setOpaque(true);
        jButton8.setPreferredSize(new Dimension(200,50));
        jButton8.setFont(new Font("arial", Font.BOLD,30));
        jButton8.addActionListener(e -> {
            texts.append("6");
            jTextField.setText(String.valueOf(texts));
        });

        jButton9.setBorder(border);
        jButton9.setBackground(Color.white);
        jButton9.setOpaque(true);
        jButton9.setPreferredSize(new Dimension(200,50));
        jButton9.setFont(new Font("arial", Font.BOLD,30));
        jButton9.addActionListener(e -> {
            texts.append("7");
            jTextField.setText(String.valueOf(texts));
        });

        jButton10.setBorder(border);
        jButton10.setBackground(Color.white);
        jButton10.setOpaque(true);
        jButton10.setPreferredSize(new Dimension(200,50));
        jButton10.setFont(new Font("arial", Font.BOLD,30));
        jButton10.addActionListener(e -> {
            texts.append("8");
            jTextField.setText(String.valueOf(texts));
        });

        jButton11.setBorder(border);
        jButton11.setBackground(Color.white);
        jButton11.setOpaque(true);
        jButton11.setPreferredSize(new Dimension(200,50));
        jButton11.setFont(new Font("arial", Font.BOLD,30));
        jButton11.addActionListener(e -> {
            texts.append(" BYTES : ");
            jTextField.setText(String.valueOf(texts));
        });

        jButton12.setBorder(border);
        jButton12.setBackground(Color.white);
        jButton12.setOpaque(true);
        jButton12.setPreferredSize(new Dimension(200,50));
        jButton12.setFont(new Font("arial", Font.BOLD,30));
        jButton12.addActionListener(e -> {
            texts.append("0");
            jTextField.setText(String.valueOf(texts));
        });

        jButton16.setBorder(border);
        jButton16.setBackground(Color.white);
        jButton16.setOpaque(true);
        jButton16.setPreferredSize(new Dimension(200,50));
        jButton16.setFont(new Font("arial", Font.BOLD,30));
        jButton16.addActionListener(e -> {
            texts.append("  TBYTES: ");
            jTextField.setText(String.valueOf(texts));
        });

        jButton17.setBorder(border);
        jButton17.setBackground(Color.white);
        jButton17.setOpaque(true);
        jButton17.setPreferredSize(new Dimension(200,50));
        jButton17.setFont(new Font("arial", Font.BOLD,30));
        jButton17.addActionListener(e -> {
            texts.append("  PBYTES: ");
            jTextField.setText(String.valueOf(texts));
        });

        jButton18.setBorder(border);
        jButton18.setBackground(Color.white);
        jButton18.setOpaque(true);
        jButton18.setPreferredSize(new Dimension(200,50));
        jButton18.setFont(new Font("arial", Font.BOLD,30));
        jButton18.addActionListener(e -> {
            texts.append("  KBYTES: ");
            jTextField.setText(String.valueOf(texts));
        });

        jButton19.setBorder(border);
        jButton19.setBackground(Color.white);
        jButton19.setOpaque(true);
        jButton19.setPreferredSize(new Dimension(200,50));
        jButton19.setFont(new Font("arial", Font.BOLD,30));
        jButton19.addActionListener(e -> {
            texts.append("  > CONVERT-TO > ");
            jTextField.setText(String.valueOf(texts));
        });

        jButton22.setBorder(border);
        jButton22.setBackground(Color.white);
        jButton22.setOpaque(true);
        jButton22.setPreferredSize(new Dimension(200,50));
        jButton22.setFont(new Font("arial", Font.BOLD,30));
        jButton22.addActionListener(e -> {
            texts.append("  GBYTES: ");
            jTextField.setText(String.valueOf(texts));
        });

        jButton23.setBorder(border);
        jButton23.setBackground(Color.white);
        jButton23.setOpaque(true);
        jButton23.setPreferredSize(new Dimension(200,50));
        jButton23.setFont(new Font("arial", Font.BOLD,30));
        jButton23.addActionListener(e -> {
            texts.append("  MBYTES: ");
            jTextField.setText(String.valueOf(texts));
        });

        jButton24.setBorder(border);
        jButton24.setBackground(Color.white);
        jButton24.setOpaque(true);
        jButton24.setPreferredSize(new Dimension(200,50));
        jButton24.setFont(new Font("arial", Font.BOLD,30));
        jButton24.addActionListener(e -> {
            texts.delete(0,texts.length());
            jTextField.setText(String.valueOf(texts));
        });

        jButton25.setPreferredSize(new Dimension(200,50));
        jButton25.setBorder(border);
        jButton25.setFont(new Font("ariel", Font.BOLD,30));
        jButton25.setBackground(Color.white);
        jButton25.addActionListener(e -> new MainMenu(new DefaultPanel()));

        jButton26.setPreferredSize(new Dimension(200,50));
        jButton26.setBorder(border);
        jButton26.setFont(new Font("ariel", Font.BOLD,30));
        jButton26.setBackground(Color.white);
        jButton26.addActionListener(e -> System.exit(0));

        jButton27.setPreferredSize(new Dimension(200,50));
        jButton27.setBorder(border);
        jButton27.setFont(new Font("ariel", Font.BOLD,30));
        jButton27.setBackground(Color.white);
        jButton27.addActionListener(e -> {
            texts.append("9");
            jTextField.setText(String.valueOf(texts));
        });
    }
    private void createSubPanel3(){
        subPanel3.setPreferredSize(new Dimension(1920,100));
        subPanel3.setBackground(Color.cyan);
        subPanel3.setLayout(new GridBagLayout());
        createButton();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.insets = new Insets(10,10,10,10);
        subPanel3.add(jButton25,gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.insets = new Insets(10,10,10,10);
        subPanel3.add(jButton26,gbc);

    }
    public Storage_ConvertPanel(){
        this.setBorder(border);
        this.setBackground(Color.cyan);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(1530,760));

        //add component
        createSubPanel1();
        this.add(subPanel1);
        createSubPanel2();
        this.add(subPanel2);
        createSubPanel3();
        this.add(subPanel3);
    }
}
