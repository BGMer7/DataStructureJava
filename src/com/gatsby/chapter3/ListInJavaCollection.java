package com.gatsby.chapter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2021/12/14
 * @description -- Java Collection API中的表
 */


public class ListInJavaCollection {
    public void easyArr() {
        final int size = 10;
        int[] arr = new int[size];

        // 假设需要扩大arr
        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; ++i)
            newArr[i] = arr[i];

        arr = newArr;
    }

    public void CollectionAPI() {
        // Collection is an interface, so Override needed
        Collection collection = new Collection() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    public void IterableAPI() {
        Iterable<?> iterable = new Iterable<Object>() {
            @Override
            public Iterator<Object> iterator() {
                return null;
            }
        };
    }

    public static void print(Collection<?> collection) {
        Iterator<?> iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("China");
        list.add("Japan");
        list.add("America");
        ListInJavaCollection.print(list); // 因为是static方法，所以直接打印
        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        ListInJavaCollection.print(list);
    }
}