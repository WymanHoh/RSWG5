/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Testing */
public class Student {
    String name;
    
    int RE;
    int SDA;
    int SQAT;
    int SEAM;
    int FM;
   
    double getAverageMark()
    {
        return (RE+SDA+SQAT+SEAM+FM)/4;
    }

  
    int getTotal()
    {
        return (RE+SDA+SQAT+SEAM+FM);
    }

    int countAll(){
        return 0;
    }
    
    void testDisplay()
    {
        System.out.println("Testing...");

    }
   
    void testAll()
 {
     System.out.println("Hello");
     return;
<<<<<<< HEAD
    }

void myTest();
=======
}
>>>>>>> parent of d810246 (Update Results.java)
}