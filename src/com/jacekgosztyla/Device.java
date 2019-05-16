package com.jacekgosztyla;

public class Device {
    int id;
    ESystem system;


    public Device(int id, ESystem system) {
        this.id = id;
        this.system = system;
    }


    public void showNotification(){

    }

    @Override
    public String toString() {
        return "Device| id=" + id + "; system=" +system.toString();
    }
}
