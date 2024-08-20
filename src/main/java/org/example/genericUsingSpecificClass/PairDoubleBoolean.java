package org.example.genericUsingSpecificClass;

public class PairDoubleBoolean {
    Double first;
    Boolean second;

    public PairDoubleBoolean(Double first, Boolean second) {
        this.first = first;
        this.second = second;
    }

    public Double getFirst() {
        return first;
    }

    public void setFirst(Double first) {
        this.first = first;
    }

    public Boolean getSecond() {
        return second;
    }

    public void setSecond(Boolean second) {
        this.second = second;
    }
}
