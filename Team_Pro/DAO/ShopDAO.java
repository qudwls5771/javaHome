package DAO;

import DTO.ShopDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
                                        //코드는 시퀀스로 설정
        String sql = "insert into shopping values(시퀀스.nextVal, ?, ?, ?, ?, SYSDATE)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            //conn = 디비연결 클래스.getConnection();
            //pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s.getName());
            pstmt.setString(2, s.getAddress());
            pstmt.setInt(3, s.getPrice());
            pstmt.setString(4, s.getPicture());
        }catch (NullPointerException e){ // 잘찾아 들어갔나?
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //디비 넣어야댐  사용하고 닫아준다.
            //디비연결 클래스.clase(conn, pstmt);
        }
    }
    // 수정
    public void update_shop(ShopDTO s) {
        String sql = "update shopProduct set name=?, address = ?, price=?, picture=? where code=?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //conn = DBManager.getConnection();
           // pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s.getName());
            pstmt.setString(2, s.getAddress());
            pstmt.setInt(3, s.getPrice());
            pstmt.setString(4, s.getPicture());
            pstmt.setInt(6, s.getCode_s());
            pstmt.executeUpdate();// 쿼리문 실행한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          //  DBManager.close(conn, pstmt);
        }
    }

    public void delete_shop(String code_S){
        String sql = "delete shopProduct where code=?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //conn = DBManager.getConnection();
            //pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, code_S);
            pstmt.executeUpdate();// 쿼리문 실행
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //DBManager.close(conn, pstmt);
        }
    }



}
