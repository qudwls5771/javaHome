public class ShopDAO {
    private ShopDAO(){}
    private static ShopDAO instance = new ShopDAO();
    public static ShopDAO getInstancce(){
        return instance;
    }
}
