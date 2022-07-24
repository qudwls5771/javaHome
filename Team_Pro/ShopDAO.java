public class ShopDAO {

    List<ShopDTO> shopDTO = new ArrayList<ShopDTO>();

    private ShopDAO(){}
    private static ShopDAO instance = new ShopDAO();
    public static ShopDAO getInstancce(){
        return instance;
    }

    
}
