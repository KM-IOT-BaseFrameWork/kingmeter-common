package com.kingmeter.common;

import net.logstash.logback.marker.LogstashBasicMarker;

/**
 * @description: mark log,make recording log convenient for elk
 * @author: crazyandy
 */
public class KingMeterMarker extends LogstashBasicMarker {
    public KingMeterMarker(String name){
        super("KingMeter");
        if(!name.contains(",")){
            this.add(new LogstashBasicMarker(name));
        }else{
            for (String tmp:name.split(",")){
                this.add(new LogstashBasicMarker(tmp));
            }
        }
    }
}
