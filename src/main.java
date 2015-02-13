
import java.awt.Label;
import java.util.logging.Logger;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md. Hasibur Rashid
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


         try
   {

  String laf="com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

      UIManager.setLookAndFeel(laf);

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
        
        loading ok=new loading();
        ok.setVisible(true);
        try{
            Thread .sleep(5000);
        }
        catch( InterruptedException ex){
           // Logger.getLogger(BM1.class.getName().log(Label.SEVERE,null, ex)
        }
ok.dispose();
//new BM1().setVisible(true);
new BM1().setVisible(true); new BM2().setVisible(false); new BM3().setVisible(false); new BM6().setVisible(false);new BM5().setVisible(false);

    }
}