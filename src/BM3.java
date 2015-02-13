
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class BM3 extends javax.swing.JFrame {
     private static class image {   

        public image() {
        }
}
    private String path;
 
  
    public BM3() {
        initComponents();
         setLocationRelativeTo(null);
       
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 36)); // NOI18N
        jLabel1.setText("Information Page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, -1));

        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setText("Date of Birth :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setText("Age :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setText("Height :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setText("Weight :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jLabel7.setText("Blood Group :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel8.setText("Blood Pressure :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel9.setText("Gender :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel10.setText("Profession :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 10));

        jLabel11.setText("Present Address :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 20));

        jLabel12.setText("Permanent Address :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel14.setText(" Donation Date :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel15.setText("Current Date :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 77, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 258, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selet Feet", "1 Feet", "2 Feet", "3 Feet", "4 Feet", "5 Feet", "6 Feet", "7 Feet", " " }));
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Inch", "1 Inc", "2 Inc", "3 Inc", "4 Inc", "5 Inc", "6 Inc", "7 Inc", "8 Inc", "9 Inc", "10 Inc", "11 Inc", "12 Inc", " " }));
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 130, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Kg", "1 Kg", "2 Kg", "3 Kg", "4 Kg", "5 Kg", "6 Kg", "7 Kg", "8 Kg", "9 Kg", "10 Kg", "11 Kg", "12 Kg", "13 Kg", "14 Kg", "15 Kg", "16 Kg", "17 Kg", "18 Kg", "19 Kg", "20 Kg", "21 Kg", "22 Kg", "23 Kg", "24 Kg", "25 Kg", "26 Kg", "27 Kg", "28 Kg", "29 Kg", "30 Kg", "31 Kg", "32 Kg", "33 Kg", "34 Kg", "35 Kg", "36 Kg", "37 Kg", "38 Kg", "39 Kg", "40 Kg", "41 Kg", "42 Kg", "43 Kg", "44 Kg", "45 Kg", "46 Kg", "47 Kg", "48 Kg", "49 Kg", "50 Kg", "51 Kg", "52 Kg", "53 Kg", "54 Kg", "55 Kg", "56 Kg", "57 Kg", "58 Kg", "59 Kg", "60 Kg", "61 Kg", "62 Kg", "63 Kg", "64 Kg", "65 Kg", "66 Kg", "67 Kg", "68 Kg", "69 Kg", "70 Kg", "71 Kg", "72 Kg", "73 Kg", "74 Kg", "75 Kg", "76 Kg", "77 Kg", "78 Kg", "79 Kg", "80 Kg", "81 Kg", "82 Kg", "83 Kg", "83 Kg", "84 Kg", "85 Kg", "86 Kg", "87 Kg", "88 Kg", "89 Kg", "90 Kg", "91 Kg", "92 Kg", "93 Kg", "94 Kg", "95 Kg", "96 Kg", "97 Kg", "98 Kg", "99 Kg", "100 Kg" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ", "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "0-", " " }));
        getContentPane().add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select  ", "High", "Low", "Normal" }));
        getContentPane().add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 120, -1));
        if(jComboBox11.getSelectedIndex()==2){
            jLabel13.setVisible(true);
        }

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        getContentPane().add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 270, 30));

        jLabel16.setText("Id No:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 130, -1));
        int i=01;
        Connection con=null;
        PreparedStatement stm=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BM3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
            stm = (PreparedStatement) con.prepareStatement("select *from `add`");

            ResultSet r = stm.executeQuery();

            while(r.next()==true){
                //if(r.getString(17).copmareto()==0){}
                i++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BM3.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField5.setText(String.valueOf(i));

        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 660, 110, 30));

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, 100, 30));

        jButton4.setText("Upload Picture");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 386, -1, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 260, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 260, -1));

        jTextField10.setEditable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 260, -1));
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat h =new SimpleDateFormat("EEE, MMM dd, yyyy");
        String d3= h.format(cal.getTime());
        jTextField10.setText(d3);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 270, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 270, 40));

        jLabel18.setText("Phone No :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 270, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Are you want to donate blood now? If you want to donate, fill up text box or not.");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 110, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 100, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select year", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " ", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 90, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 690, 170, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1111111111111.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 184, 160, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";
        String db = "bd";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";


        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url + db, user, pass);


            PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO `bd`.`add` (`Name`, `Dobd`, `agey`, `height1`, `height2`, `weight`, `bg`, `bp`, `gdr`, `profession`, `pre`, `per`, `idn`, `pn`, `Lddd`, `month`, `year`, `cd`,`picture`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
             st.setString(1,jTextField1.getText());
            st.setString(2,jTextField7.getText());
            st.setString(3,jTextField8.getText());
            st.setString(4,(String) jComboBox7.getSelectedItem());
             st.setString(5,(String) jComboBox8.getSelectedItem());
             st.setString(6,(String) jComboBox9.getSelectedItem());
            st.setString(7,(String) jComboBox10.getSelectedItem());
            st.setString(8,(String) jComboBox11.getSelectedItem());
             st.setString(9,(String) jComboBox12.getSelectedItem());
            st.setString(10,jTextField2.getText());
            st.setString(11,jTextArea1.getText());
            st.setString(12,jTextArea2.getText());
            st.setString(13,jTextField5.getText());
            st.setString(14,jTextField3.getText());
            st.setString(15,(String) jComboBox1.getSelectedItem());
            st.setString(16,(String) jComboBox2.getSelectedItem());
            st.setString(17,(String) jComboBox3.getSelectedItem());
            st.setString(18,jTextField10.getText()); 
            st.setString(19,path);

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data is successfully inserted into database.");
            con.close();


        } catch (Exception e) {
 Logger.getLogger(BM3.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error in submitting data!");

        }
 dispose();
        new BM3().setVisible(true);
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField8ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
        BM2 ok=new BM2();
ok.setVisible(true);    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField10ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   JFileChooser chooser = new JFileChooser();
    chooser.setAcceptAllFileFilterUsed(false);
    int retVal = chooser.showOpenDialog(this);
        BufferedImage image;
        //String path;
    if (retVal == JFileChooser.APPROVE_OPTION) {
        File myFile = chooser.getSelectedFile();
        try {
            image = ImageIO.read(myFile);

            try
            {
                jLabel17.setIcon(new ImageIcon(image.getScaledInstance(140,130,140 )));

            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(this, "Please input upload in JPEG format");
            }
            path=myFile.getAbsolutePath();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "MemberMasterGUI.browsePhoto: " + e.getMessage());
        }
    }    // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jComboBox9ActionPerformed

private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField7ActionPerformed

private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1ActionPerformed

private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jComboBox3ActionPerformed

private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jComboBox2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BM3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
