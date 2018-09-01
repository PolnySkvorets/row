package kach_n_row;

public class TrainingFactory {
    public static Training trainingFactory( String trainingType){
        switch(trainingType){
            case "Running":{
                System.out.println("Вы выбрали беговую тренировку");
                return new RunningTraining();

            }



            default :
                return null;
        }


    }
}
