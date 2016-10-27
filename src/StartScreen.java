
import javax.swing.JFileChooser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.bson.Document;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adit
 */
public class StartScreen extends javax.swing.JFrame {

    /**
     * Creates new form StartScreen
     */
    public StartScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pathField = new javax.swing.JTextField();
        BrowseButton = new javax.swing.JButton();
        StartButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 241));
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter File Destination Below");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 70, 500, 16);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELEXIR EXPLANATION GUI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 40);

        pathField.setText("File Path");
        getContentPane().add(pathField);
        pathField.setBounds(10, 110, 480, 30);

        BrowseButton.setText("Browse");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseButton);
        BrowseButton.setBounds(120, 160, 110, 40);

        StartButton.setText("START");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StartButton);
        StartButton.setBounds(280, 160, 110, 40);

        jPanel1.setBackground(new java.awt.Color(151, 207, 209));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 300));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 300);

        setSize(new java.awt.Dimension(510, 272));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
       

        
      
           


    
FileFilter filter = new FileNameExtensionFilter("Text File","txt");
chooser.addChoosableFileFilter(filter);
chooser.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES ); 
chooser.setCurrentDirectory(new java.io.File("."));
chooser.setDialogTitle("Choose an ELEXIR output file");
//chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//chooser.setAcceptAllFileFilterUsed(false);

if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
  //System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
  //System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
  String fileDirectory = ""  + chooser.getSelectedFile(); 
 
  pathField.setText(fileDirectory);
  
} else {
  System.out.println("No Selection ");
}


        

    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        try{
                //System.out.println(chooser)
                insertMongo();
                EOGMainScreen exp = new EOGMainScreen();
                //Example exp = new Example();
                exp.setVisible(true);
                this.dispose(); 
         } catch (Exception e) {
    System.err.println("Exception: " + e.getMessage()); 
         }
    }//GEN-LAST:event_StartButtonActionPerformed

    private void insertMongo() throws Exception
    {
        // *****This is to connect to database**//
        
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase db = mongoClient.getDatabase("database");

		MongoCollection<Document> elexirCollection = db.getCollection("test");

		// *********This is to connect to the database***********//
                
                //To clear out existing files from mongo
                db.getCollection("test").deleteMany(new Document());

		// *******This is to read the file into program*********//
		//String fileDirectory = chooser.getCurrentDirectory() + "";
		
              
                FileReader file = new FileReader(pathField.getText());
		BufferedReader reader = new BufferedReader(file);

		String line = reader.readLine();

		// **********This is to read the text file into program***************//

		// Creating the Array List to store types of variables
		List<String> Types = new ArrayList<String>();
		List<String> Objects = new ArrayList<String>();
		List<String> Predicates = new ArrayList<String>();
		List<String> Cats = new ArrayList<String>();
		List<String> Category = new ArrayList<String>();
		List<String> Action = new ArrayList<String>();

		List<Double> DerivProb = new ArrayList<Double>();
		List<Double> RootProb = new ArrayList<Double>();
		List<String> InitialState = new ArrayList<String>();
		List<String> FinalState = new ArrayList<String>();
		List<String> Roots = new ArrayList<String>();
		
                                
                List <String> Probability = new ArrayList<String>();
               
                
                ArrayList<Document> Doc = new ArrayList<Document>();


		// initialize all types of definitions
		String type = null;
		String object = null;
		String predicate = null;
		String cat = null;
		String category = null;
		String action = null;
		String derivProb = null;
		String rootProb = null;
		String initialState = null;
		String finalState = null;
		String roots = null;
                String probability = null;
                

		Document Exp = new Document();
		Document definitions = new Document();
                Document stats = new Document();
                
                
                
                
		// Read type Definitions
		while (line != null) {

			if (line.contains("Defined Type: ")) {
				int startingIndexOfType; 
				String types = "Defined Type: ";	
				startingIndexOfType = line.indexOf("Defined Type: ");
				int endingIndexOfType = line.indexOf(".");
				type = line.substring(startingIndexOfType + types.length(),
						endingIndexOfType);
				// putting the piece of string into the new string
				Types.add(type);

			}

			// Read object definitions.
			else if (line.contains("Defined Object: ")) {
				int startingIndexOfObj; // this is to split each word from its
										// spaces and print word by word
				String objects = "Defined Object: ";
				startingIndexOfObj = line.indexOf("Defined Object: ");
				int endingIndexOfObj = line.indexOf(".");
				object = line.substring(startingIndexOfObj + objects.length(),
						endingIndexOfObj);
				// putting the piece of string into the new string
				Objects.add(object);
			}

			// Read predicate definitions.
			else if (line.contains("Defined predicate:")) {
				String predicates = "Defined predicate:";
				int startingIndexOfPred; // this is to split each word from its
											// spaces and print word by word
				startingIndexOfPred = line.indexOf("Defined predicate:");
				int endingIndexOfPred = line.indexOf(".");
				predicate = line.substring(startingIndexOfPred + predicates.length(),
						endingIndexOfPred);
				// putting the piece of string into the new string
				Predicates.add(predicate);
			}

			// Defined Cat-Definition
			else if (line.contains("Defined: Cat-Definition: ")) {
				int startingIndexOfCat; // this is to split each word from its
										// spaces and print word by word
				String catDef = "Defined: Cat-Definition: ";
				startingIndexOfCat = line.indexOf("Defined: Cat-Definition: ");
				int endingIndexOfCat = line.indexOf(".", startingIndexOfCat );
				cat = line.substring(startingIndexOfCat + catDef.length(), endingIndexOfCat);
				// putting the piece of string into the new string
				Cats.add(cat);
			}

			// Defined Action Definitions
			
			else if (line.contains("Defined: category: ")) {
				String categ = "Defined: category: ";
				int startingIndexOfCategory = line.indexOf("Defined: category: ");
				int endingIndexOfCategory = line.indexOf(";", startingIndexOfCategory );
				category = line.substring(startingIndexOfCategory + categ.length(), endingIndexOfCategory);
				Category.add(category);
				
			}

			else if (line.contains("Defined: ")) {
										// this is to split each word from its
										// spaces and print word by word
				String defined = "Defined: ";
				int startingIndexOfAct = line.indexOf("Defined: ");
				int endingIndexOfAct = line.indexOf(".", startingIndexOfAct );
				action = line.substring(startingIndexOfAct + defined.length(),
						endingIndexOfAct);
				// putting the piece of string into the new string
				Action.add(action);

			}
			line = reader.readLine();
			definitions = new Document();
			if (line.startsWith("Read goals for query."))
				break;

		}
                
                
                		definitions.append("Types", Types)
				.append("Objects", Objects)
				.append("Predicates", Predicates)
				.append("Cats", Cats)
				.append("Category", Category)
				.append("Actions", Action);

		elexirCollection.insertOne(definitions);
                
                

		while (line != null) {
			
			
			DerivProb = new ArrayList<Double>();
			RootProb = new ArrayList<Double>();			// To clear out the array so that
			InitialState = new ArrayList<String>();     // the document does not repeat with
			FinalState = new ArrayList<String>();       // roots from previous explanations
			Roots = new ArrayList<String>();
			

			
			if (line.startsWith("[Exp:")) {
				String dp = "derivProb :";
				int startingIndexOfDP;
				startingIndexOfDP = line.indexOf("derivProb: ");
				int endingIndexOfDP = line.indexOf(" root", startingIndexOfDP);
				derivProb = line.substring(startingIndexOfDP + dp.length(), endingIndexOfDP);
                                DerivProb.add( Double.parseDouble(derivProb));
                                
				

				String rp = "rootProb :";
				int startingIndexOfRP;
				startingIndexOfRP = line.indexOf("rootProb: ");
				int endingIndexOfRP = line
						.indexOf(" Initial", startingIndexOfRP);
				rootProb = line.substring(startingIndexOfRP + rp.length(), endingIndexOfRP);
				RootProb.add(Double.parseDouble(rootProb));

				String is = "Initial State:[ ";
				int startingIndexOfIS;
				startingIndexOfIS = line.indexOf("Initial State:[ ");
				int endingIndexOfIS = line.indexOf(" ]", startingIndexOfIS);
				initialState = line.substring(startingIndexOfIS + is.length(),
						endingIndexOfIS);
				InitialState.add(initialState);

				String fs = "Final State:[ ";
				int startingIndexOfFS;
				startingIndexOfFS = line.indexOf("Final State:[ ");
				int endingIndexOfFS = line.indexOf(" ]", startingIndexOfFS);
				finalState = line.substring(startingIndexOfFS + fs.length(),
						endingIndexOfFS ); // capture last 
				FinalState.add(finalState);

				String rootStr = "root:[";
				for (int x = line.indexOf(rootStr); x > -1; x = line.indexOf(
						rootStr, ++x)) {
					int endingIndexOfRoot = line.indexOf("]", x);
					roots = line.substring(x + rootStr.length(),
							endingIndexOfRoot);

					Roots.add(roots);

					

				}

				Exp = new Document();
				Exp.append("derivProb", Arrays.asList(derivProb))
						.append("rootProb", Arrays.asList(rootProb))
						.append("initialState", Arrays.asList(initialState))
						.append("finalState", Arrays.asList(finalState))
						.append("Roots", Roots);

				
                                Doc.add(Exp);
				elexirCollection.insertOne(Exp);

			}
                              
                      else if (!line.startsWith("[Exp:")){
                          //System.out.println("At first if else");
                          // System.out.println(line);
                           if (line.contains("Probabilites:"))
                            {
                                //System.out.println("At line equals prob");
                                while (!line.contains("*** Done with problem. ***"))
                                {
                                    //System.out.println("Reached while loop");
                                   //read each line and save here

                                    probability += line + "\n"; 
                                    
                                    //System.out.println(probability);
                                  
                                    line = reader.readLine();
                                    
                                }
                                 
                                Probability.add(probability);    
                                      stats.append("Probability", Probability);
                                      elexirCollection.insertOne(stats);
                            }
                               
                        }
                             
                         line = reader.readLine();
                }// end while    
                 
                
                
                
                   
                     
                              
              
              

                
       

		FindIterable<Document> iter = elexirCollection.find();
		System.out.println("Your Documents have been stored into mongoDB ");



    }
    
    
  
      
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    JFileChooser chooser = new JFileChooser();
    String fileDirectory = chooser.getCurrentDirectory() + "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton BrowseButton;
    private static javax.swing.JButton StartButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField pathField;
    // End of variables declaration//GEN-END:variables
}