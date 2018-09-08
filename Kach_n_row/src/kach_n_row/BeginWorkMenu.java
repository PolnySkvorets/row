package kach_n_row;
import  java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//в данном классе находятся все методы для диалогового взаимодействия с пользователем


public class BeginWorkMenu extends JFrame{

   public BeginWorkMenu(){
        super("Row and kach: Begin work menu");
        setBounds(200,200,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JButton load;
    JButton save;
    JButton new_button;
    JButton closeButton;



    private static UserData user;

    private static String command;


    public static void startWork() throws IOException { //метод диалогового взаимодействия с пользователем
        BeginWorkMenu bwm = new BeginWorkMenu();
        bwm.setVisible(true);

        do {
            command = null;
            System.out.println("Введите команду: ");
            command = inPut();
            switch (command) {
                case "load": {
                    System.out.println("Loading...");
                    load(user);
                    UserMenu.start(user);
                    break;
                }
                case "save": {
                    System.out.println("Saving...");
                    save(user);
                    break;
                }
                case "close": {
                    System.out.println("Close programm.");
                    close();

                    break;
                }
                case "new": {
                    user = new UserData();
                    UserMenu.start(user);
                    //создание нового пользователя

                    break;
                }
                default: {
                    break;
                }
            }
        } while (!command.equals("close"));
    }



        static String inPut() { // метод ввода символьных команд

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String comm = null;

            try {     // консольный ввод с обработкой исключений
                comm =  reader.readLine();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("произошла непредвиденная ошибка: ошибка ввода");
            }


            return comm;
        }


         static void save(UserData user){  //метод сохранения данных пользователя

        }

         static void load(UserData user){ // метод сохранения данных пользователя

        }



         static void close(){
            System.out.println("Сохранить перед выходом? ( да/нет)");
            String otvet = inPut();
            if(otvet.equals("да")){
                save(user);
            }


        }


}
