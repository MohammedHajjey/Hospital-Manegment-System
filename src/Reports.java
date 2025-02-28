  
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Reports extends javax.swing.JFrame {
    ArrayList<BillingInformation> allRecord = new ArrayList<>();
    ArrayList<Pharmcy> allMedicines = new ArrayList<>();
    ArrayList<Patient> allPatients = new ArrayList<>();
   
    public Reports() {
        initComponents();
        readAllMData();
        readAllPData();
        readAllRData();
        
        Image icon = new ImageIcon(this.getClass().getResource("/nurse.png")).getImage();
    }
    
    
    
    
    
     void readAllPData(){
        try {
            File pfile = new File("patientData.txt");
            Scanner scanner = new Scanner(pfile);
            
                while (scanner.hasNextLine()) {
                  
                    String data = scanner.nextLine();
                    String[] currentData = data.split("-");
                    Patient patient = new Patient();
                    patient.setPatientId(Integer.parseInt(currentData[0])); 
                    patient.setPatientName(currentData[1]); 
                    patient.setPatientAge(Integer.parseInt(currentData[2]));
                    patient.setGender(currentData[3]); 
                    patient.setAdress(currentData[4]); 
                    patient.setContact(currentData[5]); 
                    allPatients.add(patient);
            }
               scanner.close();
            
        } catch (Exception e) {
        }
    }
    
    void readAllRData(){
        try {
            File pfile = new File("record.txt");
            Scanner scanner = new Scanner(pfile);
            
                while (scanner.hasNextLine()) {
                  
                    String data = scanner.nextLine();
                    String[] currentData = data.split("-");
                    BillingInformation record= new BillingInformation();
                    record.setPatientID(Integer.parseInt(currentData[0])); 
                    record.setFee(Integer.parseInt(currentData[1])); 
                    record.setRecommendations(currentData[2]);
                    record.setDate(currentData[3]); 
                    
                    String[] mlist = currentData[4].split(",");
                    for (int i = 0; i < mlist.length-1; i++) {
                         record.setMedicineID(Integer.parseInt(mlist[i]));
                    }
                    allRecord.add(record);
            }
               scanner.close();
            
        } catch (Exception e) {
        }
    }
    
    
    
     void readAllMData(){
        try {
            File pfile = new File("pharamcyData.txt");
            Scanner scanner = new Scanner(pfile);
            
                while (scanner.hasNextLine()) {
                  
                    String data = scanner.nextLine();
                    String[] currentData = data.split("-");
                    Pharmcy medicines = new Pharmcy();
                    medicines.setId(Integer.parseInt(currentData[0])); 
                    medicines.setName(currentData[1]); 
                    medicines.setSellingPrice(Integer.parseInt(currentData[2]));
                    medicines.setBuyingPrice(Integer.parseInt(currentData[3])); 
                    medicines.setQuantity(Integer.parseInt(currentData[4])); 
                    medicines.setDescription(currentData[5]); 
                    allMedicines.add(medicines);
            }
               scanner.close();
            
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backArrow = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pr = new javax.swing.JTextArea();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical-team 3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("ETÜ Hospital");

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Raporlar");

        backArrow.setForeground(new java.awt.Color(255, 255, 255));
        backArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backArrow (1).png"))); // NOI18N
        backArrow.setBorder(null);
        backArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backArrowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backArrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backArrowMouseExited(evt);
            }
        });
        backArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backArrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backArrow)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backArrow)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Get Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pr.setColumns(20);
        pr.setRows(5);
        jScrollPane1.setViewportView(pr);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("TC Giriniz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
            .addGroup(layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseClicked

        setVisible(false);
        new Home().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_backArrowMouseClicked

    private void backArrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseEntered
        backArrow.setBackground(java.awt.Color.gray);
        // TODO add your handling code here:
    }//GEN-LAST:event_backArrowMouseEntered

    private void backArrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseExited
        backArrow.setBackground(java.awt.Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_backArrowMouseExited

    private void backArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backArrowActionPerformed
        setVisible(false);
        new Home().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_backArrowActionPerformed

    
    Patient getPData(int currId){
        for (int i = 0; i < allPatients.size(); i++) {
            if (allPatients.get(i).getPatientId()== currId) {
                return allPatients.get(i);
            }
        }
        return null;
    }
    
    Pharmcy  getMData(int currId){
        for (int i = 0; i < allMedicines.size(); i++) {
            if (allMedicines.get(i).getId()== currId) {
                return allMedicines.get(i);
            }
        }
        return null;
    }
    
         
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "TC Giriniz Lütfen ...","Talimat", HEIGHT );
        }
        
        else{
            System.out.println(" ffdf");
            for (int i = 0; i <allRecord.size(); i++) {
                System.out.println("22");
                
                if (allRecord.get(i).getPatientID() == Integer.parseInt(id.getText())) {
                   pr.append("\n\n\tHastanin Bilgileri \n");
                   Patient patient = getPData(allRecord.get(i).getPatientID());
                   
                   pr.append("Hastanin AdI : "+patient.getPatientName() + "\n\n");
                   pr.append("Telefon NumarasI : "+patient.getContact() + "\n");
                   pr.append("\nIlaçlar   \n");
                   
                    ArrayList<Integer> tmp ;
                    tmp = allRecord.get(i).getMedicineID();
                    for (int j = 0; j < tmp.size(); j++) {
                        Pharmcy medicine = getMData(tmp.get(j));
                        pr.append( medicine.getName() + "\n");
                    }
                    
                    pr.append("\n Tarih         : " + allRecord.get(i).getDate());
                    pr.append("\n Tavsiyeler    : " + allRecord.get(i).getRecommendations());
                    pr.append("\n Muayene Borcu :"+allRecord.get(i).getFee());
                    pr.append("\n******************************************************\n");
                    
                }
            }
        }
        


        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backArrow;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pr;
    // End of variables declaration//GEN-END:variables
}
