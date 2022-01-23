/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Customer;

import Controller.CustomerController;
import Model.Customer;
import View.Admin.Customer.KM;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author RojeruSan
 */
public class pnlKhachHang extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    
    ArrayList<Customer> list = new ArrayList<>();
    int id = Integer.valueOf(CustomerController.getList().get(CustomerController.getList().size()-1).getIdCustomer());
    
    public pnlKhachHang() {
        initComponents();
        HienThi();
        ViewTT.setVisible(false);
    }
    
    public void HienThi(){
        txtidCustomer.setText(String.valueOf(id+1));
        list = CustomerController.getList();
        DefaultTableModel model = (DefaultTableModel) TableKhachHang.getModel();
        model.setRowCount(0);
        for (Customer cs : list) {
            Object[] obj_model = new Object[]{cs.getIdCustomer(),cs.getFullName(),cs.getNumberPhone(),cs.getCustomerType(),cs.getMoney(),cs.getDate()
            };
            model.addRow(obj_model);
        }
    }
    
    public boolean ExamIput(){
        boolean kt = true;
        if (txtphone.getText().equals("") || txtFullName.getText().equals("")){
            kt = false;
        }
        if (moi.isSelected()== false && bac.isSelected() == false && dong.isSelected() == false && vang.isSelected() == false) {
            kt = false;
        }
         return kt;
    }    
    public void reset(){
        txtFullName.setText("");
        txtphone.setText("");
        moi.setSelected(false);
        dong.setSelected(false);
        bac.setSelected(false);
        vang.setSelected(false);
        txtChiTieu.setText("0.0");
        txtidCustomer.setText(String.valueOf(id+1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        refresh1 = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        addKhachHang = new rsbuttom.RSButtonMetro();
        editKhachHang = new rsbuttom.RSButtonMetro();
        deleteKhachHang = new rsbuttom.RSButtonMetro();
        searchKhachHang = new rsbuttom.RSButtonMetro();
        refresh = new rsbuttom.RSButtonMetro();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableKhachHang = new javax.swing.JTable();
        ViewTT = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtidCustomer = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtChiTieu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        moi = new javax.swing.JRadioButton();
        dong = new javax.swing.JRadioButton();
        bac = new javax.swing.JRadioButton();
        vang = new javax.swing.JRadioButton();
        off = new javax.swing.JButton();
        Canel = new javax.swing.JButton();
        TypeCustomer = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(252, 182, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/staff1.png"))); // NOI18N
        jLabel1.setText("Khách Hàng");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        refresh1.setBackground(new java.awt.Color(255, 153, 0));
        refresh1.setForeground(new java.awt.Color(255, 255, 255));
        refresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Price list.png"))); // NOI18N
        refresh1.setText("Giá Khuyên mãi");
        refresh1.setColorHover(new java.awt.Color(255, 153, 0));
        refresh1.setColorNormal(new java.awt.Color(252, 182, 6));
        refresh1.setColorPressed(new java.awt.Color(252, 182, 6));
        refresh1.setColorTextNormal(new java.awt.Color(255, 153, 0));
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        addKhachHang.setBackground(new java.awt.Color(252, 182, 6));
        addKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        addKhachHang.setText("THÊM MỚI");
        addKhachHang.setColorHover(new java.awt.Color(255, 153, 0));
        addKhachHang.setColorNormal(new java.awt.Color(252, 182, 6));
        addKhachHang.setColorPressed(new java.awt.Color(252, 182, 6));
        addKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKhachHangActionPerformed(evt);
            }
        });

        editKhachHang.setBackground(new java.awt.Color(252, 182, 6));
        editKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon.png"))); // NOI18N
        editKhachHang.setText("CHỈNH SỬA");
        editKhachHang.setColorHover(new java.awt.Color(255, 153, 0));
        editKhachHang.setColorNormal(new java.awt.Color(252, 182, 6));
        editKhachHang.setColorPressed(new java.awt.Color(252, 182, 6));
        editKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editKhachHangActionPerformed(evt);
            }
        });

        deleteKhachHang.setBackground(new java.awt.Color(252, 182, 6));
        deleteKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/del_2.png"))); // NOI18N
        deleteKhachHang.setText("XOÁ");
        deleteKhachHang.setColorHover(new java.awt.Color(255, 153, 0));
        deleteKhachHang.setColorNormal(new java.awt.Color(252, 182, 6));
        deleteKhachHang.setColorPressed(new java.awt.Color(252, 182, 6));
        deleteKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteKhachHangActionPerformed(evt);
            }
        });

        searchKhachHang.setBackground(new java.awt.Color(252, 182, 6));
        searchKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon.png"))); // NOI18N
        searchKhachHang.setText("TÌM KIẾM");
        searchKhachHang.setColorHover(new java.awt.Color(255, 153, 0));
        searchKhachHang.setColorNormal(new java.awt.Color(252, 182, 6));
        searchKhachHang.setColorPressed(new java.awt.Color(252, 182, 6));
        searchKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchKhachHangActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh.png"))); // NOI18N
        refresh.setText("LÀM MỚI");
        refresh.setColorHover(new java.awt.Color(255, 153, 0));
        refresh.setColorNormal(new java.awt.Color(252, 182, 6));
        refresh.setColorPressed(new java.awt.Color(252, 182, 6));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(252, 182, 6));

        TableKhachHang.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TableKhachHang.setForeground(new java.awt.Color(43, 121, 150));
        TableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Họ Và Tên", "Số điện thoại", "Loại khách Hàng", "Chi Tiêu", "Ngày Tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableKhachHang.setGridColor(new java.awt.Color(43, 121, 150));
        TableKhachHang.setSelectionBackground(new java.awt.Color(37, 150, 190));
        TableKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKhachHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableKhachHang);
        if (TableKhachHang.getColumnModel().getColumnCount() > 0) {
            TableKhachHang.getColumnModel().getColumn(0).setMaxWidth(50);
            TableKhachHang.getColumnModel().getColumn(1).setMaxWidth(200);
            TableKhachHang.getColumnModel().getColumn(2).setMaxWidth(150);
            TableKhachHang.getColumnModel().getColumn(3).setMaxWidth(100);
            TableKhachHang.getColumnModel().getColumn(4).setMaxWidth(100);
            TableKhachHang.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        ViewTT.setBackground(new java.awt.Color(255, 255, 204));

        Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(43, 121, 150));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 121, 150));
        jLabel3.setText("Mã Khách Hàng");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 121, 150));
        jLabel4.setText("Họ Và Tên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 121, 150));
        jLabel5.setText("Số Điện Thoại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 121, 150));
        jLabel6.setText("Loại Khách Hàng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 121, 150));
        jLabel7.setText("Chi Tiêu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 121, 150));
        jLabel8.setText("Ngày đăng kí");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("VNĐ");

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        type.add(moi);
        moi.setText("New");

        type.add(dong);
        dong.setText("Bronze");

        type.add(bac);
        bac.setText("Silver");

        type.add(vang);
        vang.setText("Gold");

        off.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        off.setText("...");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        Canel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Canel.setText("Thoát");
        Canel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ViewTTLayout = new javax.swing.GroupLayout(ViewTT);
        ViewTT.setLayout(ViewTTLayout);
        ViewTTLayout.setHorizontalGroup(
            ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTTLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(off)
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTTLayout.createSequentialGroup()
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Canel))
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTTLayout.createSequentialGroup()
                                .addComponent(txtChiTieu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(ViewTTLayout.createSequentialGroup()
                                .addComponent(bac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dong))
                            .addGroup(ViewTTLayout.createSequentialGroup()
                                .addComponent(moi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vang))
                            .addComponent(txtFullName)
                            .addComponent(txtidCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtphone))))
                .addGap(36, 36, 36))
        );
        ViewTTLayout.setVerticalGroup(
            ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTTLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Title)
                .addGap(34, 34, 34)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moi)
                    .addComponent(vang)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dong)
                    .addComponent(bac))
                .addGap(21, 21, 21)
                .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewTTLayout.createSequentialGroup()
                        .addGroup(ViewTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChiTieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(off)
                .addGap(18, 18, 18)
                .addComponent(Canel)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        TypeCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TypeCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "New", "Bronze", "Silver", "Gold" }));
        TypeCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TypeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TypeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void addKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKhachHangActionPerformed
        reset();
        moi.setSelected(true);
        txtChiTieu.setText("0.0");
        txtDate.setText(String.valueOf(LocalDate.now()));
        ViewTT.setVisible(true);
        Title.setText("Điền Thông Tin Khách Hàng");
        off.setVisible(true);
        off.setText("Đăng Kí");
        
    }//GEN-LAST:event_addKhachHangActionPerformed

    private void editKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editKhachHangActionPerformed
        String phone = JOptionPane.showInputDialog("Nhập số điện thoại");
        Customer cs = CustomerController.searchCustomer(phone);
        if (cs!= null) {
            txtidCustomer.setText(cs.getIdCustomer());
        txtFullName.setText(cs.getFullName());
        txtphone.setText(cs.getNumberPhone());
        txtChiTieu.setText(String.valueOf(cs.getMoney()));
        txtDate.setText(cs.getDate());
        if (cs.getCustomerType().equals("New")) {
            moi.setSelected(true);
        }else if(cs.getCustomerType().toString().equals("Broze")){
            dong.setSelected(true);
        }else if(cs.getCustomerType().toString().equals("Silver")){
            bac.setSelected(true);
        }else{
            vang.setSelected(true);
        }
        ViewTT.setVisible(true);
        off.setVisible(true);
        Title.setText("Điền Thông Tin Khách Hàng");
        off.setText("Sửa");
        }else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng!");
        }

    }//GEN-LAST:event_editKhachHangActionPerformed

    private void deleteKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteKhachHangActionPerformed

        String idCustomer = (String) TableKhachHang.getValueAt(TableKhachHang.getSelectedRow(), 0);
        if (JOptionPane.showConfirmDialog(this, "Bạn muốn xoá khách hàng không ?","Confirm",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            int kq = CustomerController.deleteCustomer(idCustomer);
            if (kq > 0) {
                HienThi();
            }else{
                JOptionPane.showMessageDialog(this, "Xoá khách hàng lỗi!");
                HienThi();
            }
        }
    }//GEN-LAST:event_deleteKhachHangActionPerformed

    private void searchKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchKhachHangActionPerformed

        String phone = JOptionPane.showInputDialog("Nhập số điện thoại");
        Customer cs = CustomerController.searchCustomer(phone);
        if (cs != null) {
            DefaultTableModel model = (DefaultTableModel) TableKhachHang.getModel();
        model.setRowCount(0);
            Object[] obj_model = new Object[]{cs.getIdCustomer(),cs.getFullName(),cs.getNumberPhone(),cs.getCustomerType(),cs.getMoney(),cs.getDate()
            };
            model.addRow(obj_model);
        }else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng!");
                HienThi();
        }
    }//GEN-LAST:event_searchKhachHangActionPerformed

    private void TyPeCustomerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TyPeCustomerItemStateChanged
    }//GEN-LAST:event_TyPeCustomerItemStateChanged

    private void TyPeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TyPeCustomerActionPerformed

    }//GEN-LAST:event_TyPeCustomerActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        TypeCustomer.setSelectedItem("All");
        ViewTT.setVisible(false);
        HienThi();
    }//GEN-LAST:event_refreshActionPerformed

    private void TypeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeCustomerActionPerformed
        String type = (String)TypeCustomer.getSelectedItem();
        if (type.equals("ALL") == false) {
            ArrayList<Customer> list = CustomerController.searchCustomer_type(type);
            DefaultTableModel model = (DefaultTableModel) TableKhachHang.getModel();
            model.setRowCount(0);
            for (Customer cs : list) {
                Object[] obj_model = new Object[]{cs.getIdCustomer(),cs.getFullName(),cs.getNumberPhone(),cs.getCustomerType(),cs.getMoney(),cs.getDate()
                };
                model.addRow(obj_model);
            }
        }
    }//GEN-LAST:event_TypeCustomerActionPerformed

    private void TableKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKhachHangMouseClicked

        ViewTT.setVisible(true);
        Title.setText("Thông Tin Khách Hàng");
        off.setVisible(false);
        Object row[] = new Object[6];
        for (int i = 0; i < 6; i++) {
            row[i] = TableKhachHang.getValueAt(TableKhachHang.getSelectedRow(), i);
        }
        txtidCustomer.setText(row[0].toString());
        txtFullName.setText(row[1].toString());
        txtphone.setText(row[2].toString());
        txtChiTieu.setText(row[4].toString());
        txtDate.setText(row[5].toString());
        if (row[3].toString().equals("New")) {
            moi.setSelected(true);

        }else if(row[3].toString().equals("Bronze")){
            dong.setSelected(true);

        }else if(row[3].toString().equals("Silver")){
            bac.setSelected(true);

        }else{
            vang.setSelected(true);
        }
    }//GEN-LAST:event_TableKhachHangMouseClicked

    private void CanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanelMouseClicked
        reset();
        ViewTT.setVisible(false);

    }//GEN-LAST:event_CanelMouseClicked

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed

        if (off.getText().equals("Đăng Kí")) {
            if (ExamIput() == false) {
                JOptionPane.showMessageDialog(this, "Bạn nhập thiếu thông tin!");
            }else{
                String fullName = txtFullName.getText();
                String phone = txtphone.getText();
                String typeCustomer = null;
                if (moi.isSelected()) {
                    typeCustomer = "New";
                }else if (dong.isSelected()) {
                    typeCustomer = "Bronze";
                }else if (bac.isSelected()) {
                    typeCustomer = "Silver";
                }else{
                    typeCustomer = "Glod";
                }
                int kq = CustomerController.addCustomer(fullName, phone, typeCustomer);
                if (kq > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");
                    HienThi();
                }else{
                    JOptionPane.showMessageDialog(this, "Thêm khách hàng thất bại!");
                    HienThi();
                }
                reset();
                ViewTT.setVisible(false);
            }
        }else{
            if (ExamIput() == false) {
                JOptionPane.showMessageDialog(this, "Bạn nhập thiếu thông tin!");
            }else{
                String idCustomer = txtidCustomer.getText();
                String fullname = txtFullName.getText();
                String phone = txtphone.getText();
                if (CustomerController.updateCustomer(idCustomer, fullname, phone) > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công","Invalidation",JOptionPane.INFORMATION_MESSAGE);
                    HienThi();
                }else{
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại","Invalidation",JOptionPane.ERROR_MESSAGE);
                }
            }
            reset();
        }
    }//GEN-LAST:event_offActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        KM km = new KM();
        km.setVisible(true);
    }//GEN-LAST:event_refresh1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Canel;
    private javax.swing.JTable TableKhachHang;
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox<String> TypeCustomer;
    private javax.swing.JPanel ViewTT;
    private rsbuttom.RSButtonMetro addKhachHang;
    private javax.swing.JRadioButton bac;
    private rsbuttom.RSButtonMetro deleteKhachHang;
    private javax.swing.JRadioButton dong;
    private rsbuttom.RSButtonMetro editKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton moi;
    private javax.swing.JButton off;
    private rsbuttom.RSButtonMetro refresh;
    private rsbuttom.RSButtonMetro refresh1;
    private rsbuttom.RSButtonMetro searchKhachHang;
    private javax.swing.JLabel txtChiTieu;
    private javax.swing.JLabel txtDate;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JLabel txtidCustomer;
    private javax.swing.JTextField txtphone;
    private javax.swing.ButtonGroup type;
    private javax.swing.JRadioButton vang;
    // End of variables declaration//GEN-END:variables
}