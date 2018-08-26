package kach_n_row;
// список гендеров
public enum Sex {
    MEN("Crossfit"), WOMAN("Running"), BATTLE_HELICOPTER("Helicopter");
    private String sex;
    Sex(String s){ sex = s;}

    String getSex() {return sex;}
}
