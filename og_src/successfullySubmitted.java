/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARAN
 */
public class successfullySubmitted extends javax.swing.JFrame {

    /**
     * Creates new form sucessfullySubmited
     */
    quizExamStudent ref;
    public successfullySubmitted(quizExamStudent ref) {
        System.out.println("A");
        this.ref=ref;
        initComponents();
        String marks1="Marks Obtained :"+ref.marks;
        //jLabel1.setText(marks1);
         String correct="Correct Answers :"+ref.correct;
        String incorrect="Incorrect Answers :"+ref.incorrect;
        String attempted="Attempted Answers :"+ref.attempted;
        String unattempted="Unattempted Answers :"+ref.unattempted;
         System.out.println(correct);
          jLabel1.setText(marks1);
        jLabel4.setText(correct);
        jLabel5.setText(incorrect);
        jLabel6.setText(attempted);
        jLabel7.setText(unattempted);
        }
    
         public successfullySubmitted(String marks) {
             System.out.println("B");
        initComponents();
                
        String marks1="Marks Obtained :"+marks;
        jLabel1.setText(marks1);
        String correct="Correct Answers :"+ref.correct;
        System.out.println(correct);
        String incorrect="Incorrect Answers :"+ref.incorrect;
        String attempted="Attempted Answers :"+ref.attempted;
        String unattempted="Unattempted Answers :"+ref.unattempted;
        jLabel4.setText(correct);
        jLabel5.setText(incorrect);
        jLabel6.setText(attempted);
        jLabel7.setText(unattempted);
        
        
        
    }
        
         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1233, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setText("Marks Obtained: 10");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 264, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setText("Sucessfully Updated");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 390, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 360, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 370, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 330, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(successfullySubmitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(successfullySubmitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(successfullySubmitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(successfullySubmitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
          //      new successfullySubmitted().setVisible(true);
           // }
       // });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
