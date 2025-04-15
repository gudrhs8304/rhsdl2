package ch_08_class_ex.singleton;


import ch_08_class.singleton.Singleton;

public class ShopService {
    private static ShopService singleton = null;


    private ShopService() {}

    public static ShopService getInstance(){
        if (singleton == null){
            singleton = new ShopService();
        }
        return singleton;
    }
}
