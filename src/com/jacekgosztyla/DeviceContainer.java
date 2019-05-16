package com.jacekgosztyla;

import java.util.List;

class DeviceContainer {
    List<Device> deviceList;
    DataMatcher dataMatcher;

    DeviceContainer(List<Device> deviceList) {
        this.deviceList = deviceList;
        dataMatcher = new DataMatcher();
    }

    void addDevice(Device device){
        deviceList.add(device);
    }

    void removeDevice(Device device){
        deviceList.remove(device);
    }

    void printDevices(){
        System.out.println("Devices:\n");
        for(Device device : deviceList){
            System.out.println(device.toString() + "\n");
        }
    }

    void addLeagueToObseve(Device observer, ELeague league){
        if(deviceList.contains(observer)){
            try{
                dataMatcher.addObserver(league, observer);
            }catch (IllegalStateException e){
                System.out.println("you can't add the same league twice to observed");
            }

        }else{
            System.out.println("no such device");
        }

    }

    void removeLeagueFromObserved(Device observer, ELeague observed){
        if(deviceList.contains(observer)){
            dataMatcher.removeObserver(observed, observer);
        }else{
            System.out.println("no such device");
        }

    }

    void printDevicesAndLeagues(){
        dataMatcher.printDevices();
    }

}
