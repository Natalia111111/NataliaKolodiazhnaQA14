package com.telran.addressbook.model;

public class GroupData {
    private final String name;
    private final String foter;
    private final String header;

    public GroupData(String name, String foter, String header) {
        this.name = name;
        this.foter = foter;
        this.header = header;
    }

    public String getName() {
        return name;
    }

    public String getFoter() {
        return foter;
    }

    public String getHeader() {
        return header;
    }
}
