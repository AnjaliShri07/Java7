package com.java7.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class EmployeeImmutable {

    private final Integer id;
    private final String name;
    private final List<String> address;

    public EmployeeImmutable(Integer id, String name, List<String> address) {
        this.id = id;
        this.name = name;
        this.address = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getAddress() {
        return Collections.unmodifiableList(address);
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
