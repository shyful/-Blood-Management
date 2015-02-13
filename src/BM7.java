
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BM7 extends javax.swing.JFrame {
     private String id;
    private String day;
    private String month;
    private String year;

    /** Creates new form BM7 */
    public BM7() {
        initComponents();
         setLocationRelativeTo(null);


        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter Id :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 50, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 39, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 140, 30));

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 150, 30));

        jLabel2.setText("Input Current Date:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 120, 30));

        jButton3.setText("<Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 130, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Year", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " ", " " }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 120, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 90, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 70, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 80, 30));

        jLabel4.setText("Last Donation Date :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SHYFUL.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 11, -1, 146));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel6.setText("Donation Page");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 163, -1, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 190, 20));
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat h =new SimpleDateFormat("EEE, MMM dd, yyyy");
        String d3= h.format(cal.getTime());
        jLabel3.setText(d3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 210));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 750, 20));

        jLabel7.setText("Day :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel8.setText("Month :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 50, 20));

        jLabel9.setText("Year :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 50, 20));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 80, 30));
        javax.swing.Timer t = new javax.swing.Timer(1000,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar cal = new GregorianCalendar();

                /*SimpleDateFormat h =new SimpleDateFormat("hh:mm:ss a");
                String d1= h.format(cal.getTime());
                jLabel96.setText(d1);*/

                int hour = Integer.valueOf(cal.get(Calendar.HOUR));
                int minute = Integer.valueOf(cal.get(Calendar.MINUTE));
                int second = Integer.valueOf(cal.get(Calendar.SECOND));
                //SimpleDateFormat h =new SimpleDateFormat("hh:mm:ss a");
                //String d3=h.format(cal.set(int hourOfDay,int minute,int second));
                //jLabel96.setText(d3);
                jLabel11.setText("" + (hour-1) + ":" + minute + ":" + second);

            }
        });
        t.start();

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 160, 30));
        javax.swing.Timer t3 = new javax.swing.Timer(1000,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar cal = new GregorianCalendar();
                SimpleDateFormat h =new SimpleDateFormat("EEE, MMM dd, yyyy");
                String d3= h.format(cal.getTime());
                jLabel12.setText(d3);
            }
        });
        t3.start();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
        BM6 ok=new BM6();
ok.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  Connection con=null;
        PreparedStatement stm=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i=0;
        String ia;
        String ib;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
            stm = (PreparedStatement) con.prepareStatement("select * from `add` where `idn`=?");
            stm.setString(1,jTextField1.getText());
            ResultSet r1 = stm.executeQuery();
            if(r1.next()==false)JOptionPane.showMessageDialog(null, "There are no person exist by your selection!","Error",JOptionPane.ERROR_MESSAGE);
            else{
                ResultSet r = stm.executeQuery();
                while(r.next() == true) {
                     id=r.getString("Lddd");
                     ia=r.getString("month");
                     ib=r.getString("year");

}
               // jTextField2.setText(id);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data is not Exit By Your Selection");
        }

                           Connection co=null;
     PreparedStatement st=null;
        try {
        Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException ex) {
        Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
        }
        int j=0;
        try {
            co = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
            st = (PreparedStatement) con.prepareStatement("select * from `add` where `idn`=?");
            st.setString(1,String.valueOf(jTextField1.getText()));
            ResultSet r1 = st.executeQuery();
            if(r1.next()==false)JOptionPane.showMessageDialog(null, "There are no person exist by your selection!","Error",JOptionPane.ERROR_MESSAGE);
            else{
                ResultSet r = st.executeQuery();
                while(r.next() == true)
            {

String ph=r.getString("Lddd");
String ph1=r.getString("month");
String ph2=r.getString("year");


                                   // jTable1.setValueAt( ph,j,0);
                                    //jTable1.setValueAt( ph1,j,1);
                                    //jTable1.setValueAt( ph2,j,2);


                                                                    //j++;
                jTextField2.setText(ph);
                jTextField3.setText(ph1);
                jTextField4.setText(ph2);
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data is not Exit By Your Selection");
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Connection con=null;
        PreparedStatement stm=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i=0;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
            stm = (PreparedStatement) con.prepareStatement("select * from `add` where `idn`=?");
            stm.setString(1,jTextField1.getText());
            ResultSet r1 = stm.executeQuery();
            if(r1.next()==false)JOptionPane.showMessageDialog(null, "There are no person exist by your selection!","Error",JOptionPane.ERROR_MESSAGE);
            else{
                ResultSet r = stm.executeQuery();
                while(r.next() == true) {
                      day=r.getString("Lddd");
                     month=r.getString("month");
                      year=r.getString("year");
                    }
            }
            int da=Integer.parseInt(day);
            int mo=Integer.parseInt(month);
            int ye=Integer.parseInt(year);
            int last=ye*365+mo*30+da;
            int da1=Integer.parseInt((String) jComboBox1.getSelectedItem());
            int mo1=Integer.parseInt((String) jComboBox2.getSelectedItem());
            int ye1=Integer.parseInt((String) jComboBox3.getSelectedItem());
            int first=ye1*365+mo1*30+da1;
            int cal=first-last;
            if(cal<=120)
            JOptionPane.showMessageDialog(null, "You are not eligible for donating blood!","WARNING",JOptionPane.WARNING_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "You are eligible for donating blood!","Information",JOptionPane.INFORMATION_MESSAGE);
            //String fin=Integer.toString(cal);
        } catch (SQLException ex) {
            Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data is not exist By Your Selection");
        }
             Connection co=null;
     PreparedStatement st=null;
        try {
        Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException ex) {
        Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
        }
        int j=0;
        try {
            co = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
            st = (PreparedStatement) con.prepareStatement("select * from `add` where `idn`=?");
            st.setString(1,String.valueOf(jTextField1.getText()));
            ResultSet r1 = st.executeQuery();
            if(r1.next()==false)JOptionPane.showMessageDialog(null, "There are no person exist by your selection!","Error",JOptionPane.ERROR_MESSAGE);
            else{
                ResultSet r = st.executeQuery();
                while(r.next() == true)
            {

String ph=r.getString("Lddd");
String ph1=r.getString("month");
String ph2=r.getString("year");


                                   // jTable1.setValueAt( ph,j,0);
                                    //jTable1.setValueAt( ph1,j,1);
                                    //jTable1.setValueAt( ph2,j,2);


                                                                    //j++;
                jTextField2.setText(ph);
                jTextField3.setText(ph1);
                jTextField4.setText(ph2);
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BM5.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data is not Exist By Your Selection");
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BM7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
