/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saliy5109
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        mianPanel = new javax.swing.JPanel();
        textPanel = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        option1_button = new javax.swing.JButton();
        option2_button = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setText("It was a nice, sunny, warm, bright day and you were walking down a hill.\n\nAll of a sudden... You are in the middle of a drive by! Before you know it, the man opens fire on you.\n\nWhat do you do?\n\nTake cover)\n\nTalk your way out)");
        textArea.setWrapStyleWord(true);
        textPanel.setViewportView(textArea);

        option1_button.setText("Talk out");
        option1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1_buttonActionPerformed(evt);
            }
        });

        option2_button.setText("Cover");
        option2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mianPanelLayout = new javax.swing.GroupLayout(mianPanel);
        mianPanel.setLayout(mianPanelLayout);
        mianPanelLayout.setHorizontalGroup(
            mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mianPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mianPanelLayout.createSequentialGroup()
                        .addComponent(option2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(option1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        mianPanelLayout.setVerticalGroup(
            mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mianPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    //Variables
    int page = 1;
    //Page 1- Drive by.
    //Page 2- Death from talking your way out
    //Page 6- You died screen
    //Page 7- Can I go back?
    //Page 8- Please can I go back?
    //Page 9- Come on
    //Page 10- Died again
    
    //Page 11- Took Cover
    //Page 12- Blocked
    //Page 13- Ran 
    //Page 14- Fell for it
    //Page 15- Hidden
    
    //Page 100- Ending 1- Forever dead
    //Page 101- Ending 2- Watch yo tone
    //Page 102- Ending 3- Happy ending
    //Page 103- Ending 4- Disappointment
    //Page 104- Ending 5- Ending
    boolean secondLife = false;
    
    private void option1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1_buttonActionPerformed
        // TODO add your handling code here:
        //Right Option
        
        if (page == 1) { //Drive by, talk your way out TO Death from talking your way out
            if (secondLife == false) {  //Normal Start
                textArea.setText("\"yo-\"\n" +
                "You were cut off by a bullet before you could finish your sentence. \n" +
                "You won't make it.\n\n" + "-What do you do now?\n\n" + "Death)");
                option1_button.setText("Death");
                option2_button.setText("");
                page = 2; //Goes to death from talking your way out 
            } else {     //Died again, Go back TO Ending 4- Disappointment
                textArea.setText("...");
                option1_button.setText("How");
                option2_button.setText("Why");
                page = 103; //Goes to Ending 4- Disappointment
            }
        } else if (page == 2) {    //Talk your way out, Death TO You died screen
            textArea.setText("You died.\n\n" + "-What do you do now?\n\n" + "Go back)\n\n" + "Ok)");
            option1_button.setText("Ok");
            option2_button.setText("Go back");
            page = 6; //Goes to you died screen 
        } else if (page ==  6) {//You died screen, Ok TO Ending 1- Forever dead
            textArea.setText("You died. This is the end.");
            option1_button.setText("End");
            option2_button.setText("End");
            page = 100; //Goes to Ending 1- Forever dead
        } else if (page ==  7) {//Can I go back?, Come on TO Come on
            textArea.setText("One more chance? Sure" + "\n\n-What do you do now?\n\n"
            + "Go back)");
            option1_button.setText("Go back");
            option2_button.setText("");
            page = 9; //Goes to Come on
        } else if (page ==  8) {//Please can I go back?, Threaten TO Ending 2- Watch yo tone
            textArea.setText("You run to punch it but it kills you instantly.");
            option1_button.setText("");
            option2_button.setText("");
            page = 101; //Goes to Ending 2- Watch yo tone
        } else if (page ==  9) {//Come on, Go back TO Drive by
            textArea.setText("It was a nice, sunny, warm, bright day and you were walking down a hill.\n" +
            "\n" + "All of a sudden... You are in the middle of a drive by! Before you know it, the man opens fire on you.\n" +
            "\n" + "What do you do?\n" + "\n" + "Take cover)\n" + "\n" + "Talk your way out)");
            option1_button.setText("Talk out");
            option2_button.setText("Cover");
            page = 1; //Goes to Drive by
            secondLife = true;
        } else if (page == 12) {//Blocked, Death TO You died screen
            textArea.setText("You died.\n\n" + "-What do you do now?\n\n" + "Go back)\n\n" + "Ok)");
            option1_button.setText("Ok");
            option2_button.setText("Go back");
            page = 6; //Goes to you died screen 
        } else if (page ==  11) {//Took Cover, Run TO Ran
            textArea.setText("You turn back and run fast. \nYou manage to lose the bear but the man in the car chases behind you.\n"
            + "If you don't do something he will catch up.\n\n" + "-What do you do now?\n\n"
            + "Trap) Set up a booby trap\n\n" + "Hide) Hide somewhere");
            option1_button.setText("Hide");
            option2_button.setText("Trap");
            page = 13; //Goes to Ran
        } else if (page ==  13) {//Ran, Hide TO Ending
            textArea.setText("You hide inside a trash can and lose the man.\n"
            + "However, it turns out the trash was a portal to another world.\n\n"
            + "The fall from the sky into a cooler world and you live happly forever.\n\n The end.");
            option1_button.setText("");
            option2_button.setText("");
            page = 104; //Goes to Ending
        }
        else if (page == 14) {//You Fell for it, Death TO You died screen
            textArea.setText("You died.\n\n" + "-What do you do now?\n\n" + "Go back)\n\n" + "Ok)");
            option1_button.setText("Ok");
            option2_button.setText("Go back");
            page = 6; //Goes to you died screen 
        }
    }//GEN-LAST:event_option1_buttonActionPerformed

    private void option2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2_buttonActionPerformed
        // TODO add your handling code here:
        //Left Option
        
        if (page == 1) {    //Drive by, Take Cover TO Took Cover
            textArea.setText("You take cover behind a tree and manage to not be shot.\n"
            + "However it isn't over yet, the man had anticipated that you would take cover.\n\n" 
            + "The car comes to a stop, and out comes a big black bear from the back seat.\n"
            + "The bear roars and charges towards you.\n\n" 
            + "-What do you do now?\n\n" + "Block) Block it's attack and counter attack.\n\n"
            + "Run) Run away, bears are slower than humans.");
            option1_button.setText("Run");
            option2_button.setText("Block");
            page = 11; //Goes to Took Cover
        } else if (page == 6) {    //You died screen, Go back TO Can I go back?
            textArea.setText("Go back? What do you mean? You died, there is no going back."
            + "\n\n-What do you do now?\n\n" + "Please) Can I please go back?\n\n"  
            + "Come on) Can I have just one more chance?");
            option1_button.setText("Come on");
            option2_button.setText("Please");
            page = 7; //Goes to can I go back?
        } else if (page == 7) {    //Can I go back?, Please TO Please can I go back?
            textArea.setText("No." + "\n\n-What do you do now?\n\n" + "Threaten) Threaten with violence\n\n"
            + "Charm)");
            option1_button.setText("Threaten");
            option2_button.setText("Charm");
            page = 8;//Goes to Please can I go back?
        } else if (page == 8) {    //Please can I go back?, Charm TO Ending 3- Happy ending
            textArea.setText("You charm it and live happy after forever.");
            option1_button.setText("");
            option2_button.setText("");
            page = 102; //Goes to Ending 3- Happy ending
        } else if (page == 11) {    //Took Cover, Block TO Blocked
            if (secondLife == false) {
            textArea.setText("The bear swings at you!\nYou try to block it, but the bear feints and bites you.\n\n"
            + "-What do you do now?\n\n" + "Death)");
            option1_button.setText("Death");
            option2_button.setText("");
            page = 12; //Goes to Blocked
            } else {                 //Took Cover, Block TO Ending 4- Disappointment
                textArea.setText("...");
                option1_button.setText("How");
                option2_button.setText("Why");
                page = 103; //Goes to Ending 4- Disappointment
            }
        } else if (page ==  13) {//Took Ran, Trap TO Fell for it
            if (secondLife == false) {
                textArea.setText("You craft a bear trap and arm it in the middle of the road.\n"
                + "The car races towards you and set off the bear trap.\n"
                + "The bear trap pops it's front tire which stop the car right infront of you\n\n."
                + "However the man comes out of the car and runs you with a gun.\n\n"
                + "-What do you do now?\n\n" + "Death)");
                option1_button.setText("Death");
                option2_button.setText("");
                page = 14; //Goes to Fell for it
            } else {                    //Took Ran, Trap TO Ending 4- Disappointment
                textArea.setText("...");
                option1_button.setText("How");
                option2_button.setText("Why");
                page = 103; //Goes to Ending 4- Disappointment
            }
        } 

    }//GEN-LAST:event_option2_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mianPanel;
    private javax.swing.JButton option1_button;
    private javax.swing.JButton option2_button;
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollPane textPanel;
    // End of variables declaration//GEN-END:variables
}
