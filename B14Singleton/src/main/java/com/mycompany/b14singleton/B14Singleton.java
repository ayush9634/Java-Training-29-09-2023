/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b14singleton;

/**
 *
 * @author E-LAB-PC28
 */
public class B14Singleton {

    public static void main(String[] args) {
        Abc obj = Abc.getInstance();
        
    }
}
class Abc
{
    static Abc obj = new Abc();
    private Abc()
    {
        System.out.println("It's Ok");
    }
    public static Abc getInstance()
    {
        if(obj==null)
        {
            obj = new Abc();
        }
        return obj;
    }
}
