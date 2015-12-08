import org.jsoup.select.Elements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import javax.swing.table.*;
import java.util.List;

/*
 * Created by JFormDesigner on Sat Dec 05 12:28:47 EET 2015
 */



/**
 * @author unknown
 */
public class Frame extends JFrame {
    public Frame() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
//        String res = new Products().getProducts(list1.getSelectedValue(), list2.getSelectedValue(), (String) comboBox1.getSelectedItem());
//        list3.setModel(new Products().getProducts(list1.getSelectedValue(), list2.getSelectedValue(), (String) comboBox1.getSelectedItem()));
        List<String> elements = new Products().getProducts(list1.getSelectedValue(), list2.getSelectedValue(), (String) comboBox1.getSelectedItem());
//        table1.setSi
        int k = 0;
        for(int i = 0; i < elements.size();i++){
            for(int j = 0; j < 6; j++) {
                table1.setValueAt(elements.get(k), i, j);
                k++;
            }
        }
        table1.setValueAt("asd", 0, 0);
    }

    private void list2KeyPressed(KeyEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Maxim Darchuk
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menu4 = new JMenu();
        menu5 = new JMenu();
        menuItem6 = new JMenuItem();
        menu6 = new JMenu();
        menu7 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menu9 = new JMenu();
        menu8 = new JMenu();
        menuItem4 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem5 = new JMenuItem();
        panel1 = new JPanel();
        layeredPane1 = new JLayeredPane();
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox();
        label3 = new JLabel();
        comboBox3 = new JComboBox<>();
        scrollPane1 = new JScrollPane();
        list1 = new JList<>();
        label4 = new JLabel();
        label5 = new JLabel();
        scrollPane2 = new JScrollPane();
        list2 = new JList<>();
        panel3 = new JPanel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        button1 = new JButton();
        scrollPane3 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u0430");
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u0410\u0434\u0440\u0435\u0441\u0430");
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u041d\u0430\u043a\u043b\u0430\u0434\u043d\u044b\u0435");
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("\u041f\u0435\u0440\u0435\u0443\u0447\u0435\u0442");
            }
            menuBar1.add(menu4);

            //======== menu5 ========
            {
                menu5.setText("\u0417\u0430\u043a\u0430\u0437\u044b");

                //---- menuItem6 ----
                menuItem6.setText("\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0437\u0430\u043a\u0430\u0437\u043e\u0432");
                menu5.add(menuItem6);
            }
            menuBar1.add(menu5);

            //======== menu6 ========
            {
                menu6.setText("\u042d\u043b. \u043d\u0430\u043a\u043b\u0430\u0434\u043d\u044b\u0435");
            }
            menuBar1.add(menu6);

            //======== menu7 ========
            {
                menu7.setText("\u0410\u0441\u0441\u0438\u0441\u0442\u0435\u043d\u0442");

                //---- menuItem1 ----
                menuItem1.setText("\u0418\u0444\u043d\u043e. \u043e \u0430\u043a\u0446\u0438\u044f");
                menu7.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("\u041e\u0441\u0442\u0430\u0442\u043a\u0438");
                menu7.add(menuItem2);
            }
            menuBar1.add(menu7);

            //======== menu9 ========
            {
                menu9.setText("\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u043e");
            }
            menuBar1.add(menu9);

            //======== menu8 ========
            {
                menu8.setText("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430");

                //---- menuItem4 ----
                menuItem4.setText("\u0420\u0443\u043a\u043e\u0432\u043e\u0434\u0441\u0442\u0432\u043e");
                menu8.add(menuItem4);

                //---- menuItem3 ----
                menuItem3.setText("\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f");
                menu8.add(menuItem3);

                //---- menuItem5 ----
                menuItem5.setText("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0430");
                menu8.add(menuItem5);
            }
            menuBar1.add(menu8);
        }
        setJMenuBar(menuBar1);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(240, 240, 240));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(null);

            //======== layeredPane1 ========
            {
                layeredPane1.setBorder(new TitledBorder(LineBorder.createBlackLineBorder(), "\u0424\u0438\u043b\u044c\u0442\u0440"));

                //======== panel2 ========
                {
                    panel2.setBorder(new LineBorder(Color.black, 1, true));

                    //---- label1 ----
                    label1.setText("\u041f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a");

                    //---- label2 ----
                    label2.setText("\u0411\u0440\u0435\u043d\u0434");

                    //---- comboBox1 ----
                    comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                        "\u041f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a 1",
                        "\u041f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a 2",
                        "\u041f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a 3",
                        "\u041f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a 4"
                    }));

                    //---- label3 ----
                    label3.setText("\u041e\u0442\u0434\u0435\u043b");

                    //---- comboBox3 ----
                    comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                        "\u041e\u0442\u0434\u0435\u043b 1",
                        "\u041e\u0442\u0434\u0435\u043b 2",
                        "\u041e\u0442\u0434\u0435\u043b 3",
                        "\u041e\u0442\u0434\u0435\u043b 4"
                    }));

                    //======== scrollPane1 ========
                    {

                        //---- list1 ----
                        list1.setBorder(new BevelBorder(BevelBorder.LOWERED));
                        list1.setModel(new AbstractListModel<String>() {
                            String[] values = {
                                "\u0424\u0440\u0443\u043a\u0442\u044b",
                                "\u041e\u0432\u043e\u0449\u0438",
                                "\u041a\u0440\u0443\u043f\u044b",
                                "\u041a\u0430\u0448\u0438",
                                "\u0414\u0435\u0442\u0441\u043a\u043e\u0435 \u043f\u0438\u0442\u0430\u043d\u0438\u0435",
                                "\u0411\u0435\u0437\u0430\u043b\u043a\u043e\u0433\u043e\u043b\u044c\u043d\u044b\u0435 \u043d\u0430\u043f\u0438\u0442\u043a\u0438",
                                "\u0410\u043b\u043a\u043e\u0433\u043e\u043b\u044c\u043d\u044b\u0435 \u043d\u0430\u043f\u0438\u0442\u043a\u0438",
                                "\u0427\u0430\u0439, \u043a\u043e\u0444\u0435",
                                "\u041a\u043e\u043d\u0434\u044b\u0442\u0435\u0440\u0441\u043a\u0438\u0435 \u0438\u0437\u0434\u0435\u043b\u0438\u044f",
                                "\u041c\u043e\u043b\u043e\u0447\u043d\u044b\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u044b",
                                "\u041c\u043e\u0440\u0435\u043f\u0440\u043e\u0434\u0443\u043a\u0442\u044b",
                                "\u0414\u0438\u0435\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043f\u0440\u043e\u0434\u0443\u043a\u0442\u044b"
                            };
                            @Override
                            public int getSize() { return values.length; }
                            @Override
                            public String getElementAt(int i) { return values[i]; }
                        });
                        list1.setSelectionBackground(new Color(204, 204, 204));
                        list1.setSelectedIndex(0);
                        scrollPane1.setViewportView(list1);
                    }

                    //---- label4 ----
                    label4.setText("\u0422\u0438\u043f \u0442\u043e\u0432\u0430\u0440\u0430");

                    //---- label5 ----
                    label5.setText("\u0421\u043a\u043b\u0430\u0434\u044b");

                    //======== scrollPane2 ========
                    {

                        //---- list2 ----
                        list2.setModel(new AbstractListModel<String>() {
                            String[] values = {
                                "\u0421\u043a\u043b\u0430\u0434 1",
                                "\u0421\u043a\u043b\u0430\u0434 2",
                                "\u0421\u043a\u043b\u0430\u0434 3"
                            };
                            @Override
                            public int getSize() { return values.length; }
                            @Override
                            public String getElementAt(int i) { return values[i]; }
                        });
                        list2.setSelectedIndex(0);
                        list2.addKeyListener(new KeyAdapter() {
                            @Override
                            public void keyPressed(KeyEvent e) {
                                list2KeyPressed(e);
                            }
                        });
                        scrollPane2.setViewportView(list2);
                    }

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(label1)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(comboBox1)
                                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(label4)
                                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(label5)
                                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(label2))
                                    .addComponent(label1)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(label5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addContainerGap(9, Short.MAX_VALUE))
                    );
                }
                layeredPane1.add(panel2, JLayeredPane.DEFAULT_LAYER);
                panel2.setBounds(5, 20, 285, 235);

                //======== panel3 ========
                {
                    panel3.setBorder(new LineBorder(Color.black, 1, true));

                    //---- radioButton1 ----
                    radioButton1.setText("\u0421\u0443\u043c\u0430\u0440\u043d\u044b\u0439 \u043e\u0441\u0442\u0430\u0442\u043e\u043a");
                    radioButton1.setSelected(true);

                    //---- radioButton2 ----
                    radioButton2.setText("\u0420\u0435\u0430\u043b\u044c\u043d\u044b\u0439 \u043e\u0441\u0442\u0430\u0442\u043e\u043a");

                    GroupLayout panel3Layout = new GroupLayout(panel3);
                    panel3.setLayout(panel3Layout);
                    panel3Layout.setHorizontalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(radioButton1)
                                    .addComponent(radioButton2))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel3Layout.setVerticalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(radioButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                layeredPane1.add(panel3, JLayeredPane.DEFAULT_LAYER);
                panel3.setBounds(5, 260, 150, 60);

                //---- button1 ----
                button1.setText("\u041d\u0430\u0439\u0442\u0438");
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });
                button1.addActionListener(e -> button1ActionPerformed(e));
                layeredPane1.add(button1, JLayeredPane.DEFAULT_LAYER);
                button1.setBounds(190, 325, 95, button1.getPreferredSize().height);
            }
            panel1.add(layeredPane1);
            layeredPane1.setBounds(0, 0, 305, 360);

            //======== scrollPane3 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, "", null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "\u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435", "\u0421\u043a\u043b\u0430\u0434", "\u041f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a", "\u041e\u0441\u0442\u0430\u0442\u043e\u043a", "\u0426\u0435\u043d\u0430 \u0437\u0430 \u0435\u0434\u0435\u043d\u0438\u0446\u0443", "\u0414\u0430\u0442\u0430 \u043f\u0440\u0438\u0431\u044b\u0442\u0438\u044f"
                    }
                ));
                scrollPane3.setViewportView(table1);
            }
            panel1.add(scrollPane3);
            scrollPane3.setBounds(310, 5, 750, 400);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Maxim Darchuk
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JMenu menu5;
    private JMenuItem menuItem6;
    private JMenu menu6;
    private JMenu menu7;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenu menu9;
    private JMenu menu8;
    private JMenuItem menuItem4;
    private JMenuItem menuItem3;
    private JMenuItem menuItem5;
    private JPanel panel1;
    private JLayeredPane layeredPane1;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;
    private JComboBox<String> comboBox1;
    private JComboBox comboBox2;
    private JLabel label3;
    private JComboBox<String> comboBox3;
    private JScrollPane scrollPane1;
    private JList<String> list1;
    private JLabel label4;
    private JLabel label5;
    private JScrollPane scrollPane2;
    private JList<String> list2;
    private JPanel panel3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button1;
    private JScrollPane scrollPane3;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
