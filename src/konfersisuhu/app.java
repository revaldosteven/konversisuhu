package konfersisuhu;

public class app extends javax.swing.JFrame { 


    public app() {
        initComponents();
        Reset();
    } 
     
    void Reset(){
        tSuhuAsal.setText(null);
        vHasil.setText(null);
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tSuhuAsal = new javax.swing.JTextField();
        tSkalaAsal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tSkalaTujuan = new javax.swing.JComboBox<>();
        bKonversi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        vHasil = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();
        bClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUHU ASAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tSkalaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenhaiet" }));
        tSkalaAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSkalaAsalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tSuhuAsal)
                    .addComponent(tSkalaAsal, 0, 230, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tSkalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KONVERSI KE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tSkalaTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenhaiet" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bKonversi.setBackground(new java.awt.Color(204, 0, 204));
        bKonversi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konfersisuhu/transfer.png"))); // NOI18N
        bKonversi.setText("KONVERSI");
        bKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKonversiActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        vHasil.setBackground(new java.awt.Color(153, 153, 255));
        vHasil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        vHasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vHasil.setText("jLabel2");
        jPanel3.add(vHasil, java.awt.BorderLayout.CENTER);

        bReset.setBackground(new java.awt.Color(204, 0, 204));
        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konfersisuhu/circular-arrow.png"))); // NOI18N
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bClose.setBackground(new java.awt.Color(204, 0, 204));
        bClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konfersisuhu/delete.png"))); // NOI18N
        bClose.setText("CLOSE");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bKonversi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bClose))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bKonversi)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClose)
                    .addComponent(bReset))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
      Reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
      dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void bKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKonversiActionPerformed
       double suhuasal = Double.parseDouble(tSuhuAsal.getText());
       String skalaasal = tSkalaAsal.getSelectedItem().toString();
       String skalatujuan = tSkalaTujuan.getSelectedItem().toString();
       double hasil = 0;
       if(skalaasal.equals("Celcius") && skalatujuan.equals("Celcius")){
           hasil = suhuasal;
       } else if(skalaasal.equals("Celcius") && skalatujuan.equals("Kelvin")) {
           hasil = suhuasal + 273.15;
       } else if (skalaasal.equals("Celcius") && skalatujuan.equals("Fahrenhaiet")) {
           hasil = suhuasal * 9/5 + 32;
       } else if (skalaasal.equals("Kelvin") && skalatujuan.equals("Celcius")) {
           hasil = suhuasal - 273.15;
       } else if (skalaasal.equals("Kelvin") && skalatujuan.equals("Kelvin")) {
           hasil = suhuasal;
       } else if (skalaasal.equals("Kelvin") && skalatujuan.equals("Fahrenhaiet")) {
           hasil = (suhuasal- 273.15) * 9/5 + 32;
       } else if (skalaasal.equals("Fahrenhaiet") && skalatujuan.equals("Celcius")) {
           hasil = (suhuasal - 32)* 5/9;
       } else if (skalaasal.equals("Fahrenhaiet") && skalatujuan.equals("Kelvin")) {
           hasil = (suhuasal - 32)* 5/9 + 273.15;
       } else if (skalaasal.equals("Fahrenhaiet") && skalatujuan.equals("Fahrenhaiet")) {
           hasil = suhuasal;
       }
       String skala = skalatujuan.substring(0,1);
       vHasil.setText(String.format("%.2f", hasil) + " \u00B0" + skala);
    }//GEN-LAST:event_bKonversiActionPerformed

    private void tSkalaAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSkalaAsalActionPerformed
     
    }//GEN-LAST:event_tSkalaAsalActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bKonversi;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> tSkalaAsal;
    private javax.swing.JComboBox<String> tSkalaTujuan;
    private javax.swing.JTextField tSuhuAsal;
    private javax.swing.JLabel vHasil;
    // End of variables declaration//GEN-END:variables
}
