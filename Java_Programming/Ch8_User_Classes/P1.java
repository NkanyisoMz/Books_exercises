// The class Clock given in the chapter only allows the time to be 
//incremented by one second, one minute, or one hour. Rewrite the definition of
// the class Clock by including additional members so that time can also be
// decremented by one second, one minute, or one hour. Also write a program
// to test your class

public class Main {
    public static void main(String[] args){

        Roman roman1 = new Roman("MCXIV");
        roman1.print(); 

        Roman roman2 = new Roman("CCCLIX");
        roman2.print(); 

        Roman roman3 = new Roman("MDCLXVI");
        roman3.print(); 

    }}

public class Clock {
    private int hr; //store hours
    private int min; //store minutes
    private int sec; //store seconds
  
    public Clock()
    {
        setTime(0, 0, 0);
    }

    
    public Clock(int hours, int minutes, int seconds)
    {
        setTime(hours, minutes, seconds);
    }

    
    public void setTime(int hours, int minutes, int seconds)
    {
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;
        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;
        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

    public int getHours()
    {
        return hr;
    }


    public int getMinutes()
    {
        return min;
    }

    
    public int getSeconds()
    {
        return sec;
    }


    public void printTime()
    {
        if (hr < 10)
            System.out.print("0");
        System.out.print(hr + ":");
        if (min < 10)
            System.out.print("0");
        System.out.print(min + ":");
        if (sec < 10)
            System.out.print("0");
        System.out.print(sec);
    }

    public void incrementSeconds()
    {
        sec++;
        if (sec > 59)
        {
            sec = 0;
            incrementMinutes(); //increment minutes
        }
    }

    public void decrementSeconds()
    {
        sec--;
        if (sec < 0)
        {
            sec = 59;
            decrementMinutes();
        }
    }
    
    public void incrementMinutes()
    {
        min++;
        if (min > 59)
        {
            min = 0;
            incrementHours(); //increment hours
        }
    }

    public void decrementMinutes()
    {
        min--;
        if (min < 0)
        {
            min = 59;
            decrementHours();
        }
    }
 
    public void incrementHours()
    {
        hr++;
        if (hr > 23)
            hr = 0;
    }

    public void decrementHours()
    {
        hr--;
        if (hr < 0)
            hr = 23;
    }
    
    public boolean equals(Clock otherClock)
    {
        return (hr == otherClock.hr
                && min == otherClock.min
                && sec == otherClock.sec);
    }

    
    public void makeCopy(Clock otherClock)
    {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }


    public Clock getCopy()
    {
        Clock temp = new Clock();
        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;
        return temp;
    }
}
