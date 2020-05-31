
package banas;


public class month {
    private int amount,pay,baaki;
    private String name,d_date,dat;
    public month(String name,int amount,int pay,int baaki,String d_date)
    {
        this.name=name;
        this.amount=amount;
        this.pay=pay;
        this.baaki=baaki;
        this.d_date=d_date;
        this.dat=dat;
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
