/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simpus;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Ailsa
 */
public class GUIUtama extends javax.swing.JFrame {

    /**
     * Creates new form GUIUtama
     */
    public GUIUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNavbar = new javax.swing.JPanel();
        pnSidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnMenu = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        pnUtama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnNavbar.setBackground(new java.awt.Color(102, 221, 232));
        pnNavbar.setPreferredSize(new java.awt.Dimension(998, 70));

        javax.swing.GroupLayout pnNavbarLayout = new javax.swing.GroupLayout(pnNavbar);
        pnNavbar.setLayout(pnNavbarLayout);
        pnNavbarLayout.setHorizontalGroup(
            pnNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        pnNavbarLayout.setVerticalGroup(
            pnNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(pnNavbar, java.awt.BorderLayout.PAGE_START);

        pnSidebar.setBackground(new java.awt.Color(255, 255, 255));
        pnSidebar.setPreferredSize(new java.awt.Dimension(250, 543));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        pnMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnMenu.setLayout(new javax.swing.BoxLayout(pnMenu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnMenu);

        javax.swing.GroupLayout pnSidebarLayout = new javax.swing.GroupLayout(pnSidebar);
        pnSidebar.setLayout(pnSidebarLayout);
        pnSidebarLayout.setHorizontalGroup(
            pnSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        pnSidebarLayout.setVerticalGroup(
            pnSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSidebarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        getContentPane().add(pnSidebar, java.awt.BorderLayout.LINE_START);

        pnContent.setBackground(new java.awt.Color(255, 255, 255));

        pnUtama.setBackground(new java.awt.Color(255, 255, 255));
        pnUtama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1016, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnNavbar;
    private javax.swing.JPanel pnSidebar;
    private javax.swing.JPanel pnUtama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconHome          = new ImageIcon(getClass().getResource("/Gambaran/Home.png"));
        ImageIcon iconData          = new ImageIcon(getClass().getResource("/Gambaran/Data.png"));
        ImageIcon iconBuku          = new ImageIcon(getClass().getResource("/Gambaran/Book.png"));
        ImageIcon iconSkripsi       = new ImageIcon(getClass().getResource("/Gambaran/iconSkripsi.png"));
        ImageIcon iconTransaksi     = new ImageIcon(getClass().getResource("/Gambaran/Transaksi.png"));
        ImageIcon iconPinjam        = new ImageIcon(getClass().getResource("/Gambaran/Peminjaman.png"));
        ImageIcon iconBalik         = new ImageIcon(getClass().getResource("/Gambaran/Pengembalian.png"));

        MenuItem menuBuku = new MenuItem(null, true, iconBuku, "Data Buku", null);
        MenuItem menuSkripsi = new MenuItem(null, true, iconSkripsi, "Data Skripsi", null);

        MenuItem menuPinjam = new MenuItem(null, true, iconPinjam, "Peminjaman", null);
        MenuItem menuBalik = new MenuItem(null, true, iconBalik, "Pengembalian", null);

        MenuItem menuHome = new MenuItem(iconHome, false, null, "Home", null);
        MenuItem menuData = new MenuItem(iconData, false, null, "Data", null, menuBuku, menuSkripsi );
        MenuItem menuTransaksi = new MenuItem(iconTransaksi, false, null, "Transaksi", null, menuPinjam, menuBalik);
        
        addMenu(menuHome,menuData,menuTransaksi);
        
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pnMenu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }

        }
        pnMenu.revalidate();
    }
}

   
    
