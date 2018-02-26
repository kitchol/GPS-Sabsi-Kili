package com.example.sallai.gps;

/**
 * Created by Sallai on 26.02.2018.
 */

class Locations {
    String lo;
    String la;
    String my;
    int x;

    public Locations(String lo, String la, String my) {
        this.lo = lo;
        this.la = la;
        this.my = my;
    }

    public Locations() {
    }

    public String getLo() {
        return lo;
    }

    public void setLo(String lo) {
        this.lo = lo;
    }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }

    public String getMy() {
        return my;
    }

    public void setMy(String my) {
        this.my = my;
    }
}
