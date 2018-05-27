/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app2;

/**
 *
 * @author hp
 */
class PlusNos
{
    int a;
    int b;
    int c;
    
    PlusNos()
    {
       a=10;
       b=20;
       c=a+b;
    }
    
        PlusNos(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
        
            void display()
            {
                System.out.print(c);
            }   
            
                void add()
                {
                    c=a+b;
                }
}
public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlusNos obj=new PlusNos();
        obj.add();
        obj.display();
// TODO code application logic here
        
    }
    
}
