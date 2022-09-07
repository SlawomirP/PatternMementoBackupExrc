package mementoPattern.operatingSystem;

import java.util.Date;

public class OperatingSystemMemento {

    // blizniacze pola z klasy glownej operatingSystem
    private int backupNumber;
    private Date backupDate;

    //konstruktor do pol

    public OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    //pobranie nr backupu i daty - getery

    public int getBackupNumber() {
        return backupNumber;
    }

    public Date getBackupDate() {
        return backupDate;
    }

    @Override
    public String toString() {
        return "OperatingSystemMemento{" +
                "backupNumber=" + backupNumber +
                ", backupDate=" + backupDate +
                '}';
    }
}
