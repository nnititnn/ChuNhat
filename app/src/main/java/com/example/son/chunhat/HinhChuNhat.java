package com.example.son.chunhat;

/**
 * Created by son on 10/7/2015.
 */


public class HinhChuNhat {
    private int dai;
    private int rong;
    HinhChuNhat(){
        dai=1;
      rong=1;

    }
public HinhChuNhat(int dai, int rong){
    this.dai=dai;
    this.rong=rong;

}
    public void setDai(int dai){
        this.dai=dai;

    }
    public int getdai(){
        return dai;
    }
    public void setRong(int rong){
        this.rong=rong;

    }
    public int getRong(){
        return rong;
    }


}
