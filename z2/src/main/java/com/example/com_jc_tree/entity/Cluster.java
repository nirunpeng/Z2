package com.example.com_jc_tree.entity;

public class Cluster {
    private Integer id;
    private String name;
    private Double threehitrate;
    private Double backboard;
    private Double score;
    private Double shoting;
    private Double steal;
    private Integer session;
    private Double blocks;
    private Double assist;
    private Double gametime;
    private Integer salary;

    @Override
    public String toString() {
        return "Cluster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", threehitrate=" + threehitrate +
                ", backboard=" + backboard +
                ", score=" + score +
                ", shoting=" + shoting +
                ", steal=" + steal +
                ", session=" + session +
                ", blocks=" + blocks +
                ", assist=" + assist +
                ", gametime=" + gametime +
                ", salary=" + salary +
                '}';
    }

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
        this.name = name;
    }

    public Double getThreehitrate() {
        return threehitrate;
    }

    public void setThreehitrate(Double threehitrate) {
        this.threehitrate = threehitrate;
    }

    public Double getBackboard() {
        return backboard;
    }

    public void setBackboard(Double backboard) {
        this.backboard = backboard;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getShoting() {
        return shoting;
    }

    public void setShoting(Double shoting) {
        this.shoting = shoting;
    }

    public Double getSteal() {
        return steal;
    }

    public void setSteal(Double steal) {
        this.steal = steal;
    }

    public Integer getSession() {
        return session;
    }

    public void setSession(Integer session) {
        this.session = session;
    }

    public Double getBlocks() {
        return blocks;
    }

    public void setBlocks(Double blocks) {
        this.blocks = blocks;
    }

    public Double getAssist() {
        return assist;
    }

    public void setAssist(Double assist) {
        this.assist = assist;
    }

    public Double getGametime() {
        return gametime;
    }

    public void setGametime(Double gametime) {
        this.gametime = gametime;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
