package com.example.bookshop.bookshop.swingCustomer;

import com.example.bookshop.bookshop.dao.*;
import com.example.bookshop.bookshop.modul.*;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

                                                   
public class MainFrame extends javax.swing.JFrame {

    private CustomerDao c;
    private ProductDao pd;
    private ProductInfoDao pid;
    private Integer globalBtn;
    private AuthorDao ad;
    private CategoryDao cd;
    private LangDao ld;
    private PubHouseDao phd;
    private TypeDao td;
    private AdminDao adminDao;
    private Admin admin;
    private Login login;
    
    public MainFrame() {
        initComponents();
    }

    

    public MainFrame(CustomerDao c, ProductDao pd, ProductInfoDao pid, AuthorDao ad, CategoryDao cd, LangDao ld, PubHouseDao phd, TypeDao td,Login login) {
       initComponents();
        this.c=c;
        this.pd=pd;
        this.pid=pid;
        this.ad=ad;
        this.ld=ld;
        this.phd=phd;
        this.cd=cd;
        this.td=td;
        this.admin=admin;
        this.adminDao=adminDao;
        this.login=login;
        jLabel1.setText(login.getUsername());
        role();
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
        Delete = new javax.swing.JToggleButton();
        New = new javax.swing.JToggleButton();
        New2 = new javax.swing.JToggleButton();
        Edit1 = new javax.swing.JToggleButton();
        keywordtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JToggleButton();
        logoutbtn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Customer = new javax.swing.JButton();
        Product = new javax.swing.JButton();
        Sales = new javax.swing.JButton();
        productInfo1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        New2.setText("New");

        Edit1.setText("Edit");
        Edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit1ActionPerformed(evt);
            }
        });

        keywordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keywordtxtKeyReleased(evt);
            }
        });

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        logoutbtn.setText("Log out");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Welcome,");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(keywordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(New, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(675, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(New2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(677, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(Edit1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(keywordtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(searchbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(logoutbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(New, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(New2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingCustomer/icons8-customer-50.png"))); // NOI18N
        Customer.setText("Customer");
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });

        Product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingCustomer/icons8-used-product-50.png"))); // NOI18N
        Product.setText("Product");
        Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });

        Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingCustomer/icons8-used-product-50.png"))); // NOI18N
        Sales.setText("Sales");
        Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesActionPerformed(evt);
            }
        });

        productInfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingCustomer/icons8-used-product-50.png"))); // NOI18N
        productInfo1.setText("Product Info");
        productInfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productInfo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productInfo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(productInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sales, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        TableC.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        showCustomerData(c.getAllCustomer());
        globalBtn=1;
    }//GEN-LAST:event_CustomerActionPerformed

    private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
        showProductData(pd.getAllProduct());
        globalBtn=2;
    }//GEN-LAST:event_ProductActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        switch(globalBtn){
            case 1:
                NewCustomerFrame ncf=new NewCustomerFrame(c);
                ncf.setVisible(true);
                break;
            case 2:
                NewProductFrame ndf=new NewProductFrame(pd);
                ndf.setVisible(true);
                break;
            case 3:
                NewProductInfoFrame npif =new NewProductInfoFrame(c,pd,pid,ad,cd,ld,phd,td);
                npif.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please, select menu");
               
        }
    }//GEN-LAST:event_NewActionPerformed

    private void SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesActionPerformed
        
    }//GEN-LAST:event_SalesActionPerformed

    private void productInfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productInfo1ActionPerformed
        showProductInfoData();
        globalBtn=3;
    }//GEN-LAST:event_productInfo1ActionPerformed

    private void Edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit1ActionPerformed
        int rowIndex=TableC.getSelectedRow();
        int selectedIndex=(int) TableC.getValueAt(rowIndex, 0);
        switch(globalBtn){
            case 1:
                EditCustomerFrame ecf=new EditCustomerFrame(c,selectedIndex);
                ecf.setVisible(true);
                break;
            case 2:
                NewProductFrame ndf=new NewProductFrame(pd);
                ndf.setVisible(true);
                break;
            case 3:
                NewProductInfoFrame npif =new NewProductInfoFrame(c,pd,pid,ad,cd,ld,phd,td);
                npif.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please, select menu");
               
        }
    }//GEN-LAST:event_Edit1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int rowIndex=TableC.getSelectedRow();
        int selectedIndex=(int) TableC.getValueAt(rowIndex, 0);
        switch(globalBtn){
            case 1:
                int deleteMsg=JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Customer", JOptionPane.YES_NO_OPTION);
                if (deleteMsg==JOptionPane.YES_OPTION) {
                    c.removeCustomer(selectedIndex);
                    JOptionPane.showMessageDialog(null, "Customer has been deleted");
                    showCustomerData(c.getAllCustomer());
                }
                break;
            case 2:
                NewProductFrame ndf=new NewProductFrame(pd);
                ndf.setVisible(true);
                break;
            case 3:
                NewProductInfoFrame npif =new NewProductInfoFrame(c,pd,pid,ad,cd,ld,phd,td);
                npif.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please, select menu");
               
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void TableCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCMouseClicked
        if (evt.getClickCount()==2) {
            Edit1ActionPerformed(null);
        }
    }//GEN-LAST:event_TableCMouseClicked

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
       String keyword=keywordtxt.getText();
       switch(globalBtn){
            case 1:
                List<Customer> customers=c.searchCustomerData(keyword);
                showCustomerData(customers);
                break;
            case 2:
                List<Product> products=pd.searchProductData(keyword);
                showProductData(products);
                break;
            case 3:
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please, select menu");
               
        }
       
    }//GEN-LAST:event_searchbtnActionPerformed

    private void keywordtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keywordtxtKeyReleased
        searchbtnActionPerformed(null);
    }//GEN-LAST:event_keywordtxtKeyReleased

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        SignIn signIn=new SignIn();
        signIn.setVisible(true);
        this.dispose();//dispose olmur?
    }//GEN-LAST:event_logoutbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Customer;
    private javax.swing.JToggleButton Delete;
    private javax.swing.JToggleButton Edit1;
    private javax.swing.JToggleButton New;
    private javax.swing.JToggleButton New2;
    private javax.swing.JButton Product;
    private javax.swing.JButton Sales;
    private javax.swing.JTable TableC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keywordtxt;
    private javax.swing.JToggleButton logoutbtn;
    private javax.swing.JButton productInfo1;
    private javax.swing.JToggleButton searchbtn;
    // End of variables declaration//GEN-END:variables

    private void showProductData(List<Product> products) {
        try{
        DefaultTableModel model=new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
            
        };
           
        TableC.setModel(model);
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Discount");
        model.addColumn("Stock");
       
       // List<Product> products=pd.getAllProduct();
        for (com.example.bookshop.bookshop.modul.Product product :products) {
            Object [] data=new Object[]{
                product.getProductId(),product.getProductName(),product.getPrice(),product.getDiscount(),product.getStock()
            };
            model.addRow(data);
        }
        model.fireTableDataChanged();
         }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void showCustomerData(List<Customer> customers) {
        try{
        DefaultTableModel model=new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
            
        };
        TableC.setModel(model);
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Surname");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Address");
        model.addColumn("City");
        model.addColumn("Email");
        model.addColumn("Phone");
        //List<Customer> customers=c.getAllCustomer();
        for (com.example.bookshop.bookshop.modul.Customer customer :customers) {
            Object [] data=new Object[]{
                customer.getId(),customer.getName(),customer.getSurname(),customer.getUsername(),customer.getPassword(),customer.getAddress(),customer.getCity(),customer.getEmail(),customer.getPhone()
            };
            model.addRow(data);
        }
        model.fireTableDataChanged();
    }
     catch(Exception e){
         e.printStackTrace();
     }   
    }

    private void showProductInfoData() {
        try{
        DefaultTableModel model=new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
            
        };
        TableC.setModel(model);
        model.addColumn("ID");
        model.addColumn("Product");
        model.addColumn("Category");
        model.addColumn("Author");
        model.addColumn("Language");
        model.addColumn("Type");
        model.addColumn("Publishing House");
        model.addColumn("Page");
        model.addColumn("Color");
        model.addColumn("Description");
        model.addColumn("Bestseller");

       
        List<ProductInfo> productInfo=pid.getAllProductInfo();
        for (ProductInfo a :productInfo) {
            Object [] data=new Object[]{
                a.getId(),a.getProduct().getProductName(),a.getCategory().getType(),a.getAuthor().getAuthorName(),a.getLang().getLanguange(),a.getType().getType(),a.getPubHouse().getPubName(),(a.getPage()==0? "":a.getPage()),a.getColor(),a.getDescription(),(a.getBestseller()==0? "":a.getBestseller())
            };
            model.addRow(data);
        }
        model.fireTableDataChanged();
         }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void role() {
        String roleName=login.getRole();  
        if (roleName.equalsIgnoreCase("Customer")) {
            New.setVisible(false);
            New2.setVisible(false);
            Customer.setVisible(false);
            Sales.setVisible(false);
            Edit1.setVisible(false);
            Delete.setVisible(false);
        }else if (roleName.equalsIgnoreCase("Admin")) {
            
        }
    }
}
