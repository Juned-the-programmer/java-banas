
package banas;


public class bill {

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
     * @return the cooler
     */
    public String getCooler() {
        return cooler;
    }

    /**
     * @param cooler the cooler to set
     */
    public void setCooler(String cooler) {
        this.cooler = cooler;
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
     * @return the jama
     */
    public String getJama() {
        return jama;
    }

    /**
     * @param jama the jama to set
     */
    public void setJama(String jama) {
        this.jama = jama;
    }

    /**
     * @return the bhaav
     */
    public String getBhaav() {
        return bhaav;
    }

    /**
     * @param bhaav the bhaav to set
     */
    public void setBhaav(String bhaav) {
        this.bhaav = bhaav;
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
     * @return the route
     */
    public String getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(String route) {
        this.route = route;
    }
    private String name;
    private String cooler;
    private String baaki;
    private String jama;
    private String bhaav;
    private String amount;
    private String route;
     
    public bill()
    {
        
    }
    public bill(String name,String cooler,String baaki,String jama,String bhaav,String amount,String route)
    {
        this.name=name;
        this.cooler=cooler;
        this.baaki=baaki;
        this.jama=jama;
        this.bhaav=bhaav;
        this.amount=amount;
        this.route=route;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
