package com.mayikt.adapter;

import java.util.HashMap;
import java.util.List;

public class ListAdapter extends HashMap {

    private List list;

    public ListAdapter(List list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Object get(Object key) {
        return list.get(Integer.valueOf(key.toString()).intValue());
    }
}
