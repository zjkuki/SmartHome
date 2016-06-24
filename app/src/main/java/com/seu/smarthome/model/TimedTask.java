package com.seu.smarthome.model;

import org.json.JSONObject;

/**
 * Created by jwcui on 2016/5/3.
 */
public class TimedTask extends Task {
    public int deviceID;
    public int amount;
    public int startTime;
    public int endTime;
    public int days;

    public static TimedTask fromJSON(JSONObject j){
        TimedTask timedTask = new TimedTask();
        timedTask.taskID = j.optInt("id");
        timedTask.deviceID = j.optInt("deviceid");
        timedTask.taskType = j.optInt("tasktype");
        timedTask.amount = j.optInt("amount");
        timedTask.startTime = j.optInt("starttime");
        timedTask.endTime = j.optInt("endtime");
        timedTask.days = j.optInt("days");
        return  timedTask;
    }

    public String toJSONString(){
        JSONObject j = new JSONObject();
        try {
            j.put("deviceid",deviceID);
            j.put("tasktype",taskType);
            j.put("amount",amount);
            j.put("starttime",startTime);
            j.put("endtime",endTime);
            j.put("days", days);
        }catch(Exception e){
            // ignore
        }
        return j.toString();
    }
}
