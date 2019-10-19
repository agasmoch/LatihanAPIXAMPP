package com.agasmochfauzan.latihanbackendapixampp;

public class Pegawai {
    private String id;
    private String name;
    private String position;
    private String salary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    public Pegawai(String id, String name, String position, String salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
