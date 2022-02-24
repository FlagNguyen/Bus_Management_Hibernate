package com.example.Bus_Management_Hibernate.DAO.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ASSIGNMENT {

    @Id
    @Column(name = "DRIVER_ID")
    private int driver_id;

    @Column(name = "ROUTE_ID")
    private int route_id;

    @Column(name = "TURN")
    private int turn;

    public ASSIGNMENT() {
    }

    public ASSIGNMENT(int driver_id, int route_id, int turn) {
        this.driver_id = driver_id;
        this.route_id = route_id;
        this.turn = turn;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
