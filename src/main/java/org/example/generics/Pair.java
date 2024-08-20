package org.example.generics;

public class Pair<A, B> {
    A first;
    B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public <T> void doSomething(T x){
        System.out.println(x);
    }

    public <E> void heyThere(A a, B b, E e){
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
    }

    public <T, S> void doAnother(T t, S s){
        System.out.println(t);
        System.out.println(s);
    }

    public <T, S, V> void doHello(A a, B b, T t, S s, V v){

    }

    public <S, T, V, Z> Z  doIntegerStuff(S s, T t){
       return null;
    }
}
