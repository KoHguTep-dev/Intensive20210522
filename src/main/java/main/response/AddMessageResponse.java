package main.response;

import java.util.Date;

public class AddMessageResponse {
    private boolean result;
    private String time;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
