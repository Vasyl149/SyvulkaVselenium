package fileReader;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

import static config.ConfigManager.conf;

// isn't used, should be removed
public class Reader {
    BufferedReader fileReader;
    List<String> menuListFile;

    public List<String> readFile() {
        try {

            fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(conf().menuListFilePath()), "UTF-8"));
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        menuListFile = bufferedReader.lines().collect(Collectors.toList());
        return menuListFile;
    }

}
