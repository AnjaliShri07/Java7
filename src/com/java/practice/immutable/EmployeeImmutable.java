package com.java.practice.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class EmployeeImmutable {

    private final Integer Id;
    private final String Name;
    private final List<String> address;

    public EmployeeImmutable(Integer Id, String Name, List<String> address) {
        this.Id = Id;
        this.Name = Name;
        this.address = new ArrayList<>();
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public List<String> getAddress() {
        return Collections.unmodifiableList(address);
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", address=" + address +
                '}';
    }
}
