package com.dining.philosopher;
import com.dining.entity.Philosopher;
import com.dining.entity.Semaphore;
// import java.util.concurrent.Semaphore;

public class DiningPhilosopher
{
    public static void main(String[] args)
    {
        Semaphore chopsticks[];
        Philosopher philosopher[];

        chopsticks=new Semaphore[5];
        for (int i=0; i<5; i++)
        {
            chopsticks[i] =new Semaphore(1); 
            //initial value is 1.
        }
        philosopher = new Philosopher[5];

        for(int i=0;i<5;i++)
        {
            philosopher[i] = new Philosopher(i,chopsticks);
            philosopher[i].start();
        }
    }
}

