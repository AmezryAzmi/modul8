
package gui;
import java.util.ArrayList;
import java.util.Iterator;
public class Form extends javax.swing.JFrame {
    public Form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Merk = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Model = new javax.swing.JComboBox<>();
        Price = new javax.swing.JLabel();
        Uang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JLabel();
        Hasil2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Merk...", "BMW", "Audi", "Honda", "Porsche" }));
        Merk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MerkItemStateChanged(evt);
            }
        });
        Merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerkActionPerformed(evt);
            }
        });

        jLabel1.setText("SELAMAT DATANG DI TOKO 62");

        Model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model..." }));
        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });

        Uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UangActionPerformed(evt);
            }
        });

        jLabel2.setText("Price");

        jLabel3.setText("Model");

        jLabel4.setText("Merk");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Masukkan Uang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(Uang, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Merk, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Hasil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Merk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uang, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hasil2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerkActionPerformed
       
    }//GEN-LAST:event_MerkActionPerformed

    private void MerkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MerkItemStateChanged
        ArrayList<String> array = new ArrayList<>();
        Iterator<String> iter;
        if (Merk.getSelectedItem().equals("BMW")){
            Model.removeAllItems();
            array.add("M3");
            array.add("X5");
            array.add("Z4");
            array.add("I8");
            iter = array.iterator();
            while(iter.hasNext()){
                Model.addItem(iter.next());
            }
        }                   
        else if (Merk.getSelectedItem().equals("Audi")){
            Model.removeAllItems();
            array.add("A4");
            array.add("RS5");
            array.add("Q8");
            array.add("R8");
            iter = array.iterator();
            while(iter.hasNext()){
                Model.addItem(iter.next());
            }
        }
        else if (Merk.getSelectedItem().equals("Honda")){
            Model.removeAllItems();
            array.add("CRV");
            array.add("Accord");
            array.add("Civic Type R");
            array.add("Jazz");
            iter = array.iterator();
            while(iter.hasNext()){
                Model.addItem(iter.next());
            }
        }
        else if (Merk.getSelectedItem().equals("Porsche")){
            Model.removeAllItems();
            array.add("Cayanne");
            array.add("Panamera");
            array.add("Boxster");
            array.add("911");
            iter = array.iterator();
            while(iter.hasNext()){
                Model.addItem(iter.next());
            }
        }
        else {
           Model.removeAllItems(); 
        }
    }//GEN-LAST:event_MerkItemStateChanged

    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed
        String itemSelected = Model.getSelectedItem()+"";
        Price.setText(itemSelected);
        double priceitem = 0;
        
        if (itemSelected.equals("M3")){
            priceitem = 7000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("X5")){
            priceitem = 7300;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Z4")){
            priceitem = 8000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("I8")){
            priceitem = 8700;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("A4")){
            priceitem = 6500;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("RS5")){
            priceitem = 6800;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Q8")){
            priceitem = 7000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("R8")){
            priceitem = 9000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("CRV")){
            priceitem = 5000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Accord")){
            priceitem = 5500;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Civic Type R")){
            priceitem = 6000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Jazz")){
            priceitem = 4000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Cayanne")){
            priceitem = 6500;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Panamera")){
            priceitem = 6000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("Boxster")){
            priceitem = 7000;
            Price.setText ("$" + priceitem);
        }
        else if (itemSelected.equals("911")){
            priceitem = 9000;
            Price.setText ("$" + priceitem);
        }
       
    }//GEN-LAST:event_ModelActionPerformed

    private void UangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UangActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Uang.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Uang.getText();
        int i = Integer.parseInt(Uang.getText());
        String itemSelected = Model.getSelectedItem()+"";
        String berhasil = "SELAMAT ANDA TELAH MEMBELI MOBIL!!!";
        String berhasil2 = "Kembalian Anda = $";
        String gagal    = "Maaf Uang Anda Kurang";
        double priceitem = 0;
        
        if (itemSelected.equals("M3")){
            priceitem = 7000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("X5")){
            priceitem = 7300;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Z4")){
            priceitem = 8000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("I8")){
            priceitem = 8700;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("A4")){
            priceitem = 6500;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("RS5")){
            priceitem = 6800;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Q8")){
            priceitem = 7000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("R8")){
            priceitem = 9000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("CRV")){
            priceitem = 5000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Accord")){
            priceitem = 5500;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Civic Type R")){
            priceitem = 6000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Jazz")){
            priceitem = 4000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Cayanne")){
            priceitem = 6500;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Panamera")){
            priceitem = 6000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("Boxster")){
            priceitem = 7000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
            }
        }
        else if (itemSelected.equals("911")){
            priceitem = 9000;
            if (i >= priceitem){
                double kembalian = i - priceitem;
                Hasil.setText(berhasil);
                Hasil2.setText(berhasil2 + kembalian);
            }
            else {
                Hasil.setText(gagal);
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hasil;
    private javax.swing.JLabel Hasil2;
    private javax.swing.JComboBox<String> Merk;
    private javax.swing.JComboBox<String> Model;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField Uang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
