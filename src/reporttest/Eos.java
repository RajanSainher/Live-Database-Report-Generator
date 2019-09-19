/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporttest;

/**
 *
 * @author sainh
 */
class Eos {
    private int sno;
    private String product, lsd, msed, esed, spsed;
    
    public Eos(int sno, String product, String lsd, String msed, String esed, String spsed){
        this.sno=sno;
        this.product=product;
        this.lsd=lsd;
        this.msed=msed;
        this.esed=esed;
        this.spsed=spsed;
    }
    public int getsno(){
        return sno;
    }
    public String getproduct(){
        return product;
    }
    public String getlsd(){
        return lsd;
    }
    public String getmsed(){
        return msed;
    }
    public String getesed(){
        return esed;
    }
    public String getspsed(){
        return spsed;
    }
}


