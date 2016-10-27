import com.mongodb.BasicDBObject;
//import com.mongodb.Block;
//import com.mongodb.DBObject;
//import javax.swing.JFileChooser;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.Iterator;
//import javax.swing.filechooser.FileFilter;
//import javax.swing.filechooser.FileNameExtensionFilter;
import org.bson.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author Adit
 */
public class EOGMainScreen extends javax.swing.JFrame {
    

    
    //Variable Initialization
    int NumOfExplanations;
    
    //Variable Initialization
    int pageCounter=1;
    int pageCounter2=0;
    
    
    public EOGMainScreen() throws Exception {
        
        
        initComponents();
        getNumExp();
        SetExpLabel();
        SetDerivProb();
        SetRootProb();
        SetFinalState();
        SetRoots();
        //Jpanel();
        
        
       
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        ActAction = new javax.swing.JMenu();
        MenuType = new javax.swing.JMenuItem();
        MenuObj = new javax.swing.JMenuItem();
        MenuPred = new javax.swing.JMenuItem();
        MenuCat = new javax.swing.JMenuItem();
        MenuCateg = new javax.swing.JMenuItem();
        MenuAct = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 60, 100, 490);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(180, 60, 100, 490);

        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 80, 490);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(300, 60, 120, 490);
        getContentPane().add(jPanel5);
        jPanel5.setBounds(420, 60, 100, 490);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DerivProb");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 40, 100, 20);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RootProb");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 40, 100, 19);

        jButton2.setText("Previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 20, 97, 29);

        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 20, 100, 29);

        jMenu1.setText("   File   ");

        jMenuItem9.setText("New FIle");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem11.setText("Save");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Exit");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuBar1.add(jMenu1);

        ActAction.setText("   Definitions   ");

        MenuType.setText("Types");
        MenuType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTypeActionPerformed(evt);
            }
        });
        ActAction.add(MenuType);

        MenuObj.setText("Objects");
        MenuObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuObjActionPerformed(evt);
            }
        });
        ActAction.add(MenuObj);

        MenuPred.setText("Predicates");
        MenuPred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPredActionPerformed(evt);
            }
        });
        ActAction.add(MenuPred);

        MenuCat.setText("Cats");
        MenuCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCatActionPerformed(evt);
            }
        });
        ActAction.add(MenuCat);

        MenuCateg.setText("Category");
        MenuCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCategActionPerformed(evt);
            }
        });
        ActAction.add(MenuCateg);

        MenuAct.setText("Actions");
        MenuAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActActionPerformed(evt);
            }
        });
        ActAction.add(MenuAct);

        jMenuBar1.add(ActAction);

        jMenu4.setText("Statistics");

        jMenuItem2.setText("View Statistics");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("   Initial State   ");

        jMenuItem1.setText("View Initial State");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(531, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTypeActionPerformed
        // TODO add your handling code here:
        MenuDefTyp exp = new MenuDefTyp();
        exp.setVisible(true);
        exp.getTypes();
    }//GEN-LAST:event_MenuTypeActionPerformed

    private void MenuObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuObjActionPerformed
        // TODO add your handling code here:
        MenuDefObj exp = new MenuDefObj();
        exp.setVisible(true);
        exp.getObjects();
                 
    }//GEN-LAST:event_MenuObjActionPerformed

    private void MenuPredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPredActionPerformed
        // TODO add your handling code here:
        MenuDefPred exp = new MenuDefPred();
        exp.setVisible(true);
        exp.getPreds();
    }//GEN-LAST:event_MenuPredActionPerformed

    private void MenuActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActActionPerformed
        // TODO add your handling code here:
        MenuDefAct exp = new MenuDefAct();
        exp.setVisible(true);
        exp.getActions();
        
    }//GEN-LAST:event_MenuActActionPerformed

    private void MenuCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCategActionPerformed
        // TODO add your handling code here:
        MenuDefCateg exp = new MenuDefCateg();
        exp.setVisible(true);
        exp.getCategories();
        
    }//GEN-LAST:event_MenuCategActionPerformed

    private void MenuCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCatActionPerformed
        // TODO add your handling code here:
        MenuDefCats exp = new MenuDefCats();
        exp.setVisible(true);
        exp.getCats();
        
    }//GEN-LAST:event_MenuCatActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MenuProb exp = new MenuProb();
        exp.setVisible(true);
        exp.getProbability();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        StartScreen exp = new StartScreen();
        exp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
       
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        MenuIS exp = new MenuIS();
        exp.setVisible(true);
        exp.getIS();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    
     public int getNumExp() throws Exception {
        
     //System.out.println(StartScreen.pathField.getText());
        
        
        FileReader file = new FileReader(StartScreen.pathField.getText()); //depotsOutput.txt
		BufferedReader reader = new BufferedReader(file);
		String line = reader.readLine();
                
                while (line != null){
                    //System.out.println("entered while");
                    if (line.contains("Found")){
                       // System.out.println("entered if");
                                int startingIndexOfFound;
				String found = "Found ";
				startingIndexOfFound = line.indexOf("Found");
				int endingIndexOfFound = line.indexOf("Explanations.");
				String NumOfExp = line.substring
                                                          (startingIndexOfFound + found.length(), endingIndexOfFound-2);
                                
                                 NumOfExplanations = Integer.parseInt(NumOfExp);
                                 
                                 //System.out.println(NumOfExplanations);
                             
                    }
                    line = reader.readLine();
                }
                  return NumOfExplanations;  
                
    }
    
    
    
    
    
  
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
         if (NumOfExplanations > 15) 
        {
           
             //Clearing out JPannels 
             // jPanel1.removeAll();
            jPanel2.removeAll();
             //jPanel3.removeAll();
             //jPanel4.removeAll();
             //jPanel5.removeAll();
            jPanel1.revalidate();
            jPanel1.repaint();
            jPanel2.revalidate();
            jPanel2.repaint();
            jPanel3.revalidate();
            jPanel3.repaint();
            jPanel4.revalidate();
            jPanel4.repaint();
            jPanel5.revalidate();
            jPanel5.repaint();
            
            
                    //To update the label index numbers 

        //int multiplied = multiplyingFactor * updateLabelBy;
 
//        if(pageCounter*16>NumOfExplanations){
//            return;
//        }


/*

sudo Code: We want to be able to change the button labels to whatever it is plus 16 
we need a changing int. When we press the next button, we want the int value to go up by one everytime 





*/




         int temp=16*pageCounter2;
         for ( int i=temp ; i < temp+16 ; i++ )
         {
            JLabel label = new JLabel( "Exp " + i  );
            label.setSize(100,35);
            label.setMaximumSize(new Dimension (140,40));
            label.setMinimumSize(new Dimension (100,30));
            label.setFont(new Font("Serif", Font.BOLD, 15));
           
            jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
            jPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 0));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jPanel2.add(label);
            //pageCounter++;
            //System.out.println(pageCounter);        
        }pageCounter2--;

        }
        else if(NumOfExplanations <= 15) 
            {
            final JFrame parent = new JFrame();
            JButton button = new JButton();

            button.setText("This document only contains " + NumOfExplanations + " explanations" );
            parent.add(button);
            parent.pack();
            parent.setVisible(true);
            parent.setSize(400,200);
            parent.setLocationRelativeTo(null);

        }
         
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    //public static int updateLabelBy = 16;
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //When this button is pressed, JPanel2,3,4,5 will all show the next instance of solutions 
        
        if (NumOfExplanations > 15) 
        {
           
             //Clearing out JPannels 
             // jPanel1.removeAll();
            jPanel2.removeAll();
             //jPanel3.removeAll();
             //jPanel4.removeAll();
             //jPanel5.removeAll();
            jPanel1.revalidate();
            jPanel1.repaint();
            jPanel2.revalidate();
            jPanel2.repaint();
            jPanel3.revalidate();
            jPanel3.repaint();
            jPanel4.revalidate();
            jPanel4.repaint();
            jPanel5.revalidate();
            jPanel5.repaint();
            
            
                    //To update the label index numbers 

        //int multiplied = multiplyingFactor * updateLabelBy;
 
//        if(pageCounter*16>NumOfExplanations){
//            return;
//        }


/*

sudo Code: We want to be able to change the button labels to whatever it is plus 16 
we need a changing int. When we press the next button, we want the int value to go up by one everytime 





*/




         int temp=16*pageCounter;
         for ( int i=temp ; i < temp+16 ; i++ )
         {
            JLabel label = new JLabel( "Exp " + i  );
            label.setSize(100,35);
            label.setMaximumSize(new Dimension (140,40));
            label.setMinimumSize(new Dimension (100,30));
            label.setFont(new Font("Serif", Font.BOLD, 15));
           
            jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
            jPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 0));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jPanel2.add(label);
            //pageCounter++;
            //System.out.println(pageCounter);        
        }pageCounter++;

        }
        else if(NumOfExplanations <= 15) 
            {
            final JFrame parent = new JFrame();
            JButton button = new JButton();

            button.setText("This document only contains " + NumOfExplanations + " explanations" );
            parent.add(button);
            parent.pack();
            parent.setVisible(true);
            parent.setSize(400,200);
            parent.setLocationRelativeTo(null);

        }
         
        
        
        
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

   
    
    
    
 
    
    private void SetExpLabel(){

        ArrayList<JLabel> labels;
        labels = new ArrayList<JLabel>(NumOfExplanations);
        
        for ( int i = 0; i < NumOfExplanations; i++ )
        {
            JLabel label = new JLabel(( "Exp " + i )  );
            
            label.setSize(100,35);
            label.setMaximumSize(new Dimension (140,40));
            label.setMinimumSize(new Dimension (100,30));
            label.setFont(new Font("Serif", Font.BOLD, 15));
            
            
          
            labels.add( label );
            
            jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
            jPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 0));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jPanel2.add(label);
            
        }// end for loop
        
        
        
    }//end SetExpLabel()
    
    
    private void SetDerivProb()   
    {
                    //System.out.println(NumOfExplanations);

       MongoClient mongoClient = new MongoClient("localhost", 27017);
        
	MongoDatabase db = mongoClient.getDatabase("database");
        MongoCollection<Document> elexirCollection = db.getCollection("test");
    
        FindIterable<Document> results = elexirCollection.
               find(new BasicDBObject("derivProb", new BasicDBObject("$gt", "0")));
			//FindIterable<Document> iter = elexirCollection.find(new BasicDBObject("derivProb", 2));

			
			for (Document doc : results) {
				
                            List<String> conv  = (List<String>) doc.get("derivProb");
                        
                            {
                                JLabel label = new JLabel(conv.get(0) );
            
                                    label.setSize(100,35);
                                    label.setMaximumSize(new Dimension (140,40));
                                    label.setMinimumSize(new Dimension (100,30));
                                    label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                                    
                                    
                                    label.setFont(new Font("Serif", Font.PLAIN, 13));



                                    jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
                                    jPanel1.setBorder(BorderFactory.createEmptyBorder(11, 10, 15, 0));
                                    jPanel1.add(label);
                                
                                
                            }
                            
                               
                        }
    }//end SetDerivProb
    
    private void SetRootProb(){
        
        
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        
	MongoDatabase db = mongoClient.getDatabase("database");
        MongoCollection<Document> elexirCollection = db.getCollection("test");
    
        FindIterable<Document> results = elexirCollection.
               find(new BasicDBObject("derivProb", new BasicDBObject("$gt", "0")));
			//FindIterable<Document> iter = elexirCollection.find(new BasicDBObject("derivProb", 2));

			
			for (Document doc : results) {
				
                            List<String> conv  = (List<String>) doc.get("derivProb");
                        
                            {
                                JLabel label = new JLabel(conv.get(0) );
            
                                    label.setSize(100,35);
                                    label.setMaximumSize(new Dimension (140,40));
                                    label.setMinimumSize(new Dimension (100,30));
                                    label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                                    
                                    label.setFont(new Font("Serif", Font.PLAIN, 13));



                                    jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));
                                    jPanel3.setBorder(BorderFactory.createEmptyBorder(11, 10, 15, 0));
                                    jPanel3.add(label);
                                
                                
                            }
                            
                               
                        }
        
    }

    private void SetFinalState(){
        
         MongoClient mongoClient = new MongoClient("localhost", 27017);
        
	MongoDatabase db = mongoClient.getDatabase("database");
        MongoCollection<Document> elexirCollection = db.getCollection("test");
    
        FindIterable<Document> results = elexirCollection.
               find(new BasicDBObject("derivProb", new BasicDBObject("$gt", "0")));
			//FindIterable<Document> iter = elexirCollection.find(new BasicDBObject("derivProb", 2));

			
			for (Document doc : results) {
				
                            List<String> conv  = (List<String>) doc.get("finalState");
                                    //conv.get(0)
                            {
                                JButton button = new JButton("Final State" );
            
                                     button.setSize(100,35);
                                     button.setMaximumSize(new Dimension (140,40));
                                     button.setMinimumSize(new Dimension (100,30));
                                   
                                    jPanel4.setLayout(new BoxLayout(jPanel4, BoxLayout.Y_AXIS));
                                    jPanel4.setBorder(BorderFactory.createEmptyBorder(10, 5, 15, 5));
                                    jPanel4.add(button);
                                    
                                    
                                 button.addActionListener(new ActionListener() {
 
                                  public void actionPerformed(ActionEvent e)
                                  {
                                        //Execute when button is pressed
                                        
                                        //System.out.println(conv.get(0));
                                       ButtonDisplay exp = new ButtonDisplay();
                                        
                                        exp.setText(conv.get(0));
                                        exp.setVisible(true);
                                  }
                                  });      
 
                                
                            }
                            
                               
                        }
   
        
        
        
    }
    
    
    private void SetRoots(){
        
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        
	MongoDatabase db = mongoClient.getDatabase("database");
        MongoCollection<Document> elexirCollection = db.getCollection("test");
    
        FindIterable<Document> results = elexirCollection.
               find(new BasicDBObject("derivProb", new BasicDBObject("$gt", "0")));
			//FindIterable<Document> iter = elexirCollection.find(new BasicDBObject("derivProb", 2));

			
			for (Document doc : results) {
				
                            List<String> conv  = (List<String>) doc.get("Roots");
                                    //conv.get(0)
                            {
                                JButton button = new JButton("Roots" );
            
                                     button.setSize(100,35);
                                     button.setMaximumSize(new Dimension (140,40));
                                     button.setMinimumSize(new Dimension (100,30));
                                    
                                    jPanel5.setLayout(new BoxLayout(jPanel5, BoxLayout.Y_AXIS));
                                    jPanel5.setBorder(BorderFactory.createEmptyBorder(10, 5, 15, 5));
                                    jPanel5.add(button);
                                    
                                    
                                  button.addActionListener(new ActionListener() {
 
                                  public void actionPerformed(ActionEvent e)
                                  {
                                        //Execute when button is pressed                                   
                                        //System.out.println(conv);
                                           
                                        ButtonDisplay exp = new ButtonDisplay();
                                        
                                        exp.setText(conv.toString());
                                        exp.setVisible(true);
                                  }
                                  }); 
                                
                                
                            }
                            
                               
                        }
                        
   
    }//end SetRoots
    
    String listToString(List<String> lst)
    {
        StringBuilder bld = new StringBuilder();
        for(String str : lst)
        {
            bld.append(str + ", ");
        }
        return bld.toString();
    }
    

    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main( String[] args ) throws InterruptedException, InvocationTargetException, Exception
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EOGMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EOGMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EOGMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EOGMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
                                     
                     
            java.awt.EventQueue.invokeLater(new Runnable() 
            {   
            public void run()
            {
              
              
                try {
                    new EOGMainScreen().setVisible( true );
                } catch (Exception ex) {
                    Logger.getLogger(EOGMainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
             });
                                
              
                
                
        
      
    }
int NumExpOnPage;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ActAction;
    private javax.swing.JMenuItem MenuAct;
    private javax.swing.JMenuItem MenuCat;
    private javax.swing.JMenuItem MenuCateg;
    private javax.swing.JMenuItem MenuObj;
    private javax.swing.JMenuItem MenuPred;
    private javax.swing.JMenuItem MenuType;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
