
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Johansen
 */
public class frameInputNilai extends javax.swing.JFrame {

    /**
     * Creates new form frameInputNilai
     */
    public frameInputNilai() {
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

        panelInputNilai = new javax.swing.JPanel();
        labeljudul = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        mataKuliah = new javax.swing.JLabel();
        nilaiKehadiran = new javax.swing.JLabel();
        labelNama3 = new javax.swing.JLabel();
        nilaiTugas = new javax.swing.JLabel();
        teksNama = new javax.swing.JTextField();
        teksNilaiKehadiran = new javax.swing.JTextField();
        teksNilaiTugas = new javax.swing.JTextField();
        teksNilaiMid = new javax.swing.JTextField();
        teksNilaiFinal = new javax.swing.JTextField();
        nilaiFinal = new javax.swing.JLabel();
        comboMataKuliah = new javax.swing.JComboBox<>();
        buttonHitung = new javax.swing.JButton();
        buttonKembali1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelNilai = new javax.swing.JTable();
        buttonEdit = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Input Data Mahasiswa");

        panelInputNilai.setBackground(new java.awt.Color(102, 102, 255));

        labeljudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labeljudul.setForeground(new java.awt.Color(255, 255, 255));
        labeljudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeljudul.setText("Formulir Input Nilai Mahasiswa");

        nama.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nama.setText("Nama:");

        mataKuliah.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        mataKuliah.setForeground(new java.awt.Color(255, 255, 255));
        mataKuliah.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mataKuliah.setText("Mata Kuliah:");

        nilaiKehadiran.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        nilaiKehadiran.setForeground(new java.awt.Color(255, 255, 255));
        nilaiKehadiran.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nilaiKehadiran.setText("Nilai Kehadiran:");

        labelNama3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        labelNama3.setForeground(new java.awt.Color(255, 255, 255));
        labelNama3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNama3.setText("Nilai MID:");

        nilaiTugas.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        nilaiTugas.setForeground(new java.awt.Color(255, 255, 255));
        nilaiTugas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nilaiTugas.setText("Nilai Tugas:");

        nilaiFinal.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        nilaiFinal.setForeground(new java.awt.Color(255, 255, 255));
        nilaiFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nilaiFinal.setText("Nilai Final:");

        comboMataKuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Pilih Mata Kuliah", "Matematika Diskrit", "Pemrograman Berorientasi Objek", "Pemrograman Web", "Sistem Basis Data", "Falsafah Pendidikan Kristen dan Roh Nubuat", "Struktur Data", "Bahasa Inggris III (Listening)", "Kewirausahaan Internet", "Pendidikan Bekerja"}));
        comboMataKuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMataKuliahActionPerformed(evt);
            }
        });

        buttonHitung.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buttonHitung.setText("Hitung dan Simpan");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        buttonKembali1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buttonKembali1.setText("Kembali ke Menu Utama");
        buttonKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembali1ActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(51, 51, 255));

        tabelNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nama", "Mata Kuliah", "Kehadiran", "Tugas", "MID", "Final", "Nilai Akhir", "Nilai Huruf"
            }
        ));
        tabelNilai.setEditingColumn(0);
        tabelNilai.setEditingRow(0);
        tabelNilai.setEnabled(false);
        jScrollPane3.setViewportView(tabelNilai);

        buttonEdit.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonSimpan.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buttonSimpan.setText("Simpan Perubahan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonHapus.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buttonHapus.setText("Hapus Semua Data");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInputNilaiLayout = new javax.swing.GroupLayout(panelInputNilai);
        panelInputNilai.setLayout(panelInputNilaiLayout);
        panelInputNilaiLayout.setHorizontalGroup(
            panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputNilaiLayout.createSequentialGroup()
                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputNilaiLayout.createSequentialGroup()
                        .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInputNilaiLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mataKuliah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelInputNilaiLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(labeljudul))
                                    .addGroup(panelInputNilaiLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(teksNama, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputNilaiLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69))))
                            .addGroup(panelInputNilaiLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonHitung)
                                    .addGroup(panelInputNilaiLayout.createSequentialGroup()
                                        .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelInputNilaiLayout.createSequentialGroup()
                                                .addComponent(nilaiKehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(teksNilaiKehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelInputNilaiLayout.createSequentialGroup()
                                                .addComponent(nilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(teksNilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(38, 38, 38)
                                        .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nilaiFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelNama3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(teksNilaiMid, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(teksNilaiFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 212, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputNilaiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonKembali1)))
                .addContainerGap())
            .addComponent(jScrollPane3)
        );
        panelInputNilaiLayout.setVerticalGroup(
            panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputNilaiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInputNilaiLayout.createSequentialGroup()
                        .addComponent(labeljudul)
                        .addGap(51, 51, 51))
                    .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teksNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nama)))
                .addGap(7, 7, 7)
                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mataKuliah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiKehadiran)
                    .addComponent(labelNama3)
                    .addComponent(teksNilaiKehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teksNilaiMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiTugas)
                    .addComponent(teksNilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilaiFinal)
                    .addComponent(teksNilaiFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonHitung)
                .addGap(18, 18, 18)
                .addGroup(panelInputNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKembali1)
                    .addComponent(buttonEdit)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInputNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInputNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMataKuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMataKuliahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMataKuliahActionPerformed

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        // TODO add your handling code here:
        double kehadiran, tugas, mid, finall, akhir;
        String grade;
        DefaultTableModel model = (DefaultTableModel) tabelNilai.getModel();
        List tambah = new ArrayList<>();
        tabelNilai.setAutoCreateColumnsFromModel(true);
        try{
        tambah.add(teksNama.getText());
        tambah.add(comboMataKuliah.getSelectedItem().toString());
        
        tambah.add(teksNilaiKehadiran.getText());
        tambah.add(teksNilaiTugas.getText());
        tambah.add(teksNilaiMid.getText());
        tambah.add(teksNilaiFinal.getText());
        //checkpoint
        kehadiran = Double.valueOf(teksNilaiKehadiran.getText());
        tugas = Double.valueOf(teksNilaiTugas.getText());
        mid = Double.valueOf(teksNilaiMid.getText());
        finall = Double.valueOf(teksNilaiFinal.getText());
        
        akhir = (0.1*kehadiran) + (0.2*tugas) + (0.3*mid) + (0.4*finall);
        tambah.add(String.valueOf(akhir));
        //checkpoint
        if(akhir>=96){
            grade="A";
        } else if(akhir>=90){
            grade="A-";
        } else if(akhir>=84){
            grade="B+";
        } else if(akhir>=78){
            grade="B";
        } else if(akhir>=72){
            grade="B-";
        } else if(akhir>=66){
            grade="C+";
        } else if(akhir>=60){
            grade="C";
        } else if(akhir>=54){
            grade="C-";
        } else {
            grade="F";
        }
        
        tambah.add(String.valueOf(grade));
        
        model.addRow(tambah.toArray());
        
        
        teksNama.setText("");
        comboMataKuliah.setSelectedItem("Pilih Mata Kuliah");
        teksNilaiKehadiran.setText("");
        teksNilaiTugas.setText("");
        teksNilaiMid.setText("");
        teksNilaiFinal.setText("");
        
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Semua nilai harus dimasukkan dan harus menggunakan kombinasi angka saja!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void buttonKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembali1ActionPerformed
        // TODO add your handling code here:
        dispose();
        menuUtama menu = new menuUtama();
        menu.setVisible(true);
    }//GEN-LAST:event_buttonKembali1ActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        tabelNilai.setEnabled(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        tabelNilai.setEnabled(false);
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelNilai.getModel();
        int response = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus semua data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
            if (tabelNilai.getRowCount() > 0) {
                for (int i = tabelNilai.getRowCount() - 1; i > -1; i--) {
                    model.removeRow(i);
                }
            }
        }
        else if (response == JOptionPane.NO_OPTION){
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

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
            java.util.logging.Logger.getLogger(frameInputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameInputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameInputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameInputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameInputNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonHitung;
    private javax.swing.JButton buttonKembali1;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox<String> comboMataKuliah;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelNama3;
    private javax.swing.JLabel labeljudul;
    private javax.swing.JLabel mataKuliah;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nilaiFinal;
    private javax.swing.JLabel nilaiKehadiran;
    private javax.swing.JLabel nilaiTugas;
    public static javax.swing.JPanel panelInputNilai;
    public javax.swing.JTable tabelNilai;
    private javax.swing.JTextField teksNama;
    private javax.swing.JTextField teksNilaiFinal;
    private javax.swing.JTextField teksNilaiKehadiran;
    private javax.swing.JTextField teksNilaiMid;
    private javax.swing.JTextField teksNilaiTugas;
    // End of variables declaration//GEN-END:variables
}