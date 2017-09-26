package Daddy;

import asg.cliche.Command;
import asg.cliche.Param;

public class Reminder extends Note {
    private String time;


    @Command
    public String getTime() {
        return time;
    }

    @Command
    public void setTime(@Param(name = "time") String time) {
        this.time = time;
    }

    @Override
    public boolean contains(String str) {
        String strLower = str.toLowerCase();
        if (super.contains(str)) {
            return true;
        } else if (time.toLowerCase().contains(strLower)){
            return true;
        }
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

}
