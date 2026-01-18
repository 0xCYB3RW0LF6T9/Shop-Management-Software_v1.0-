
package shop_managment_v1.pkg0;

public class Employ_info {
    String name;
    int id;
    void set_info(String a, int b)
    {
        name=a;
        id=b;
        
    } 
    void show_e()
    {
    
        System.out.println("Name = "+name);
        System.out.println("ID no = "+id);
    }
   
}
