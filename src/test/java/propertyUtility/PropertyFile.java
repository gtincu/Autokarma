package propertyUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
        public FileInputStream fileInputStream;
        public Properties properties;

//incarcam fisierul
    public PropertyFile(String path){
        loadFile(path);
    }
//    metoda care incarca
    public void loadFile(String path){
        properties = new Properties();
        try {
            fileInputStream= new FileInputStream("src/test/resources"+path+".properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //        metoda care returneaza o valoare pe baza unei chei
    public String getValue(String key){
            return properties.getProperty(key);
    }

}
