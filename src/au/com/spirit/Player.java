package au.com.spirit;

/**
 * Created by gs on 18/11/19
 */
public class Player {

    private String firstName;
    private String secondName;
    private int age;
    private int rank;
    private PlayerPosition playerPosition;

    public Player(String firstName, String secondName, int age, int rank, PlayerPosition playerPosition) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.rank = rank;
        this.playerPosition = playerPosition;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", rank=" + rank +
                '}';
    }


}


