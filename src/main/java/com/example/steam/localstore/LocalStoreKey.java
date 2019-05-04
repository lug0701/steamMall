package com.example.steam.localstore;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-05-04
 * @time: 10:55
 */
public class LocalStoreKey {

    private String keyName;

    private long startTime;

    private long expiredTime;

    private static volatile LocalStoreKey FETURED_CAROUSEL_KEY;

    private static volatile LocalStoreKey SPECIAL_CAROUSEL_KEY;

    private LocalStoreKey(String keyName,long startTime,long expiredTime){
        this.keyName=keyName;
        this.startTime=startTime;
        this.expiredTime=expiredTime;
    }

    public static LocalStoreKey FETURED_CAROUSEL_KEY(){
        if (FETURED_CAROUSEL_KEY==null){
            synchronized (LocalStoreKey.class){
                FETURED_CAROUSEL_KEY=new LocalStoreKey("feturedCarousel",System.currentTimeMillis(),1000*30);
                return FETURED_CAROUSEL_KEY;
            }
        }
        return FETURED_CAROUSEL_KEY;
    }

    public static LocalStoreKey SPECIAL_CAROUSEL_KEY(){
        if (SPECIAL_CAROUSEL_KEY==null){
            synchronized (LocalStoreKey.class){
                SPECIAL_CAROUSEL_KEY=new LocalStoreKey("specialCarousel",System.currentTimeMillis(),1000*40);
                return SPECIAL_CAROUSEL_KEY;
            }
        }
        return SPECIAL_CAROUSEL_KEY;
    }



    @Override
    public int hashCode(){
        return keyName.hashCode();
    }

    @Override
    public boolean equals(Object o){
        LocalStoreKey storeKey=(LocalStoreKey)o;
        if (keyName.equals(storeKey.keyName)){
            return true;
        }
        return false;
    }

    public long getExpiredTime() {
        return expiredTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(){
        this.startTime=System.currentTimeMillis();
    }
}