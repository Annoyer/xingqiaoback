package model;

public class Area3 {
    private Integer id;

    private String name;

    private Integer a2Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getA2Id() {
        return a2Id;
    }

    public void setA2Id(Integer a2Id) {
        this.a2Id = a2Id;
    }
}