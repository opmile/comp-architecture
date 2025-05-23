package org.architech.utils;

import org.architech.model.Architecture;

public class CalculatorUtils {

    public static double calculateTheoreticalBandwidth(Architecture arch) {
        return arch.getBusWidthBits() * arch.getBusFrequencyHz();
    }

    public static double calculateEstimatedLatency(Architecture arch) {
        return (double) (arch.getCyclesPerTransfer() * arch.getDeviceCount()) / arch.getBusFrequencyHz();
    }

    public static double calculateEffectiveBandwidth(Architecture arch) {
        double efficiency = 1.0 / (1.0 + arch.getLossRate());
        return calculateTheoreticalBandwidth(arch) * efficiency;
    }

    public static void displayResults(Architecture arch) {
        double bandwidth = CalculatorUtils.calculateTheoreticalBandwidth(arch);
        double latency = CalculatorUtils.calculateEstimatedLatency(arch);
        double effectiveBandwidth = CalculatorUtils.calculateEffectiveBandwidth(arch);

        System.out.println("===== System Results =====");
        System.out.println("Processor Type: " + arch.getProcessorType());
        System.out.println("Bus Width: " + arch.getBusWidthBits() + " bits");
        System.out.println("Bus Frequency: " + arch.getBusFrequencyHz() + " Hz");
        System.out.println("Connected Devices: " + arch.getDeviceCount());
        System.out.println("Cycles per Transfer: " + arch.getCyclesPerTransfer());
        System.out.println("----------------------------");
        System.out.println("Theoretical Bandwidth: " + bandwidth + " bps");
        System.out.println("Estimated Latency: " + latency + " seconds");
        System.out.println("Effective Bandwidth: " + effectiveBandwidth + " bps");
        System.out.println("===========================");
    }
}
