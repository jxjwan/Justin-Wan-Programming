public class Timering {
    private int hour = 0;
    private int minute=0;
    private int second=0;
    
    public int gethour(){
        return hour;
    }
    
    public void sethour(int hour){
        
        int refhour = (hour - 24*(hour/24) + 120)%24; // this mods the input hour by 24
        
        this.hour = refhour;
        
    }
    
    public int getminute(){
        return minute;
    }
    
    public void setminute(int minute){
        
        int refminute = (minute - 60*(minute/60) + 120)%60; // this mods the input minutes by 60
        
        this.minute = refminute;
    }
    
    public int getsecond(){
        return second;
    }
    
    public void setsecond(int second){
        int refsecond = (second - 60*(second/60) + 120)%60; // this mods the input second by 60
        
        this.second = refsecond;
    }
    
    Timering(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
                
        sethour(hour);
        setminute(minute);
        setsecond(second);
    }
    public String Time = "w";
    
    public String toString(){
        String hours;
        String minutes;
        String seconds;
        
        sethour(hour);
        setminute(minute);
        setsecond(second);
        
        if(hour < 10){
            hours = "0"+Integer.toString(hour);
        }else{
            hours = Integer.toString(hour);
        }
        
        if(minute < 10){
            minutes = "0"+Integer.toString(minute);
        }else{
            minutes = Integer.toString(minute);
        }
        
        if(second < 10){
            seconds = "0"+Integer.toString(second);
        }else{
            seconds = Integer.toString(second);
        }
        
        return this.Time = hours+":"+minutes+":"+seconds;
    }
    
    public void carryseconds() {
        
        if(second >= 0){
            for(int t = 0; 60*t <= second; t++){
            second -= 60;
            minute++;
            }
        } else {
            for(int t = 0; 60*t <= -second; t++){
            second += 60;
            minute--;
            }
        }

    }
    public void carryminutes() {
        
        if(minute >= 0){
            for(int t = 0; 60*t <= minute; t++){
            minute -= 60;
            hour++;
            }
        } else {
            for(int t = 0; 60*t <= -minute; t++){
            minute += 60;
            hour--;
            }
        }

    }    
    public void nextSecond(){
        this.second++;
        carryseconds();
        carryminutes();
        sethour(this.hour);
    }
    
    public void previousSecond(){
        this.second--;
        carryseconds();
        carryminutes();
        sethour(this.hour);
    }
}
