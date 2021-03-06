/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Account;
import java.awt.Color;
import java.awt.Image;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

/**
 *
 * @author Dell G3
 */
public class HomeAdmin extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdmin
     */
    Account a = null;
    
    public HomeAdmin(){
       initComponents();
        this.setLocationRelativeTo(this);
        this.sanpham.setSelected(true);
        new CambiaPanel(pnlContent, new View.SanPham.pnlSanPham());
        
        new Thread(){
            public void run(){
                while (true) {                    
                    Calendar ca = new GregorianCalendar();
                    int hour = ca.get(Calendar.HOUR);
                    int minute = ca.get(Calendar.MINUTE);
                    int second = ca.get(Calendar.SECOND);
                    int AM_PM = ca.get(Calendar.AM_PM);
                    
                    String day_night;
                    
                    if (AM_PM == 1) {
                       day_night = "PM"; 
                    }else{
                        day_night = "AM";
                    }
                    String time = hour+":"+minute+":"+second+" "+day_night;
                    labelClock.setText(time);
                }
            }
        }.start();
    }
    
    public HomeAdmin(Account account) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.sanpham.setSelected(true);
        new CambiaPanel(pnlContent, new View.SanPham.pnlSanPham());
        CaNhan.setText(account.getFullName()+"-"+account.getPosition().toUpperCase());
        a = new Account(account.getIdUser(),account.getUserName(),account.getPassWord(),account.getFullName(),account.getPosition(),account.getAge(),account.getEmail(),
        account.getAvatar(),account.getCccd(),account.getAddress(),account.getDate(),account.getSex());
        if(account.getAvatar() != null){
        byte[] img =account.getAvatar();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(Img.getWidth(), Img.getHeight(), Image.SCALE_SMOOTH));
        Img.setIcon(imageIcon);
        new Thread(){
            public void run(){
                while (true) {                    
                    Calendar ca = new GregorianCalendar();
                    int hour = ca.get(Calendar.HOUR);
                    int minute = ca.get(Calendar.MINUTE);
                    int second = ca.get(Calendar.SECOND);
                    int AM_PM = ca.get(Calendar.AM_PM);
                    
                    String day_night;
                    
                    if (AM_PM == 1) {
                       day_night = "PM"; 
                    }else{
                        day_night = "AM";
                    }
                    String time = hour+":"+minute+":"+second+" "+day_night;
                    labelClock.setText(time);
                }
            }
        }.start();
        }else{
            new Thread(){
            public void run(){
                while (true) {                    
                    Calendar ca = new GregorianCalendar();
                    int hour = ca.get(Calendar.HOUR);
                    int minute = ca.get(Calendar.MINUTE);
                    int second = ca.get(Calendar.SECOND);
                    int AM_PM = ca.get(Calendar.AM_PM);
                    
                    String day_night;
                    
                    if (AM_PM == 1) {
                       day_night = "PM"; 
                    }else{
                        day_night = "AM";
                    }
                    String time = hour+":"+minute+":"+second+" "+day_night;
                    labelClock.setText(time);
                }
            }
        }.start();
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        btnMenu = new rsbuttom.RSButtonMetro();
        labelClock = new javax.swing.JLabel();
        CaNhan = new javax.swing.JLabel();
        LogOut = new rsbuttom.RSButtonMetro();
        ptnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Img = new javax.swing.JLabel();
        sanpham = new rsbuttom.RSButtonMetro();
        thongke = new rsbuttom.RSButtonMetro();
        khachhang = new rsbuttom.RSButtonMetro();
        nhanvien = new rsbuttom.RSButtonMetro();
        hoadon = new rsbuttom.RSButtonMetro();
        khohang = new rsbuttom.RSButtonMetro();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(252, 182, 6));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu.png"))); // NOI18N
        btnMenu.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenu.setColorHover(new java.awt.Color(255, 153, 0));
        btnMenu.setColorNormal(new java.awt.Color(252, 182, 6));
        btnMenu.setColorPressed(new java.awt.Color(252, 182, 6));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        labelClock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelClock.setForeground(new java.awt.Color(255, 255, 255));
        labelClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClock.setText("00:00:00 AM");
        labelClock.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelClockAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        CaNhan.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        CaNhan.setForeground(new java.awt.Color(255, 255, 255));
        CaNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CaNhan.setText("Hi???n th??? th??ng tin c?? nh??n");
        CaNhan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LogOut.setBackground(new java.awt.Color(252, 182, 6));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout1cm.png"))); // NOI18N
        LogOut.setText("????ng Xu???t");
        LogOut.setColorHover(new java.awt.Color(255, 153, 0));
        LogOut.setColorNormal(new java.awt.Color(252, 182, 6));
        LogOut.setColorPressed(new java.awt.Color(252, 182, 6));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(CaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(labelClock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(labelClock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 60));

        ptnMenu.setBackground(new java.awt.Color(252, 182, 6));
        ptnMenu.setAutoscrolls(true);

        jPanel4.setBackground(new java.awt.Color(252, 182, 6));
        jPanel4.setAutoscrolls(true);

        Img.setBackground(new java.awt.Color(252, 182, 6));
        Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BMP-File-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );

        sanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/prd_1.png"))); // NOI18N
        sanpham.setText("S???N PH???M");
        sanpham.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sanpham.setColorHover(new java.awt.Color(255, 153, 0));
        sanpham.setColorNormal(new java.awt.Color(252, 182, 6));
        sanpham.setColorPressed(new java.awt.Color(252, 182, 6));
        sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sanphamMousePressed(evt);
            }
        });
        sanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanphamActionPerformed(evt);
            }
        });

        thongke.setBackground(new java.awt.Color(252, 182, 6));
        thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tk.png"))); // NOI18N
        thongke.setText("TH???NG K??");
        thongke.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        thongke.setColorHover(new java.awt.Color(255, 153, 0));
        thongke.setColorNormal(new java.awt.Color(252, 182, 6));
        thongke.setColorPressed(new java.awt.Color(252, 182, 6));
        thongke.setFocusTraversalPolicyProvider(true);
        thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thongkeMousePressed(evt);
            }
        });
        thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkeActionPerformed(evt);
            }
        });

        khachhang.setBackground(new java.awt.Color(252, 182, 6));
        khachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/staff1.png"))); // NOI18N
        khachhang.setText("KH??CH H??NG");
        khachhang.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        khachhang.setColorHover(new java.awt.Color(255, 153, 0));
        khachhang.setColorNormal(new java.awt.Color(252, 182, 6));
        khachhang.setColorPressed(new java.awt.Color(252, 182, 6));
        khachhang.setFocusTraversalPolicyProvider(true);
        khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khachhangMousePressed(evt);
            }
        });
        khachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khachhangActionPerformed(evt);
            }
        });

        nhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/staff.png"))); // NOI18N
        nhanvien.setText("NH??N VI??N");
        nhanvien.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nhanvien.setColorHover(new java.awt.Color(255, 153, 0));
        nhanvien.setColorNormal(new java.awt.Color(252, 182, 6));
        nhanvien.setColorPressed(new java.awt.Color(252, 182, 6));
        nhanvien.setFocusTraversalPolicyProvider(true);
        nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nhanvienMousePressed(evt);
            }
        });
        nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanvienActionPerformed(evt);
            }
        });

        hoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill1_1.png"))); // NOI18N
        hoadon.setText("HO?? ????N");
        hoadon.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hoadon.setColorHover(new java.awt.Color(255, 153, 0));
        hoadon.setColorNormal(new java.awt.Color(252, 182, 6));
        hoadon.setColorPressed(new java.awt.Color(252, 182, 6));
        hoadon.setFocusTraversalPolicyProvider(true);
        hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hoadonMousePressed(evt);
            }
        });
        hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoadonActionPerformed(evt);
            }
        });

        khohang.setBackground(new java.awt.Color(252, 182, 6));
        khohang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/warehouse1.png"))); // NOI18N
        khohang.setText("KHO H??NG");
        khohang.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        khohang.setColorHover(new java.awt.Color(255, 153, 0));
        khohang.setColorNormal(new java.awt.Color(252, 182, 6));
        khohang.setColorPressed(new java.awt.Color(252, 182, 6));
        khohang.setFocusTraversalPolicyProvider(true);
        khohang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khohangMousePressed(evt);
            }
        });
        khohang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khohangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ptnMenuLayout = new javax.swing.GroupLayout(ptnMenu);
        ptnMenu.setLayout(ptnMenuLayout);
        ptnMenuLayout.setHorizontalGroup(
            ptnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sanpham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(thongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ptnMenuLayout.createSequentialGroup()
                .addGroup(ptnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khohang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ptnMenuLayout.setVerticalGroup(
            ptnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptnMenuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khohang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(ptnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 740));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 1120, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanvienActionPerformed
        if(this.nhanvien.isSelected()){
            new CambiaPanel(pnlContent, new View.Account.pnlNhanVien());
            this.nhanvien.setColorNormal(new Color(255,153,0));
            this.nhanvien.setColorHover(new Color(252,182,6));
            this.nhanvien.setColorPressed(new Color(255,153,0));
            
            this.sanpham.setColorNormal(new Color(252,182,6));
            this.sanpham.setColorHover(new Color(252,182,6));
            this.sanpham.setColorPressed(new Color(252,182,6));
            
            this.khachhang.setColorNormal(new Color(252,182,6));
            this.khachhang.setColorHover(new Color(252,182,6));
            this.khachhang.setColorPressed(new Color(252,182,6));
            
            this.hoadon.setColorNormal(new Color(252,182,6));
            this.hoadon.setColorHover(new Color(252,182,6));
            this.hoadon.setColorPressed(new Color(252,182,6));
            
            this.khohang.setColorNormal(new Color(252,182,6));
            this.khohang.setColorHover(new Color(252,182,6));
            this.khohang.setColorPressed(new Color(252,182,6));
            
            this.thongke.setColorNormal(new Color(252,182,6));
            this.thongke.setColorHover(new Color(252,182,6));
            this.thongke.setColorPressed(new Color(252,182,6));
            
        }else{
            this.nhanvien.setColorNormal(new Color(252,182,6));
            this.nhanvien.setColorHover(new Color(252,182,6));
            this.nhanvien.setColorPressed(new Color(252,182,6));
        }
    }//GEN-LAST:event_nhanvienActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

    }//GEN-LAST:event_btnMenuActionPerformed

    private void khachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khachhangActionPerformed
        if(this.khachhang.isSelected()){
            new CambiaPanel(pnlContent, new View.Customer.pnlKhachHang());
            
            this.khachhang.setColorNormal(new Color(255,153,0));
            this.khachhang.setColorHover(new Color(252,182,6));
            this.khachhang.setColorPressed(new Color(255,153,0));
            
            this.sanpham.setColorNormal(new Color(252,182,6));
            this.sanpham.setColorHover(new Color(252,182,6));
            this.sanpham.setColorPressed(new Color(252,182,6));
            
            this.nhanvien.setColorNormal(new Color(252,182,6));
            this.nhanvien.setColorHover(new Color(252,182,6));
            this.nhanvien.setColorPressed(new Color(252,182,6));
            
            this.hoadon.setColorNormal(new Color(252,182,6));
            this.hoadon.setColorHover(new Color(252,182,6));
            this.hoadon.setColorPressed(new Color(252,182,6));
            
            this.khohang.setColorNormal(new Color(252,182,6));
            this.khohang.setColorHover(new Color(252,182,6));
            this.khohang.setColorPressed(new Color(252,182,6));
            
            this.thongke.setColorNormal(new Color(252,182,6));
            this.thongke.setColorHover(new Color(252,182,6));
            this.thongke.setColorPressed(new Color(252,182,6));
            
        }else{
            this.khachhang.setColorNormal(new Color(252,182,6));
            this.khachhang.setColorHover(new Color(252,182,6));
            this.khachhang.setColorPressed(new Color(252,182,6));
        }
    }//GEN-LAST:event_khachhangActionPerformed

    private void sanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanphamActionPerformed
        if(this.sanpham.isSelected()){
            new CambiaPanel(pnlContent, new View.SanPham.pnlSanPham());
            
            this.sanpham.setColorNormal(new Color(255,153,0));
            this.sanpham.setColorHover(new Color(252,182,6));
            this.sanpham.setColorPressed(new Color(255,153,0));
            
            this.khachhang.setColorNormal(new Color(252,182,6));
            this.khachhang.setColorHover(new Color(252,182,6));
            this.khachhang.setColorPressed(new Color(252,182,6));
            
            this.nhanvien.setColorNormal(new Color(252,182,6));
            this.nhanvien.setColorHover(new Color(252,182,6));
            this.nhanvien.setColorPressed(new Color(252,182,6));
            
            this.hoadon.setColorNormal(new Color(252,182,6));
            this.hoadon.setColorHover(new Color(252,182,6));
            this.hoadon.setColorPressed(new Color(252,182,6));
            
            this.khohang.setColorNormal(new Color(252,182,6));
            this.khohang.setColorHover(new Color(252,182,6));
            this.khohang.setColorPressed(new Color(252,182,6));
            
            this.thongke.setColorNormal(new Color(252,182,6));
            this.thongke.setColorHover(new Color(252,182,6));
            this.thongke.setColorPressed(new Color(252,182,6));
            
        }else{
            this.sanpham.setColorNormal(new Color(252,182,6));
            this.sanpham.setColorHover(new Color(252,182,6));
            this.sanpham.setColorPressed(new Color(252,182,6));
        }
    }//GEN-LAST:event_sanphamActionPerformed

    private void sanphamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanphamMousePressed
        this.sanpham.setSelected(true);
        this.khachhang.setSelected(false);
        this.nhanvien.setSelected(false);
        this.hoadon.setSelected(false);
        this.khohang.setSelected(false);
        this.thongke.setSelected(false);
    }//GEN-LAST:event_sanphamMousePressed

    private void khachhangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachhangMousePressed
        this.sanpham.setSelected(false);
        this.khachhang.setSelected(true);
        this.nhanvien.setSelected(false);
        this.hoadon.setSelected(false);
        this.khohang.setSelected(false);
        this.thongke.setSelected(false);
    }//GEN-LAST:event_khachhangMousePressed

    private void nhanvienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanvienMousePressed
        this.sanpham.setSelected(false);
        this.khachhang.setSelected(false);
        this.nhanvien.setSelected(true);
        this.hoadon.setSelected(false);
        this.khohang.setSelected(false);
        this.thongke.setSelected(false);
    }//GEN-LAST:event_nhanvienMousePressed

    private void hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoadonActionPerformed
        if(this.hoadon.isSelected()){
            new CambiaPanel(pnlContent, new View.Order.pnlHoaDon(a));
            this.hoadon.setColorNormal(new Color(255,153,0));
            this.hoadon.setColorHover(new Color(252,182,6));
            this.hoadon.setColorPressed(new Color(255,153,0));
            
            this.khachhang.setColorNormal(new Color(252,182,6));
            this.khachhang.setColorHover(new Color(252,182,6));
            this.khachhang.setColorPressed(new Color(252,182,6));
            
            this.nhanvien.setColorNormal(new Color(252,182,6));
            this.nhanvien.setColorHover(new Color(252,182,6));
            this.nhanvien.setColorPressed(new Color(252,182,6));
            
            this.sanpham.setColorNormal(new Color(252,182,6));
            this.sanpham.setColorHover(new Color(252,182,6));
            this.sanpham.setColorPressed(new Color(252,182,6));
            
            this.khohang.setColorNormal(new Color(252,182,6));
            this.khohang.setColorHover(new Color(252,182,6));
            this.khohang.setColorPressed(new Color(252,182,6));
            
            this.thongke.setColorNormal(new Color(252,182,6));
            this.thongke.setColorHover(new Color(252,182,6));
            this.thongke.setColorPressed(new Color(252,182,6));
            
        }else{
            this.hoadon.setColorNormal(new Color(252,182,6));
            this.hoadon.setColorHover(new Color(252,182,6));
            this.hoadon.setColorPressed(new Color(252,182,6));
        }
    }//GEN-LAST:event_hoadonActionPerformed

    private void hoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoadonMousePressed
        this.sanpham.setSelected(false);
        this.khachhang.setSelected(false);
        this.nhanvien.setSelected(false);
        this.hoadon.setSelected(true);
        this.khohang.setSelected(false);
        this.thongke.setSelected(false);
    }//GEN-LAST:event_hoadonMousePressed

    private void khohangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khohangActionPerformed
        if(this.khohang.isSelected()){
            new CambiaPanel(pnlContent, new View.WareHouse.pnlKhoHang(a));
            this.khohang.setColorNormal(new Color(255,153,0));
            this.khohang.setColorHover(new Color(252,182,6));
            this.khohang.setColorPressed(new Color(255,153,0));
            
            this.khachhang.setColorNormal(new Color(252,182,6));
            this.khachhang.setColorHover(new Color(252,182,6));
            this.khachhang.setColorPressed(new Color(252,182,6));
            
            this.nhanvien.setColorNormal(new Color(252,182,6));
            this.nhanvien.setColorHover(new Color(252,182,6));
            this.nhanvien.setColorPressed(new Color(252,182,6));
            
            this.sanpham.setColorNormal(new Color(252,182,6));
            this.sanpham.setColorHover(new Color(252,182,6));
            this.sanpham.setColorPressed(new Color(252,182,6));
            
            this.hoadon.setColorNormal(new Color(252,182,6));
            this.hoadon.setColorHover(new Color(252,182,6));
            this.hoadon.setColorPressed(new Color(252,182,6));
            
            this.thongke.setColorNormal(new Color(252,182,6));
            this.thongke.setColorHover(new Color(252,182,6));
            this.thongke.setColorPressed(new Color(252,182,6));
            
        }else{
            this.khohang.setColorNormal(new Color(252,182,6));
            this.khohang.setColorHover(new Color(252,182,6));
            this.khohang.setColorPressed(new Color(252,182,6));
        }
    }//GEN-LAST:event_khohangActionPerformed

    private void khohangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khohangMousePressed
        this.sanpham.setSelected(false);
        this.khachhang.setSelected(false);
        this.nhanvien.setSelected(false);
        this.hoadon.setSelected(false);
        this.khohang.setSelected(true);
        this.thongke.setSelected(false);
    }//GEN-LAST:event_khohangMousePressed

    private void thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkeActionPerformed
        if(this.thongke.isSelected()){
            new CambiaPanel(pnlContent, new View.ThongKe.pnlThongKe());
            this.thongke.setColorNormal(new Color(255,153,0));
            this.thongke.setColorHover(new Color(252,182,6));
            this.thongke.setColorPressed(new Color(255,153,0));
            
            this.sanpham.setColorNormal(new Color(252,182,6));
            this.sanpham.setColorHover(new Color(252,182,6));
            this.sanpham.setColorPressed(new Color(252,182,6));
            
            this.khachhang.setColorNormal(new Color(252,182,6));
            this.khachhang.setColorHover(new Color(252,182,6));
            this.khachhang.setColorPressed(new Color(252,182,6));
            
            this.hoadon.setColorNormal(new Color(252,182,6));
            this.hoadon.setColorHover(new Color(252,182,6));
            this.hoadon.setColorPressed(new Color(252,182,6));
            
            this.khohang.setColorNormal(new Color(252,182,6));
            this.khohang.setColorHover(new Color(252,182,6));
            this.khohang.setColorPressed(new Color(252,182,6));
            
            this.nhanvien.setColorNormal(new Color(252,182,6));
            this.nhanvien.setColorHover(new Color(252,182,6));
            this.nhanvien.setColorPressed(new Color(252,182,6));
            
        }else{
            this.thongke.setColorNormal(new Color(252,182,6));
            this.thongke.setColorHover(new Color(252,182,6));
            this.thongke.setColorPressed(new Color(252,182,6));
        }
    }//GEN-LAST:event_thongkeActionPerformed

    private void thongkeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMousePressed
        this.sanpham.setSelected(false);
        this.khachhang.setSelected(false);
        this.nhanvien.setSelected(false);
        this.hoadon.setSelected(false);
        this.khohang.setSelected(false);
        this.thongke.setSelected(true);
    }//GEN-LAST:event_thongkeMousePressed

    private void labelClockAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelClockAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelClockAncestorAdded

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CaNhan;
    private javax.swing.JLabel Img;
    private rsbuttom.RSButtonMetro LogOut;
    private rsbuttom.RSButtonMetro btnMenu;
    private rsbuttom.RSButtonMetro hoadon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private rsbuttom.RSButtonMetro khachhang;
    private rsbuttom.RSButtonMetro khohang;
    private javax.swing.JLabel labelClock;
    private rsbuttom.RSButtonMetro nhanvien;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel ptnMenu;
    private rsbuttom.RSButtonMetro sanpham;
    private rsbuttom.RSButtonMetro thongke;
    // End of variables declaration//GEN-END:variables
}
