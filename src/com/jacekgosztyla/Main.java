package com.jacekgosztyla;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // create devices
        Device device1 = new Device(1, ESystem.ANDROID);
        Device device2 = new Device(2, ESystem.OS);
        Device device3 = new Device(3, ESystem.WINDOWS);
        Device device4 = new Device(4, ESystem.ANDROID);
        Device device5 = new Device(5, ESystem.OS);

        List<Device> devicesList = new ArrayList<Device>();
        devicesList.add(device1);
        devicesList.add(device2);
        devicesList.add(device3);
        devicesList.add(device4);

        //create container
        DeviceContainer deviceContainer = new DeviceContainer(devicesList);
        deviceContainer.addDevice(device5);
        deviceContainer.removeDevice(device3);
        deviceContainer.printDevices();

        //add leagues to observed
        deviceContainer.addLeagueToObseve(device1, ELeague.EXTRAKLASA);
        deviceContainer.addLeagueToObseve(device2, ELeague.PIERWSZA);
        deviceContainer.addLeagueToObseve(device2, ELeague.DRUGA);
        deviceContainer.addLeagueToObseve(device3, ELeague.PIERWSZA);
        deviceContainer.addLeagueToObseve(device4, ELeague.PIERWSZA);
        deviceContainer.addLeagueToObseve(device4, ELeague.DRUGA);
        deviceContainer.addLeagueToObseve(device4, ELeague.DRUGA);
        deviceContainer.removeLeagueFromObserved(device4, ELeague.DRUGA);

        deviceContainer.printDevicesAndLeagues();


    }
}
