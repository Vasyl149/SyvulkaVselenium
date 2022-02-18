package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

import static config.ConfManager.conf;

public class Reader {
    FileReader fileReader;
    List<String> menuListFile;

    public List<String> readFile() {
        try {
            fileReader = new FileReader(conf().menuListFilePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        menuListFile = bufferedReader.lines().collect(Collectors.toList());
        return menuListFile;
    }

}
