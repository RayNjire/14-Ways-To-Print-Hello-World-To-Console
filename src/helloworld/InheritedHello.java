/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author ray njire
 */
public class InheritedHello {
    String GreetHello;
    
    public InheritedHello(String GreetHello)
    {
        this.GreetHello = GreetHello;
        
    }
    
    /*PRIVATE ACCESS MODIFIER
    
    this PrivateHello variable / attribute can only be accessed by this InheritedHello class
    */
    private String PrivateHello;

    public void setPrivateHello(String PrivateHello)
    {
        this.PrivateHello = PrivateHello;
        
    }
    
    public String getPrivateHello()
    {
        return PrivateHello;
        
    }
}
