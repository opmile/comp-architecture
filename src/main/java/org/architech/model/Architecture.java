package org.architech.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Architecture {
    private String processorType;
    private int busWidthBits;
    private double busFrequencyHz;
    private int deviceCount;
    private int cyclesPerTransfer;
    private double lossRate;

    public Architecture(String processorType, int busWidthBits, double busFrequencyHz, int deviceCount, int cyclesPerTransfer, double lossRate) {
        this.processorType = processorType;
        this.busWidthBits = busWidthBits;
        this.busFrequencyHz = busFrequencyHz;
        this.deviceCount = deviceCount;
        this.cyclesPerTransfer = cyclesPerTransfer;
        this.lossRate = lossRate;
    }

    public Architecture() {}

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getBusWidthBits() {
        return busWidthBits;
    }

    public void setBusWidthBits(int busWidthBits) {
        this.busWidthBits = busWidthBits;
    }

    public double getBusFrequencyHz() {
        return busFrequencyHz;
    }

    public void setBusFrequencyHz(double busFrequencyHz) {
        this.busFrequencyHz = busFrequencyHz;
    }

    public int getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
    }

    public int getCyclesPerTransfer() {
        return cyclesPerTransfer;
    }

    public void setCyclesPerTransfer(int cyclesPerTransfer) {
        this.cyclesPerTransfer = cyclesPerTransfer;
    }

    public double getLossRate() {
        return lossRate;
    }

    public void setLossRate(double lossRate) {
        this.lossRate = lossRate;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
