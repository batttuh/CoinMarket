package UI;

import data.models.CoinMarket;
import data.models.Coins;
import data.models.Trader;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
public class UIMenu extends javax.swing.JFrame {

    /**
     * Creates new form UIMenu
     */
    CoinMarket coinMarket=new CoinMarket();
    
    
    public UIMenu() {
        initComponents();
        MarketPanel.setVisible(true);
        All.setVisible(true);      
        WalletPanel.setVisible(false);
        TransferPanel.setVisible(false);
        creatingTable();
        transferMessage.setVisible(false);
        jTable1.setBackground(new Color(0,0,0,50));
        jScrollPane1.setBackground(new Color(0,0,0,50));
        Map<String,Integer> coinsTable=CoinMarket.trader.getSpotWallet();
        for(Map.Entry<String, Integer> entry : coinsTable.entrySet()){
            transferCoinsBox.addItem(entry.getKey());
        }
        transferMessage.setVisible(false);    
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
        jPanel3 = new javax.swing.JPanel();
        MarketPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        All = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        WalletPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        TransferPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        coinAmount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        walletAdress = new javax.swing.JTextField();
        verifyTransaction = new javax.swing.JButton();
        transferMessage = new javax.swing.JLabel();
        transferCoinsBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(150, 200));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        MarketPanel.setBackground(new java.awt.Color(67, 78, 81));
        MarketPanel.setForeground(new java.awt.Color(153, 153, 153));
        MarketPanel.setOpaque(false);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.CardLayout());

        All.setOpaque(false);

        jScrollPane1.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Price", "24h change", "24h volume", "Market Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout AllLayout = new javax.swing.GroupLayout(All);
        All.setLayout(AllLayout);
        AllLayout.setHorizontalGroup(
            AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        AllLayout.setVerticalGroup(
            AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AllLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        jPanel2.add(All, "card2");

        jLabel16.setFont(new java.awt.Font("Arial", 2, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(246, 255, 6));
        jLabel16.setText("All Coins");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MarketPanelLayout = new javax.swing.GroupLayout(MarketPanel);
        MarketPanel.setLayout(MarketPanelLayout);
        MarketPanelLayout.setHorizontalGroup(
            MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MarketPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
            .addGroup(MarketPanelLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel16)
                .addContainerGap(451, Short.MAX_VALUE))
            .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MarketPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        MarketPanelLayout.setVerticalGroup(
            MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarketPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel16)
                .addGap(2, 2, 2)
                .addComponent(jButton3)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MarketPanelLayout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.add(MarketPanel);

        WalletPanel.setBackground(new java.awt.Color(67, 78, 81));
        WalletPanel.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(246, 255, 0));
        jLabel12.setText("Fiat and Spot balance");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(12, 242, 3));
        jLabel13.setText("151.511");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(246, 255, 0));
        jLabel14.setText("Spot balance");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(12, 242, 3));
        jLabel15.setText("150.120");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(246, 255, 0));
        jLabel20.setText("Fiat Balance");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(12, 242, 3));
        jLabel21.setText("51.515");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Amount", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton2.setBackground(new java.awt.Color(243, 210, 80));
        jButton2.setText("Deposit Money");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WalletPanelLayout = new javax.swing.GroupLayout(WalletPanel);
        WalletPanel.setLayout(WalletPanelLayout);
        WalletPanelLayout.setHorizontalGroup(
            WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WalletPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WalletPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(354, 354, 354)
                        .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addGap(132, 132, 132))
                    .addGroup(WalletPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(WalletPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35))))
        );
        WalletPanelLayout.setVerticalGroup(
            WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WalletPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.add(WalletPanel);

        TransferPanel.setBackground(new java.awt.Color(67, 78, 81));
        TransferPanel.setOpaque(false);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wallet.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/876784.png"))); // NOI18N

        coinAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        coinAmount.setText("Coin amount");
        coinAmount.setToolTipText("");
        coinAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_364496.png"))); // NOI18N

        walletAdress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        walletAdress.setText("Wallet Adress");
        walletAdress.setToolTipText("");
        walletAdress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        verifyTransaction.setBackground(new java.awt.Color(243, 210, 80));
        verifyTransaction.setText("Verify");
        verifyTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyTransactionActionPerformed(evt);
            }
        });

        transferMessage.setBackground(new java.awt.Color(0, 0, 0));
        transferMessage.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        transferMessage.setText("Transfer is succesfull");

        transferCoinsBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferCoinsBoxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TransferPanelLayout = new javax.swing.GroupLayout(TransferPanel);
        TransferPanel.setLayout(TransferPanelLayout);
        TransferPanelLayout.setHorizontalGroup(
            TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransferPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transferMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jLabel23)
                .addGap(110, 110, 110))
            .addGroup(TransferPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coinAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transferCoinsBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransferPanelLayout.createSequentialGroup()
                        .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verifyTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(396, 396, 396))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransferPanelLayout.createSequentialGroup()
                        .addComponent(walletAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        TransferPanelLayout.setVerticalGroup(
            TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferPanelLayout.createSequentialGroup()
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransferPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransferPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transferCoinsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coinAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(walletAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(verifyTransaction)
                .addGap(18, 18, 18)
                .addComponent(transferMessage)
                .addGap(25, 25, 25))
        );

        jPanel3.add(TransferPanel);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 69, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 2, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(246, 255, 0));
        jLabel11.setText("COİN MARKET");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 16, -1, -1));

        jLabel10.setText("----------------------");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 332, -1, -1));

        jLabel8.setText("----------------------");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, -1, -1));

        jLabel7.setText("----------------------");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 255, 0));
        jLabel4.setText("Wallet");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 359, -1, -1));

        jLabel5.setText("----------------------");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, -1, -1));

        jLabel6.setText("----------------------");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 394, -1, -1));

        jLabel9.setText("----------------------");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 255, 0));
        jLabel3.setText("Transfer");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 233, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(246, 255, 0));
        jLabel2.setText("Market");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, -1, -1));

        jLabel1.setForeground(new java.awt.Color(246, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4970774.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1043, 6, -1, 51));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2021-12-24 at 16.39.59.jpeg"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
       
        All.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        UIDashBord uıBord=new UIDashBord();
        uıBord.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        MarketPanel.setVisible(true);
        WalletPanel.setVisible(false);
        TransferPanel.setVisible(false);
         
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         
        MarketPanel.setVisible(false);
        WalletPanel.setVisible(true);
        TransferPanel.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        TransferPanel.setVisible(true);
        MarketPanel.setVisible(false);
        WalletPanel.setVisible(false);
        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UIDepositMoney uıDepositMoney=new UIDepositMoney();
        uıDepositMoney.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        creatingTable();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        int selectedRowIndex=jTable1.getSelectedRow();
        UICoinBuy uıCoinBuy=new UICoinBuy(model.getValueAt(selectedRowIndex, 0).toString(),Double.parseDouble(model.getValueAt(selectedRowIndex, 1).toString()));
        uıCoinBuy.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void verifyTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyTransactionActionPerformed
        // TODO add your handling code here:
     
        transferMessage.setVisible(true);
       try{
            if(CoinMarket.trader.getSpotWallet().get(transferCoinsBox.getSelectedItem().toString())>=Integer.parseInt(coinAmount.getText())){
            if(CoinMarket.trader.sendCoin(transferCoinsBox.getSelectedItem().toString(), Integer.parseInt(coinAmount.getText()), walletAdress.getText())){
                transferMessage.setText("Transfer is succesfull");
                transferMessage.setForeground(Color.green);
            }else{
                transferMessage.setText("Wrong transfer adress");
                 transferMessage.setForeground(Color.red);
            }
        }else{
            transferMessage.setText("Not enough available coin");
            transferMessage.setForeground(Color.red);
        }
       }catch(Exception e){
           transferMessage.setText("Invalid arguments");
            transferMessage.setForeground(Color.red);
       }
               
           
        
        
        
        
        

    }//GEN-LAST:event_verifyTransactionActionPerformed

    private void transferCoinsBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferCoinsBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_transferCoinsBoxMouseClicked
    private void creatingTable(){
        Map<String,Coins> coinsTable=new HashMap<String, Coins>();
        DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();    
        model1.setRowCount(0);
        CoinMarket coinMarket=new CoinMarket();
        coinMarket.refreshCoins();
        coinsTable=coinMarket.getPrices();
        for(Map.Entry<String, Coins> entry : coinsTable.entrySet()) {
        String key = entry.getKey();
        Coins coins = entry.getValue();
        model1.addRow(new Object[]{key,coins.getPrice(),coins.getChanges(),coins.getVolume(),coins.getCapacity()});
    
    }

    }
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
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel All;
    private javax.swing.JPanel MarketPanel;
    private javax.swing.JPanel TransferPanel;
    private javax.swing.JPanel WalletPanel;
    private javax.swing.JTextField coinAmount;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    public static javax.swing.JComboBox<String> transferCoinsBox;
    private javax.swing.JLabel transferMessage;
    private javax.swing.JButton verifyTransaction;
    private javax.swing.JTextField walletAdress;
    // End of variables declaration//GEN-END:variables
}
