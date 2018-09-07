package kach_n_row;
import  java.io.*;

//в данном классе находятся все методы для диалогового взаимодействия с пользователем


public class BeginWorkMenu {

    private static UserData user;

    private static String command;


    public static void startWork() throws IOException { //метод диалогового взаимодействия с пользователем



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
