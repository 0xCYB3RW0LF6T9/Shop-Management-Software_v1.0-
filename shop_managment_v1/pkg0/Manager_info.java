
package shop_managment_v1.pkg0;

public class Manager_info extends Employ_info{
    // name,id
    String branch;
    void set_info_m(String a)
    {
    branch = a;    
    
    }
   void show_m()
   {
       System.out.println("NAme = "+name);
       System.out.println("ID = "+id);
       System.out.println("Branch = "+branch);
   
       
   
   }
    
    
}
