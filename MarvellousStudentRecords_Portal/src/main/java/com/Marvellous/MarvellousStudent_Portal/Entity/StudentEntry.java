package com.Marvellous.MarvellousStudent_Portal.Entity;

public class StudentEntry
{
    private long rollno;
    private  String name;
    private  int marks;
    private  String city;

    public long getRollno()
    {
        return rollno;
    }

    public void setRollno(long rollno)
    {
        this.rollno = rollno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMarks()
    {
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
}
