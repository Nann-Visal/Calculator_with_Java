package GUI_Caculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DefaultPanel extends JPanel {

    private Border border = BorderFactory.createLineBorder(Color.black,2);
    private JPanel subPanel1 = new JPanel();
    private JPanel subPanel2 = new JPanel();
    private JLabel title = new JLabel("CALCULATOR",JLabel.CENTER);
    private JButton arithmeticBT = new JButton("ARITHMETIC");
    private JButton bitwiseBT = new JButton("BITWISE");
    private JButton trigonometryBT = new JButton("TRIGONOMETRY");
    private JButton money_exchangeBT = new JButton("MONEY EXCHANGE");
    private JButton binary_convertBT = new JButton("BINARY CONVERT");
    private JButton octal_convertBT = new JButton("OCTAL CONVERT");
    private JButton hexadecimal_convertBT = new JButton("HEXA CONVERT");
    private JButton decimal_convertBT = new JButton("DECIMAL CONVERT");
    private JButton storage_convertBT = new JButton("STORAGE CONVERT");
    private JButton exitBT = new JButton("EXIT");

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
    private void createSubPanel2(){
        subPanel2.setPreferredSize(new Dimension(1920,980));
        subPanel2.setBackground(Color.cyan);
        subPanel2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.insets = new Insets(20,20,20,20);
        arithmeticBT.setPreferredSize(new Dimension(500,50));
        arithmeticBT.setFont(new Font("arial", Font.BOLD,30));
        arithmeticBT.setBackground(Color.white);
        subPanel2.add(arithmeticBT,gbc);
        arithmeticBT.addActionListener(e -> new MainMenu(new ArithmeticPanel()));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=1;
        bitwiseBT.setPreferredSize(new Dimension(500,50));
        bitwiseBT.setFont(new Font("arial", Font.BOLD,30));
        bitwiseBT.setBackground(Color.white);
        subPanel2.add(bitwiseBT,gbc);
        bitwiseBT.addActionListener(e -> new MainMenu(new BitwisePanel()));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=2;
        money_exchangeBT.setPreferredSize(new Dimension(500,50));
        money_exchangeBT.setFont(new Font("arial", Font.BOLD,30));
        money_exchangeBT.setBackground(Color.white);
        subPanel2.add(money_exchangeBT,gbc);
        money_exchangeBT.addActionListener(e -> new MainMenu(new Money_ExchangePanel()));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=3;
        trigonometryBT.setPreferredSize(new Dimension(500,50));
        trigonometryBT.setFont(new Font("arial", Font.BOLD,30));
        trigonometryBT.setBackground(Color.white);
        subPanel2.add(trigonometryBT,gbc);
        trigonometryBT.addActionListener(e -> new MainMenu(new TrigonometryPanel()));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=0;
        binary_convertBT.setPreferredSize(new Dimension(500,50));
        binary_convertBT.setFont(new Font("arial", Font.BOLD,30));
        binary_convertBT.setBackground(Color.white);
        subPanel2.add(binary_convertBT,gbc);
        binary_convertBT.addActionListener(e -> new MainMenu(new Number_Convertor("BINARY CONVERT")));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=1;
        octal_convertBT.setPreferredSize(new Dimension(500,50));
        octal_convertBT.setFont(new Font("arial", Font.BOLD,30));
        octal_convertBT.setBackground(Color.white);
        subPanel2.add(octal_convertBT,gbc);
        octal_convertBT.addActionListener(e -> new MainMenu(new Number_Convertor("OCTAL CONVERT")));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=2;
        hexadecimal_convertBT.setPreferredSize(new Dimension(500,50));
        hexadecimal_convertBT.setFont(new Font("arial", Font.BOLD,30));
        hexadecimal_convertBT.setBackground(Color.white);
        subPanel2.add(hexadecimal_convertBT,gbc);
        hexadecimal_convertBT.addActionListener(e -> new MainMenu(new Number_Convertor("HEXADECIMAL CONVERT")));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=3;
        decimal_convertBT.setPreferredSize(new Dimension(500,50));
        decimal_convertBT.setFont(new Font("arial", Font.BOLD,30));
        decimal_convertBT.setBackground(Color.white);
        subPanel2.add(decimal_convertBT,gbc);
        decimal_convertBT.addActionListener(e -> new MainMenu(new Number_Convertor("DECIMAL CONVERT")));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=4;
        storage_convertBT.setPreferredSize(new Dimension(500,50));
        storage_convertBT.setFont(new Font("arial", Font.BOLD,30));
        storage_convertBT.setBackground(Color.white);
        subPanel2.add(storage_convertBT,gbc);
        storage_convertBT.addActionListener(e -> new MainMenu(new Storage_ConvertPanel()));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=5;
        exitBT.setPreferredSize(new Dimension(500,50));
        exitBT.setFont(new Font("arial", Font.BOLD,30));
        exitBT.setBackground(Color.white);
        subPanel2.add(exitBT,gbc);
        exitBT.addActionListener(e -> System.exit(0));
    }
    public DefaultPanel(){
        this.setBorder(border);
        this.setBackground(Color.cyan);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(1530,760));

        //add component
        createSubPanel1();
        this.add(subPanel1);
        createSubPanel2();
        this.add(subPanel2);
    }
}
