public class Stars
{
    //Declares instance variables for class Stars
    private int rows;
    private int columns;

    //Stars constructor - takes no arguments and sets both instance variables to 0
    public Stars()
    {
        this.rows = 0;
        this.columns = 0;
    }

    //constructor that takes starting arguments
    public Stars(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
    }

    //set star rows
    public void setRows(int rows)
    {
        this.rows = rows;
    }

    //set star columns
    public void setColumns(int columns)
    {
        this.columns = columns;
    }

    //retrieve the star rows
    public int getRows()
    {
        return this.rows;
    }

    //retrieve the star columns
    public int getColumns()
    {
        return this.columns;
    }

}
