package AULAS.MARATONAJAVA.INTRODUCAO.Minterfaces.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Minterfaces.domain.DataLoader;
import AULAS.MARATONAJAVA.INTRODUCAO.Minterfaces.domain.DatabaseLoader;
import AULAS.MARATONAJAVA.INTRODUCAO.Minterfaces.domain.FileLoader;

public class DataLoadeTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
