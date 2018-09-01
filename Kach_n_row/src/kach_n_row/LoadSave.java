package kach_n_row;

import java.io.*;


public class LoadSave implements Serializable {

    public void save(String file, Object object) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(object);
            }
            catch ( IOException ie){
                ie.printStackTrace();
            }
            finally {
                fos.close();

            }

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

}
