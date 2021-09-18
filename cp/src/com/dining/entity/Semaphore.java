package com.dining.entity;

public class Semaphore
{
    private int count;

    public Semaphore(int value)
    {
        this.count=value;
    }

    public synchronized void p()
    {
        while(count==0)
        {
            try
            {
                System.out.println("Sticks are in use");
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
        count=count-1;
    }

    public synchronized void v()
    {
        count=count+1;
        notify();
    }
}
