package com.leetcode.apr2022.linkedlist;

import java.util.List;

public interface MyList  {
    int size();
    boolean isEmpty();
    boolean add(int a);
    boolean remove(int a);
    int get(int index);
    boolean set(int index, int a);
    boolean clear();

}
