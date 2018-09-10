package kach_n_row;
import javax.swing.JFrame;

import java.io.IOException;

public class  Main extends JFrame{

    public Main(){
        super("Row and kach");
        setBounds(200,200,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) throws IOException {

       /* Main window = new Main();
        window.setVisible(true);*/
        BeginWorkMenu.startWork();//в методе  main() будет только запуск метода работы с программой
        // write your code here
    }
}


