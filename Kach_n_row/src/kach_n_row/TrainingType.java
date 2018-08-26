package kach_n_row;
// здесь мы получаем
public enum TrainingType {
    CROSSFIT("Crossfit"), RUNNIN("Running"), ROWING("Rowing"), GYM("Gym"), SWIMMING("Swiming");
    private String training_type;
    TrainingType(String s){ training_type = s;}
    String getType() {return training_type;}

}
