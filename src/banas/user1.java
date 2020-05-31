
package banas;


public class user1 {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the pay
     */
    public String getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(String pay) {
        this.pay = pay;
    }

    /**
     * @return the baaki
     */
    public String getBaaki() {
        return baaki;
    }

    /**
     * @param baaki the baaki to set
     */
    public void setBaaki(String baaki) {
        this.baaki = baaki;
    }

    /**
     * @return the date_
     */
    public String getDate_() {
        return date_;
    }

    /**
     * @param date_ the date_ to set
     */
    public void setDate_(String date_) {
        this.date_ = date_;
    }
    String name;
    private String amount;
    private String pay;
    private String baaki;
    private String date_;
    
    public user1(String name,String amount,String pay,String baaki,String date_)
    {
        this.name=name;
        this.amount=amount;
        this.baaki=baaki;
        this.pay=pay;
        this.date_=date_;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
