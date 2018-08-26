package kach_n_row;

import java.io.File;
import java.io.Serializable;
import java.util.*;
//класс пользователя


public class UserData implements Serializable {


    private String name;
    private String secondName;
    private String birthDate;
    private String sex;
    private Map<Date, Integer> weight =new HashMap<Date, Integer>();
    private TreeSet<Training> yoursTrainings = new TreeSet<Training>();
    File userFile;


        public UserData()  {
            System.out.println("Укажите свое имя: ");
            name = BeginWorkMenu.inPut();
            System.out.println("Укажите свою фамилию: ");
            secondName = BeginWorkMenu.inPut();
            System.out.println("Укажите свою дату рождения: ");
            birthDate = BeginWorkMenu.inPut();
            System.out.println("Укажите свой пол: ");
            sex = BeginWorkMenu.inPut();
            setWeight();
            userFile = new File("user.dat");
        }



        public void setWeight(){
        Date thisDate = new Date();
        System.out.println("Введите свой вес: ");
        int thisWeight = Integer.parseInt(BeginWorkMenu.inPut());
        try{
        weight.put(thisDate, thisWeight);}
        catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("ошибка добавления элемента словаря");
        }
        }

        public void addTraining(Training newTraining){

            try {
            yoursTrainings.add(newTraining);}
            catch(NullPointerException e){
                e.printStackTrace();
                System.out.println("ошибка добавления элемента множества(новой тренировки)");
            }
        }


}

