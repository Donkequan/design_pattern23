package com.pattern.flyweight;

import java.util.HashMap;

public class WebsiteFactory {

    private HashMap<String, AbstractWebsite> hashMap = new HashMap<String, AbstractWebsite>();

    public AbstractWebsite getWebsite(String type){
        if(!hashMap.containsKey(type)){
            hashMap.put(type, new ConcreteWebsite(type));
        }
        return hashMap.get(type);
    }

    public int getCount(){
        return hashMap.size();
    }

}
