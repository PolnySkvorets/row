package kach_n_row;

import java.util.Date;
/*
* класс Training определяет основу создания наследующих классов
*в нем содержатся переменные , которые определяются с помощью соответствующих методов
* хранят в себе данные типа Date, для записи в календарь событий, для расчета времени тренировки с вычетом времени паузы
* */
public class Training implements doTraining {
    private Date dateStart;
    private Date dateEnd;
    private Date datePaused;
    private Date dateReturned;

    public static void trainingBegin(){ // метод, определяющий общее начало тренировки

    }
    public void trainingTimeStart(){// метод задающий время и дату начала тренировки
        dateStart =  new Date();
    }

    public static void trainingMakeRound(Training t){ // метод , добавляющий новый подход или этап тренировки

    }
    public void trainingEnd(){  //метод, задающий дату и время окончания тренировки
        this.dateEnd =  new Date();
    }
    public void trainingPaused(){ //метод , задающий время приостановки тренировки
        this.datePaused =  new Date();
    }
    public void trainingReturned(){
        this.dateReturned = new Date();
    }


}
