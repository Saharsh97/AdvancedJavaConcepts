package org.example.genericUsingSpecificClass;

// 1st approach
public class PairStringInteger {
    String first;
    Integer second;

    public PairStringInteger(String first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
}
