package IteratorPattern.Aggregator;


import IteratorPattern.Iterator.Iterator;

interface Collection {
    public Iterator createIterator();
}
