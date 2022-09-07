package mementoPattern.operatingSystem;

import java.util.Date;

public class OperatinSystem {

    private int backupNumber = 0;
    private Date backupDate;
//zapisanie aktualnego stanu z data
    public void createBackup(){
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Backup nr: " + this.backupNumber + ", on " + this.backupDate);
    }

    //metody zapisu i odczytu uzywajace memento
    public OperatingSystemMemento save(){
        return new OperatingSystemMemento(this.backupNumber,this.backupDate);
        //utworzono obiekt memento w ktory wpisano oryginaly numer i data z gł klasy
    }
    //pobieranie z obiektu memento kopii backup number i date
    public void load(OperatingSystemMemento operatingSystemMemento){
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }


}
