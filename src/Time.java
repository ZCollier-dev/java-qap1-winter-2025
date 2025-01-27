public class Time {
    //attributes
    private int hour;
    private int minute;
    private int second;

    //methods
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public Time nextSecond(){
        this.second += 1;
        if (this.second >= 60){
            this.second -= 60;
            this.minute += 1;
            if (this.minute >= 60) {
                this.minute -= 60;
                this.hour += 1;
                if (this.hour >= 24){
                    this.hour -= 24;
                }
            }
        }

        return new Time(this.hour, this.minute, this.second);
    }

    public Time previousSecond(){
        this.second -= 1;
        if (this.second < 0){
            this.second += 60;
            this.minute -= 1;
            if (this.minute < 0) {
                this.minute += 60;
                this.hour -= 1;
                if (this.hour < 0){
                    this.hour += 24;
                }
            }
        }

        return new Time(this.hour, this.minute, this.second);
    }
}
