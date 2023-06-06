package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {

    IntegerListImpl list= new IntegerListImpl(10);

    @Test
    void add() {
        list.add(1) ;
    }

    @Test
    void testAdd() {
        list.add(0, 2);
        list.add(1, 2434);
        list.add(2, 53);
        list.add(3, 135);
        list.add(4, 87);
        list.add(5, 58);
        list.add(6, 88);
        list.add(7, 0);
        list.add(8, 35);
        list.add(9, 10);
        list.add(10, 13476);
        list.add(11, 78546);

    }

    @Test
    void set() {
        list.add(0, 2);
        list.add(1, 2434);
        list.add(2, 53);
        list.set(0, 3);
    }

    @Test
    void remove() {
        list.add(0, 2);
        list.add(1, 2434);
        list.add(2, 53);
        list.remove(2);
    }

    @Test
    void testRemove() {
        list.add(0, 2);
        list.add(1, 2434);
        list.add(2, 53);
        list.remove(1);
    }

    @Test
    void contains() {
        list.contains(3);
    }

    @Test
    void indexOf() {
        list.indexOf(3);
    }

    @Test
    void lastIndexOf() {
        list.lastIndexOf(0);
    }

    @Test
    void get() {
        list.add(0, 2);
        list.add(1, 2434);
        list.add(2, 53);
        list.get(1);
    }

    @Test
    void testEquals() {
        list.equals(new IntegerListImpl());
    }

    @Test
    void size() {
        list.size();
    }

    @Test
    void isEmpty() {
        list.isEmpty();
    }

    @Test
    void clear() {
        list.clear();
    }

    @Test
    void toArray() {
        list.toArray();
    }

    @Test
    void sort() {
        list.add(0, 2);
        list.add(1, 2434);
        list.add(2, 53);
        list.add(3, 135);
        list.add(4, 87);
        list.add(5, 58);
        list.add(6, 88);
        list.add(7, 0);
        list.add(8, 35);
        list.add(9, 10);
        list.add(10, 13476);
        list.add(11, 78546);
        list.sort(list.toArray());
    }
}