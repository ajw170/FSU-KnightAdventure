public class Knight
{
    //Declares the instance variables for the Knight class
    //Note - they are initialized to default null values
    private String  name;
    private int     health;
    private int     numBattles;
    private int     age;
    private int     gold; //the amount of gold pillaged by the night

    //Constructor with no arguments; creates default values
    public Knight ()
    {
        this.name = null;
        this.health = 0;
        this.numBattles = 0;
        this.age = 0;
        this.gold = 0;
    }

    //Knight constructor -- this must be called using the parameters (no default supplied).
    public Knight (String name, int health, int numBattles, int age, int gold)
    {
        this.name       = name;
        this.health     = health;
        this.numBattles = numBattles;
        this.age        = age;
        this.gold       = gold;
    }

    //set the Knight's name
    public void setName(String name)
    {
        this.name = name;
    }

    //set the Knight's health
    public void setHealth(int health)
    {
        this.health = health;
    }

    //set the Knight's battles
    public void setBattles(int battles)
    {
        this.numBattles = battles;
    }

    //set the Knight's age
    public void setAge(int age)
    {
        this.age = age;
    }

    //set the Knight's gold value
    public void setGold(int gold)
    {
        this.gold = gold;
    }

    //Retrieve the Knight's name
    public String getName()
    {
        return this.name;
    }

    //Retrieve the Knight's health value
    public int getHealth()
    {
        return this.health;
    }

    //Retrieve the Knight's battle number
    public int getBattles()
    {
        return this.numBattles;
    }

    //Retrieve the knight's age
    public int getAge()
    {
        return this.age;
    }

    //Retrieve the knight's gold value
    public int getGold()
    {
        return this.gold;
    }

} // class Knight
