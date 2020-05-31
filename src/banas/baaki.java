/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author JUNED
 */
class baaki {
        private String name,d_date;
        private int amount;
        public baaki(String name,int amount,String d_date)
        {
            this.name=name;
            this.amount=amount;
            this.d_date=d_date;
        }
        public String name()
        {
            return name;
        }
        public int amount()
        {
            return amount;
        }
        public String d_date()
        {
             Calendar cal=Calendar.getInstance();
            String d_date=new SimpleDateFormat("MMMYYYY").format(cal.getTime());
            return d_date;
        }
}
