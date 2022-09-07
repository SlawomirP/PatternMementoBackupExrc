package mementoPattern;

import mementoPattern.operatingSystem.OperatinSystem;
import mementoPattern.operatingSystem.OperatingSystemCaretaker;

public class Main {
    public static void main(String[] args) {

        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();

        OperatinSystem operatinSystem = new OperatinSystem();

        operatinSystem.createBackup();

        try {
            Thread.sleep(3000);


        operatinSystem.createBackup();

        Thread.sleep(3000);

        operatingSystemCaretaker.addToBackupsList(operatinSystem.save());
        operatinSystem.createBackup();

        Thread.sleep(3000);

        operatinSystem.createBackup();

        Thread.sleep(3000);

        operatinSystem.createBackup();

        operatinSystem.load(operatingSystemCaretaker.getBackup(0));
        } catch (InterruptedException e) {
        }
    }
}
