package com.cornez.tapbuttoncounter;

/**
 * Created by Gabriel on 2/14/16.
 */
public class Counter {
    private int mCount;

    public Counter(){
        mCount=0;
    }

    public void addCount(){
        mCount++;
    }

    public Integer getCount(){
        return mCount;
    }
}
