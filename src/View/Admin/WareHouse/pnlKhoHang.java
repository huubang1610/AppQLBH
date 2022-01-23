/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.WareHouse;

import Controller.AccountController;
import Controller.ProductController;
import Controller.SupplierController;
import Model.Account;
import Model.Supplier;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RojeruSan
 */
public class pnlKhoHang extends javax.swing.JPanel {

    ArrayList<Supplier> list = new ArrayList<>();
    ArrayList<String> listIdAccount = new ArrayList<>();
    ArrayList<String> listIdProduct = new ArrayList<>();
    String tenTk = "";
    String idTK = "";
   
    int id = Integer.valueOf(SupplierController.getList().get(SupplierController.getList().size()-1).getIdSupplier()) + 1;
    
    public pnlKhoHang() {
//        initComponents();
//        HienThi();
//        ViewTT.setVisible(false);
//        listIdAccount = AccountController.getListId();
//        listIdProduct = ProductController.getListId();
//        for (String idAcc : listIdAccount) {
//            IdAccount.addItem(idAcc);
//        }
//        for (String idPro : listIdProduct) {
//            IdProduct.addItem(idPro);
//        }
//        NameNCC.addItem("All");
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i).getNameSupplier();
//                int count = 0;
//                int [] index = new int[list.size()];
//            for (int j = 0; j < list.size(); j++) {
//                if (s.equals(list.get(j).getNameSupplier())) {
//                    index[count] = j;
//                    count = count+1;
//                }
//            }
//            if (count <= 1) {
//                NameNCC.addItem(s);
//            }else {
//                if (index[0] == i) {
//                    NameNCC.addItem(s);
//                }
//            }
//        }
    }
    
    public pnlKhoHang(Account account) {
        initComponents();
        HienThi();
        ViewTT.setVisible(false);
        listIdAccount = AccountController.getListId();
        listIdProduct = ProductController.getListId();
        for (String idAcc : listIdAccount) {
            IdAccount.addItem(idAcc);
        }
        for (String idPro : listIdProduct) {
            IdProduct.addItem(idPro);
        }
        NameNCC.addItem("All");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getNameSupplier();
                int count = 0;
                int [] index = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                if (s.equals(list.get(j).getNameSupplier())) {
                    index[count] = j;
                    count = count+1;
                }
            }
            if (count <= 1) {
                NameNCC.addItem(s);
            }else {
                if (index[0] == i) {
                    NameNCC.addItem(s);
                }
            }
            tenTk = account.getFullName();
            for (String list : listIdAccount) {
                if (account.getIdUser().equals(list)) {
                    idTK = list;
                }
            }
        }
    }

    public void HienThi(){
        list = SupplierController.getList();
        DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();
        model.setRowCount(0);
        for (Supplier supplier : list) {
            Object[] obj_model = new Object[]{ supplier.getIdSupplier(),supplier.getNameSupplier(),supplier.getNumber(),
                supplier.getPrice(),supplier.getIdUser(),supplier.getIdProduct(),supplier.getCreated_at()
            };
            model.addRow(obj_model);
        }
    }
    public Boolean ExamInput(){
        boolean check = true;
        if (txtName.equals("") || txtPhone.equals("") || txtPrice.equals("")) {
            check = false;
        }
        if (IdAccount.getSelectedItem()== null || IdProduct.getSelectedItem()== null) {
            check = false;
        }
        return check;
    }
    
    public void reset(){
        txtName.setText("");
        txtPhone.setText("");
        txtPrice.setText("");
        txtId.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        addProduct = new rsbuttom.RSButtonMetro();
        editProduct = new rsbuttom.RSButtonMetro();
        deleteProduct = new rsbuttom.RSButtonMetro();
        searchProduct = new rsbuttom.RSButtonMetro();
        NameNCC = new javax.swing.JComboBox<>();
        rSButtonMetro4 = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        ViewTT = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        off = new javax.swing.JButton();
        Canel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        IdAccount = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        IdProduct = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        date_chooser = new com.toedter.calendar.JDateChooser();
        searchDate = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(252, 182, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/warehouse1.png"))); // NOI18N
        jLabel1.setText("KHO HÀNG");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        addProduct.setBackground(new java.awt.Color(252, 182, 6));
        addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        addProduct.setText("THÊM MỚI");
        addProduct.setColorHover(new java.awt.Color(255, 153, 0));
        addProduct.setColorNormal(new java.awt.Color(252, 182, 6));
        addProduct.setColorPressed(new java.awt.Color(252, 182, 6));
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        editProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon.png"))); // NOI18N
        editProduct.setText("CHỈNH SỬA");
        editProduct.setColorHover(new java.awt.Color(255, 153, 0));
        editProduct.setColorNormal(new java.awt.Color(252, 182, 6));
        editProduct.setColorPressed(new java.awt.Color(252, 182, 6));
        editProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductActionPerformed(evt);
            }
        });

        deleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/del_2.png"))); // NOI18N
        deleteProduct.setText("XOÁ");
        deleteProduct.setColorHover(new java.awt.Color(255, 153, 0));
        deleteProduct.setColorNormal(new java.awt.Color(252, 182, 6));
        deleteProduct.setColorPressed(new java.awt.Color(252, 182, 6));
        deleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductActionPerformed(evt);
            }
        });

        searchProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon.png"))); // NOI18N
        searchProduct.setText("Tìm Kiếm");
        searchProduct.setColorHover(new java.awt.Color(255, 153, 0));
        searchProduct.setColorNormal(new java.awt.Color(252, 182, 6));
        searchProduct.setColorPressed(new java.awt.Color(252, 182, 6));
        searchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductActionPerformed(evt);
            }
        });

        NameNCC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameNCC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NameNCCItemStateChanged(evt);
            }
        });
        NameNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameNCCActionPerformed(evt);
            }
        });

        rSButtonMetro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh.png"))); // NOI18N
        rSButtonMetro4.setText("Làm Mới");
        rSButtonMetro4.setColorHover(new java.awt.Color(255, 153, 0));
        rSButtonMetro4.setColorNormal(new java.awt.Color(252, 182, 6));
        rSButtonMetro4.setColorPressed(new java.awt.Color(252, 182, 6));
        rSButtonMetro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(NameNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(252, 182, 6));

        SupplierTable.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SupplierTable.setForeground(new java.awt.Color(43, 121, 150));
        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Nhà Cung Cấp", "Số điện thoại", "Giá Nhập", "Mã Nhân Viên", "Mã Sản Phẩm", "Ngày Nhập Kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierTable.setGridColor(new java.awt.Color(43, 121, 150));
        SupplierTable.setSelectionBackground(new java.awt.Color(37, 150, 190));
        SupplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SupplierTable);
        if (SupplierTable.getColumnModel().getColumnCount() > 0) {
            SupplierTable.getColumnModel().getColumn(0).setMaxWidth(50);
            SupplierTable.getColumnModel().getColumn(1).setMaxWidth(175);
            SupplierTable.getColumnModel().getColumn(2).setMaxWidth(120);
            SupplierTable.getColumnModel().getColumn(3).setMaxWidth(75);
            SupplierTable.getColumnModel().getColumn(4).setMaxWidth(100);
            SupplierTable.getColumnModel().getColumn(5).setMaxWidth(100);
            SupplierTable.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        ViewTT.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(43, 121, 150));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 121, 150));
        jLabel3.setText("Mã Đơn");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 121, 150));
        jLabel4.setText("Nhà Cung Cấp");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 121, 150));
        jLabel5.setText("Số Điện Thoại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 121, 150));
        jLabel7.setText("Giá Nhập");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 121, 150));
        jLabel8.setText("Ngày đăng kí");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("VNĐ");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        off.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        off.setText("...");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        Canel.setBackground(new java.awt.Color(252, 182, 6));
        Canel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Canel.setText("Thoát");
        Canel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanelMouseClicked(evt);
            }
        });
        Canel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanelActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 121, 150));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mã NV");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 121, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Mã SP");

        javax.swing.GroupLayout ViewTTLayout = new javax.swing.GroupLayout(ViewTT);
        ViewTT.setLayout(ViewTTLayout);
        ViewTTLayout.setHorizontalGroup(
            ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTTLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ViewTTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewTTLayout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(53, Short.MAX_VALUE))
                            .addGroup(ViewTTLayout.createSequentialGroup()
                                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ViewTTLayout.createSequentialGroup()
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel9))
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(92, 92, 92)
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(off)
                            .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Canel)
                                .addComponent(IdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IdAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ViewTTLayout.setVerticalGroup(
            ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTTLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(24, 24, 24)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IdAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(off)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Canel)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(ViewTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        date_chooser.setBackground(new java.awt.Color(255, 255, 255));
        date_chooser.setForeground(new java.awt.Color(255, 0, 0));
        date_chooser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date_chooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date_chooserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                date_chooserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                date_chooserMouseExited(evt);
            }
        });

        searchDate.setText("Chọn ngày");
        searchDate.setColorHover(new java.awt.Color(255, 153, 0));
        searchDate.setColorNormal(new java.awt.Color(252, 182, 6));
        searchDate.setColorPressed(new java.awt.Color(252, 182, 6));
        searchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        reset();
        txtId.setText(String.valueOf(id));
        txtPrice.setText("0.0");
        txtDate.setText(String.valueOf(LocalDate.now()));
        ViewTT.setVisible(true);
        Title.setText("Điền Thông Tin Hàng Hoá");
        off.setVisible(true);
        off.setText("Nhập");
        IdAccount.setSelectedItem(idTK);
        
    }//GEN-LAST:event_addProductActionPerformed

    private void editProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductActionPerformed
        String id = JOptionPane.showInputDialog("Mã đơn hàng");
        try {
            Integer.parseInt(id);
            Supplier supplier = SupplierController.searchSupplier(id);
        if (supplier == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy đơn hàng","Invalidation",JOptionPane.ERROR_MESSAGE);
        }else{
        txtId.setText(String.valueOf(supplier.getIdSupplier()));
        txtName.setText(supplier.getNameSupplier());
        txtPhone.setText(supplier.getNumber());
        txtPrice.setText(String.valueOf(supplier.getPrice()));
        IdProduct.setSelectedItem(supplier.getIdProduct());
        IdAccount.setSelectedItem(supplier.getIdUser());
        txtDate.setText(supplier.getCreated_at());
        ViewTT.setVisible(true);
        off.setVisible(true);
        Title.setText("Điền Thông Tin Hàng Hoá");
        off.setText("Sửa");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn phải nhập số","Invalidation",JOptionPane.ERROR_MESSAGE);
        }  
        
    }//GEN-LAST:event_editProductActionPerformed

    private void deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductActionPerformed
            int idSupplier = (int) SupplierTable.getValueAt(SupplierTable.getSelectedRow(), 0);
        if (JOptionPane.showConfirmDialog(this, "Xoá thông tin nhà cung cấp ?","Confirm",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        SupplierController.deleteSupplier(idSupplier);
        HienThi();
        reset();
        ViewTT.setVisible(false);
        }
    }//GEN-LAST:event_deleteProductActionPerformed

    private void searchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductActionPerformed
        String id = JOptionPane.showInputDialog("Nhập mã đơn hàng");
        Supplier supplier = SupplierController.searchSupplier(id);
        if (supplier != null) {
            DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();
            model.setRowCount(0);
            Object[] obj_model = new Object[]{supplier.getIdSupplier(),supplier.getNameSupplier(),supplier.getNumber(),
                supplier.getPrice(),supplier.getIdUser(),supplier.getIdProduct(),supplier.getCreated_at()};
            model.addRow(obj_model);
        }else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm");
            HienThi();
        }
    }//GEN-LAST:event_searchProductActionPerformed

    private void NameNCCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NameNCCItemStateChanged

    }//GEN-LAST:event_NameNCCItemStateChanged

    private void NameNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameNCCActionPerformed
        String Name = (String)NameNCC.getSelectedItem();
        if (Name.equals("All") == false) {
            ArrayList<Supplier> listSuppliers = SupplierController.searchNameSupplier(Name);
        if (listSuppliers.size() > 0) {
            DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();
            model.setRowCount(0);
            for (Supplier supplier : listSuppliers) {
            Object[] obj_model = new Object[]{ supplier.getIdSupplier(),supplier.getNameSupplier(),supplier.getNumber(),
                supplier.getPrice(),supplier.getIdUser(),supplier.getIdProduct(),supplier.getCreated_at()
            };
            model.addRow(obj_model);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy đơn hàng");
            HienThi();
        }
        }
    }//GEN-LAST:event_NameNCCActionPerformed

    private void rSButtonMetro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro4ActionPerformed

        reset();
        ViewTT.setVisible(false);
        HienThi();
    }//GEN-LAST:event_rSButtonMetro4ActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed

        if (off.getText().equals("Nhập")){
            boolean test = ExamInput();
        if (test == false) {
            JOptionPane.showMessageDialog(this, "Bạn đã nhập thiếu thông tin","Invalidation",JOptionPane.ERROR_MESSAGE);
            }
                else{
                    String nameSupplier = txtName.getText();
                    String number = txtPhone.getText();
                    Double price = Double.valueOf(txtPrice.getText());
                    String idProduct = (String)IdProduct.getSelectedItem();
                    String idUser = (String)IdAccount.getSelectedItem();
                    String created_at = String.valueOf(LocalDate.now());
                    Supplier supplier = new Supplier(nameSupplier, number, price, idProduct, idUser, created_at);
                    int kq = SupplierController.AddSupplier(supplier);
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm sản phẩm vào kho hàng!");
                        HienThi();
                    }else{
                        JOptionPane.showMessageDialog(this, "Thêm sản phẩm thất bại!");
                    }

                }
                    reset();
                    ViewTT.setVisible(false);
                    
            }    
        else{
            boolean test = ExamInput();
        if (test == false) {
            JOptionPane.showMessageDialog(this, "Bạn đã nhập thiếu thông tin","Invalidation",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Supplier supplier = new Supplier(txtName.getText(), txtPhone.getText(), Double.valueOf(txtPrice.getText()),(String)IdProduct.getSelectedItem(),(String)IdAccount.getSelectedItem());
            if (SupplierController.updateSupplier(Integer.parseInt(txtId.getText()),supplier) > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công","Invalidation",JOptionPane.INFORMATION_MESSAGE);
                HienThi();
            }else{
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại","Invalidation",JOptionPane.ERROR_MESSAGE);
            }
        }
            reset();
        } 
    }//GEN-LAST:event_offActionPerformed

    private void CanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanelMouseClicked
       

    }//GEN-LAST:event_CanelMouseClicked

    private void CanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanelActionPerformed
            reset();
        ViewTT.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_CanelActionPerformed

    private void date_chooserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date_chooserMouseExited
        
    }//GEN-LAST:event_date_chooserMouseExited

    private void date_chooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date_chooserMouseClicked
        
    }//GEN-LAST:event_date_chooserMouseClicked

    private void date_chooserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date_chooserMouseEntered
        
    }//GEN-LAST:event_date_chooserMouseEntered

    private void searchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDateActionPerformed
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(date_chooser.getDate());
        ArrayList<Supplier> listSuppliers = SupplierController.searchDate(date);
        if (listSuppliers.size() > 0) {
            DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();
            model.setRowCount(0);
            for (Supplier supplier : listSuppliers) {
            Object[] obj_model = new Object[]{ supplier.getIdSupplier(),supplier.getNameSupplier(),supplier.getNumber(),
                supplier.getPrice(),supplier.getIdUser(),supplier.getIdProduct(),supplier.getCreated_at()
            };
            model.addRow(obj_model);
        }
        }else{
            DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_searchDateActionPerformed

    private void SupplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTableMouseClicked
        Object row[] = new Object[7];
        for (int i = 0; i < 7; i++) {
            row[i] = SupplierTable.getValueAt(SupplierTable.getSelectedRow(), i);
        }
        txtId.setText(row[0].toString());
        txtName.setText(row[1].toString());
        txtPhone.setText(row[2].toString());
        txtPrice.setText(row[3].toString());
        IdProduct.setSelectedItem(row[5]);
        IdAccount.setSelectedItem(idTK);
        txtDate.setText(row[6].toString());
        ViewTT.setVisible(true);
        off.setVisible(false);
    }//GEN-LAST:event_SupplierTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Canel;
    private javax.swing.JComboBox<String> IdAccount;
    private javax.swing.JComboBox<String> IdProduct;
    private javax.swing.JComboBox<String> NameNCC;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel ViewTT;
    private rsbuttom.RSButtonMetro addProduct;
    private com.toedter.calendar.JDateChooser date_chooser;
    private rsbuttom.RSButtonMetro deleteProduct;
    private rsbuttom.RSButtonMetro editProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton off;
    private rsbuttom.RSButtonMetro rSButtonMetro4;
    private rsbuttom.RSButtonMetro searchDate;
    private rsbuttom.RSButtonMetro searchProduct;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
