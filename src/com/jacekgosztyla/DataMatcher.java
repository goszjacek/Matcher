package com.jacekgosztyla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataMatcher {
    Map<ELeague, List<Device>> devices;

    public DataMatcher() {
        devices = new HashMap<>();
    }

    void addObserver(ELeague league, Device device) throws IllegalStateException{
        List<Device>leagueDevices = devices.get(league);
        if(leagueDevices == null){
            leagueDevices = new ArrayList<>();
            leagueDevices.add(device);
            devices.put(league,leagueDevices);
        }else{
            if(leagueDevices.contains(device)){
                throw new IllegalStateException();
            }else{
                leagueDevices.add(device);
                devices.put(league,leagueDevices);
            }
        }
    }

    void removeObserver(ELeague league, Device device){
        List<Device>leagueDevices = devices.get(league);
        leagueDevices.remove(device);
        devices.put(league,leagueDevices);
    }

    void printDevices(){
        System.out.println("\n\nDevices and leagues: ");
        for (Map.Entry<ELeague,List<Device>> entry : devices.entrySet()) {
            System.out.println("League = " + entry.getKey()+ ":");
            for (Device device : entry.getValue()) {
            System.out.println(device.toString());
            }
        }


    }





}
