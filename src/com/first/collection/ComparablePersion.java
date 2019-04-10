package com.first.collection;

public class ComparablePersion implements Comparable<ComparablePersion> {
    private int id;
    private String name;

    public ComparablePersion(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComparablePersion)) {
            return false;
        }
        ComparablePersion p = (ComparablePersion) obj;
        if (this.id == p.getId()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "{\"" + id + "\": \"" + name + "\"}";
    }

    @Override
    public int compareTo(ComparablePersion o) {
        int cpId = o.getId();
        String cpName = o.getName();

        if (this.getId() < cpId) {
            return -1;
        }
        if (this.getId() > cpId ) {
            return 1;
        }
        if (this.getId() == cpId) {
            return this.getName().compareTo(cpName);
        }

        return 0;
    }
}
