package DAO;

import DTO.ShopDTO;

import java.util.ArrayList;
import java.util.List;

public class ShopDAO {

    List<ShopDTO> shopDTO = new ArrayList<ShopDTO>();

    private ShopDAO(){}
    private static ShopDAO instance = new ShopDAO();
    public static ShopDAO getInstancce(){
        return instance;
    }

    public void insert_S(ShopDTO s){
        String sql = "insert into shopping values()";
    }




    
}
