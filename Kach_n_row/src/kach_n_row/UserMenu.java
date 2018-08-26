package kach_n_row;

import java.io.IOException;

public class UserMenu {


    public static void start(UserData user) throws IOException { //метод диалогового взаимодействия с пользователем

        String command;
        Training thisTraining;

        do {
            command = null;
            System.out.println("Введите команду: ");
            command = BeginWorkMenu.inPut();
            switch (command) {
                case "Training": {
                    System.out.println("Введите тип тренировки:");
                    String Type = BeginWorkMenu.inPut();
                   thisTraining = TrainingFactory.trainingFactory(Type);
                   user.addTraining(thisTraining);
                    break;
                }
                case "save": {
                    System.out.println("Saving...");
                    BeginWorkMenu.save(user);
                    break;
                }
                case "close": {
                    System.out.println("Close programm.");
                    BeginWorkMenu.close();

                    break;
                }

                default: {
                    break;
                }
            }
        } while (!command.equals("close"));
    }

}
