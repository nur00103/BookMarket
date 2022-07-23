package com.example.bookshop.bookshop.main;

import com.example.bookshop.bookshop.swingCustomer.SignIn;


public class Main {
    public static void main(String[] args) {
       
        try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            SignIn signIn=new SignIn();
            signIn.setVisible(true);
            
//            CustomerDao c=new CustomerDaoImpl();
//            ProductDao pd=new ProductDaoImpl();
//            ProductInfoDao pid =new ProductInfoDaoImpl();
//            
//            AuthorDao ad=new AuthorDaoImpl();
//            CategoryDao cd=new CategoryDaoImpl();
//            LangDao ld=new LangDaoImpl();
//            PubHouseDao phd=new PubHouseDaoImpl();
//            TypeDao td =new TypeDaoImpl();
            
                 
//            MainFrame mainFrame=new MainFrame(c,pd,pid,ad,cd,ld,phd,td);
//            mainFrame.setVisible(true);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
//        ProductInfoDao pid =new ProductInfoDaoImpl();
//        System.out.println(pid.getAllProductInfo());
//        for(ProductInfo a:pid.getAllProductInfo()){
//            System.out.println(a.getId()+" "+a.getProduct()+" "+a.getCategory().getType()+" "+a.getAuthor()+" "+a.getLang()+" "+a.getType()+" "+a.getPubHouse()+" "+a.getPage()+" "+a.getColor()+" "+a.getDescription()+" "+a.getBestseller());
//        }
                

//ProductDao pd=new ProductDaoImpl();
////        Product product= new Product(9, "Safari series Notebook",12, 0, 800);
////        pd.updateProduct(product);
////          Product p=new Product("Aciqca",1,0,800);
////          pd.addProduct(p);
//System.out.println(pd.searchProductData("aciqca"));

//        CustomerDaoImpl cs=new CustomerDaoImpl();

//        System.out.println(cs.searchCustomerData("ay"));
             //getAllCustomer
//        System.out.println(cs.getAllCustomer());

           
            //updateCustomer
//         Customer ct=cs.getCustomerById(4);
//         ct.setName("Ruslan");
//         cs.updateCustomer(ct);


           //addCustomer
//         Customer c=new Customer("Asad","Bayramov","asadbay53","54737h","Baki","Sahil m","asadbayramov@mail.ru","+994 50 475 45 96");
//         cs.addCustomer(c);


           //deleteCustomer
//         cs.removeCustomer(8);

           
    }
}
