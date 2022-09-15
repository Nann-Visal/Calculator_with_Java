package GUI_Caculator;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    //create menu
    private JMenu menu = new JMenu("Menu");
    private JMenu search = new JMenu("Search");
    private JMenu exit = new JMenu("Exit");

    //create menu item
    private JMenuItem arithmetic = new JMenuItem("Arithmetic");
    private JMenuItem bitwise = new JMenuItem("Bitwise");
    private JMenuItem moneyExchange = new JMenuItem("MoneyExchange");
    private JMenuItem trigonometry = new JMenuItem("Trigonometry");
    private JMenuItem binaryConvert = new JMenuItem("BinaryCovert");
    private JMenuItem octalConvert = new JMenuItem("OctalConvert");
    private JMenuItem hexaConvert = new JMenuItem("HexaConvert");
    private JMenuItem decimalConvert = new JMenuItem("DecimalConvert");
    private JMenuItem storageConvert = new JMenuItem("StorageConvert");
    private JMenuItem searchs = new JMenuItem("Search");
    private JMenuItem exits = new JMenuItem("Exit");

    //create menu bar
    private JMenuBar mainMenuBar = new JMenuBar();

    //add menu item into menu
    private void createMenu() {

        menu.add(arithmetic);
        menu.add(bitwise);
        menu.add(moneyExchange);
        menu.add(trigonometry);
        menu.add(binaryConvert);
        menu.add(octalConvert);
        menu.add(hexaConvert);
        menu.add(decimalConvert);
        menu.add(storageConvert);

        search.add(searchs);

        exit.add(exits);

        mainMenuBar.add(menu);
        mainMenuBar.add(search);
        mainMenuBar.add(exit);
    }
    //constructor ManiMenu
    public MainMenu(JPanel jPanelAdd){
        createMenu();
        this.setJMenuBar(mainMenuBar);
        this.setSize(1900, 1000);
        this.setLocation(0, 0);
        this.setLayout(new GridLayout(1,1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.add(jPanelAdd);
    }

}
