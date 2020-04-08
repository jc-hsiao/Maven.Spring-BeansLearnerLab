package com.example.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E> {
    List<E> personList;

    public People(E[] arr){
        personList = Arrays.asList(arr);
    }

    public People(List<E> personList){
        this.personList = personList;
    }

    public void add(E person){
        personList.add(person);
    }

    public void remove(E person){
        personList.remove(person);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<E> personList2){
        personList2.forEach( l -> personList.add(l) );
    }

    public E findById(long id){
        for(E p:personList){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    public List<E> findAll(){
        return personList;
    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder();
        for(Person p :personList){
            str.append(p).append("\n");
        }
        return "== personList ==\n" +str;
    }
}
