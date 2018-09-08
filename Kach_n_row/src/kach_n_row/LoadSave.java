package kach_n_row;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;



public class LoadSave implements Serializable {

    public void save(String name, Object object)  {/** метод load для сохранения объектов методом сериализации
     */

/*
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(name + ".dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {

    public void save(String file, Object object) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(object);
            }
            catch ( IOException ie){
                ie.printStackTrace();
            }

*/
                


    }
    public Object load(String name) throws IOException {
        if(!(new File(name + ".dat")).exists()) {
            Object object;
            FileInputStream fis = new FileInputStream(name + ".dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                object = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                object = null;
            }
            fis.close();
            ois.close();

            return object;
        }
        else {
            System.out.println(" Файла не существует. Проверьте правильность ввода либо создайте нового пользователя");
            return null;
        }




    }

}
