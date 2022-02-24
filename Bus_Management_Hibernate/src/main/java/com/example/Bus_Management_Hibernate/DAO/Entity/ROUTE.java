package com.example.Bus_Management_Hibernate.DAO.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ROUTE {
    @Id
    @Column(name = "ROUTE_ID")
    private int route_ID;

    @Column(name = "DISTANCE")
    private int distance;

    @Column(name = "STATIONS")
    private int stations;

    public ROUTE() {
    }

    public ROUTE(int route_ID, int distance, int stations) {
        this.route_ID = route_ID;
        this.distance = distance;
        this.stations = stations;
    }

    public int getRoute_ID() {
        return route_ID;
    }

    public void setRoute_ID(int route_ID) {
        this.route_ID = route_ID;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getStations() {
        return stations;
    }

    public void setStations(int stations) {
        this.stations = stations;
    }
}
