package mementoPattern.operatingSystem;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    //na tym obiekcie beda przeprowadzane operacje

    //lista do przechowywania backupow
    List<OperatingSystemMemento> backups = new ArrayList<>();

    //metody dodawania i wyciagania z listy
    public void addToBackupsList(OperatingSystemMemento operatingSystemMemento){
        backups.add(operatingSystemMemento);
    }
    public OperatingSystemMemento getBackup(int index){
        System.out.println("Backup: " + backups.get(index).toString());
        return backups.get(index);
    }

    public int getListSize(){
        return backups.size();
    }
}
