/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author juned
 */
 class user {
    private int amount,pay,baaki;
    private String name,d_date;
    public user(String name,int amount,int pay,int baaki,String d_date)
    {
        this.name=name;
        this.amount=amount;
        this.pay=pay;
        this.baaki=baaki;
        this.d_date=d_date;
    }
    public int amount(){
        return amount;
    }
    public int pay(){
        return pay;
    }
    public int baaki(){
        return baaki;
    }
    public String name(){
        return name;
    }
    public String d_date(){
        return d_date;
    }
}
