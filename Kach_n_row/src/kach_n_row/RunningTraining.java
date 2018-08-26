package kach_n_row;



public class RunningTraining extends Training {
    TrainingType type = TrainingType.RUNNIN;
    private int distanceInMeter = 0;
    private int runningTimeInSeconds = 0;


    public void setDistance(int distanceInMeter){
        this.distanceInMeter = distanceInMeter;
    }

   public void setTime(int runningTimeInSeconds){
        this.runningTimeInSeconds = runningTimeInSeconds;
    }


}
