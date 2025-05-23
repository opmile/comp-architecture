package org.architech.services;

import org.architech.model.Architecture;
import org.architech.utils.CalculatorUtils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArchitectureController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArchitectureRepository repository = new ArchitectureRepository();

    public void run() throws InputMismatchException {

        int op = 1;
        do {
            try {
                System.out.println("===== Arch Tech System Control =====");
                System.out.println("1 - Register new architecture");
                System.out.println("2 - List all architectures");
                System.out.println("0 - Exit");
                System.out.println("=====================================");

                op = scanner.nextInt();

                switch (op) {
                    case 1 -> register();
                    case 2 -> list();
                }
            } catch (NumberFormatException e) {
                System.out.println("Input format not expected");
            }
        } while (op != 0);

    }

    public static void register() {
        Architecture a = new Architecture();

        System.out.print("Processor Type (ARM, x86): ");
        a.setProcessorType(scanner.nextLine());

        System.out.print("Buswidth (bits): ");
        a.setBusWidthBits(scanner.nextInt());

        System.out.print("Busfrequency (MHz): ");
        a.setBusFrequencyHz(scanner.nextDouble());

        System.out.print("Number of connected devices: ");
        a.setDeviceCount(scanner.nextInt());

        System.out.print("Cycles per Transfer: ");
        a.setCyclesPerTransfer(scanner.nextInt());

        CalculatorUtils.displayResults(a);
        List<Architecture> list = repository.load();
        list.add(a);
        repository.save(list);
    }

    public static void list() {
        repository.findAll();
    }
}
