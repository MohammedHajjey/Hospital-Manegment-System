
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Checkup extends javax.swing.JFrame {

    ArrayList<Pharmcy> allMedicines = new ArrayList<>();
    ArrayList<Patient> allPatients = new ArrayList<>();
    ArrayList<BillingInformation> record = new ArrayList<>();

    public Checkup() {
        initComponents();
        readAllMData();
        readAllPData();

        loadMedicines();
    }

    void loadMedicines() {
        allM.removeAllItems();
        for (int i = 0; i < allMedicines.size(); i++) {
            allM.addItem(allMedicines.get(i).getId() + "-" + allMedicines.get(i).getName());
        }
    }

    void readAllPData() {
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

    void readAllMData() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        allM = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mlist = new javax.swing.JTextArea();
        fee = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical-team 5.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("ETÜ Hospital");

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Reçeteleme ");

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
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 706, Short.MAX_VALUE)
                .addComponent(backArrow)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(backArrow))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Patient ID");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Madicines");

        allM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        allM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 0));
        jButton1.setText("Add Madicine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Madicine List");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Recomendations");

        rec.setColumns(20);
        rec.setRows(5);
        jScrollPane2.setViewportView(rec);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Quantity");

        mlist.setColumns(20);
        mlist.setRows(5);
        jScrollPane3.setViewportView(mlist);

        fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Fee");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(quantity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(allM, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(allM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void allMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allMActionPerformed

    void SaveAllPData() {

        try {
            FileWriter fWriter = new FileWriter("patientData.txt");

            for (int i = 0; i < allPatients.size(); i++) {
                fWriter.write(allPatients.get(i).getPatientId() + "-" + allPatients.get(i).getPatientName()
                        + "-" + allPatients.get(i).getPatientAge() + "-" + allPatients.get(i).getGender()
                        + "-" + allPatients.get(i).getAdress() + "-" + allPatients.get(i).getContact() + "\n");

            }
            fWriter.close();
        } catch (Exception e) {
        }
    }

    void SaveAllMData() {

        try {
            FileWriter fWriter = new FileWriter("pharamcyData.txt");

            for (int i = 0; i < allMedicines.size(); i++) {
                fWriter.write(allMedicines.get(i).getId() + "-" + allMedicines.get(i).getName()
                        + "-" + allMedicines.get(i).getSellingPrice() + "-" + allMedicines.get(i).getBuyingPrice()
                        + "-" + allMedicines.get(i).getQuantity() + "-" + allMedicines.get(i).getDescription() + "\n");

            }
            fWriter.close();
        } catch (Exception e) {
        }
    }

    void SaveAllRData() {

        try {
            BufferedWriter fWriter = new BufferedWriter(new FileWriter("record.txt", true));

            for (int i = 0; i < record.size(); i++) {
                fWriter.write(record.get(i).getPatientID() + "-" + record.get(i).getFee()
                        + "-" + record.get(i).getRecommendations() + "-" + record.get(i).getDate() + "-");

                ArrayList<Integer> tmp = record.get(i).getMedicineID(); // recetede ilacinlarin idlerini koyuyuoruz
                for (int j = 0; j < tmp.size(); j++) {
                    fWriter.write(tmp.get(j) + ",");
                }
                fWriter.write("\n");
            }

            fWriter.close();
        } catch (Exception e) {
        }
    }

    boolean CheckForQuantity() {
    try {
        int currentMId = Integer.parseInt(allM.getSelectedItem().toString().split("-")[0]);

        for (int i = 0; i < allMedicines.size(); i++) {
            if (currentMId == allMedicines.get(i).getId()) {
                int requestedQuantity = Integer.parseInt(quantity.getText());

                if (requestedQuantity > allMedicines.get(i).getQuantity()) {
                    return true;
                }
            }
        }
    } catch (NumberFormatException e) {
        // Handle the exception or display an error message
        JOptionPane.showMessageDialog(null, "Invalid quantity input or medicine selection");
    }

    return false;
}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (quantity.getText().equals("") || allM.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Adet Seçiniz Lütfen");
        } else if (CheckForQuantity()) {
            JOptionPane.showMessageDialog(null, "Bu ilaçtan yeterlikadar miktar bulunmamaktadır..!");
        } else {
            System.out.println("kkkk");
            mlist.append(allM.getSelectedItem()+"-"+ quantity.getText()+"\n");
            quantity.setText("");
           

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    boolean patienIdExist() {
        for (int i = 0; i < allPatients.size(); i++) {
            if (id.getText().equals(allPatients.get(i).getPatientId() + "")) {
                return false;
            }
        }
        return true;
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (id.getText().equals("") || rec.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Boş Alanlari Doldurununz..!");
        } else if (patienIdExist()) {
            JOptionPane.showMessageDialog(null, "Bu Hasta Bulunmadi");
        } else {

            BillingInformation billingInfo = new BillingInformation();
            String bill = "";
            int total = 0;
            billingInfo.setPatientID(Integer.parseInt(id.getText()));
            billingInfo.setFee(Integer.parseInt(fee.getText()));

            String[] mData = mlist.getText().split("\n");

            for (int i = 0; i < mData.length; i++) {

                billingInfo.setMedicineID(Integer.parseInt(mData[i].split("-")[0]));
                int curQuantity = Integer.parseInt(mData[i].split("-")[2]);
                int curid = Integer.parseInt(mData[i].split("-")[0]);

                for (int j = 0; j < allMedicines.size(); j++) {
                    if (allMedicines.get(j).getId() == curid) {
                        bill += allMedicines.get(j).getName() + " = " + allMedicines.get(j).getSellingPrice() + "\n";
                        total += allMedicines.get(j).getSellingPrice() * curQuantity;
                        allMedicines.get(j).setQuantity(allMedicines.get(j).getQuantity() - curQuantity);

                    }
                }
            }
            billingInfo.setRecommendations(rec.getText());//

            // tarih clasi
            DateFormat currentDateFormat = new SimpleDateFormat("dd:MM:yyyy");//
            Date cDate = new Date();
            billingInfo.setDate(currentDateFormat.format(cDate));//

            record.add(billingInfo);
            SaveAllMData();
            SaveAllRData();

            bill += "\nIlacın Toplam Fiyatı = " + total;
            bill += "\nDoctor Muayene Muayene= " + fee.getText();
            bill += "\nToplam = " + total + "+" + Integer.parseInt(fee.getText());
            JOptionPane.showMessageDialog(null, "Fatura \n" + bill);

            id.setText("");
            fee.setText("");
            rec.setText("");
            mlist.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeActionPerformed

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
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> allM;
    private javax.swing.JButton backArrow;
    private javax.swing.JTextField fee;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea mlist;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextArea rec;
    // End of variables declaration//GEN-END:variables
}
