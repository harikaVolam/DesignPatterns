package IteratorPattern;

import IteratorPattern.Aggregator.NotificationCollection;
import IteratorPattern.Iterator.Iterator;

//https://www.geeksforgeeks.org/iterator-pattern/
//https://springframework.guru/gang-of-four-design-patterns/iterator-pattern/
public class Main
{
    public static void main(String[] args)
    {
        NotificationCollection nc = new NotificationCollection();
        Iterator iterator = nc.createIterator();
        while (iterator.hasNext())
        {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }

    }
}