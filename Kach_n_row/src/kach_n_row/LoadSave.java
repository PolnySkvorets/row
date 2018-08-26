package kach_n_row;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.nio.file.Path;

public class LoadSave implements Serializable {

    public void save(File file){
        try {
            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

}
