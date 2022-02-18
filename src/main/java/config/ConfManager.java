package config;


import org.aeonbits.owner.ConfigCache;

public class ConfManager {

    private ConfManager(){
    }

    public static Configuration conf(){
        return ConfigCache.getOrCreate(Configuration.class);
    }
}
