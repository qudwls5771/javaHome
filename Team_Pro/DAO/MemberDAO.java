package DAO;

import DTO.MemberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

    private MemberDAO(){}

    private static MemberDAO instance = new MemberDAO();

    public static MemberDAO getInstance(){
        return instance;
    }

    public void insert(MemberDTO m){
        String sql = "insert into member values(?, ?, ?, ?, ?, ? ,? ,? ,?, sysdate,'n')";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            //conn = 디비연결 클래스.getConnection();
            //pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getId());
            pstmt.setString(2, m.getPwd());
            pstmt.setString(3, m.getName());
            pstmt.setString(4, m.getYear());
            pstmt.setString(5, m.getPhone_N());
            pstmt.setString(6, m.getAddress());
            pstmt.setString(7, m.getDog_T());
            pstmt.setString(8, m.getDog_S());
            pstmt.setString(9, m.getDog_D());
        }catch (NullPointerException e){ // 잘찾아 들어갔나?
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //디비 넣어야댐  사용하고 닫아준다.
            //디비연결 클래스.clase(conn, pstmt);
        }

    }
    public void update(MemberDTO m){ //회원정보 수정
        String sql = "update member set pwd =?, name =?, year =?" +
                ", phone_n =?, address =?, dog_T =?, dog_S = ?, dog_D =?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            //conn = 디비연결 클래스.getConnection();
            //pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getPwd());
            pstmt.setString(2, m.getName());
            pstmt.setString(3, m.getPhone_N());
            pstmt.setString(4, m.getAddress());
            pstmt.setString(5, m.getDog_T());
            pstmt.setString(6, m.getDog_S());
            pstmt.setString(7, m.getDog_D());

        }catch (NullPointerException e){ // 잘찾아 들어갔나?
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // (6단계) 사용한 리소스 해제
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } // finally의 끝
    }

    public void D_update(MemberDTO m){
        //삭제를 하는게 아니라 데이터를 null로 바꿔주고 join_M(가입상태 : Y(탈퇴), N(가입))을 y로 바꿔준다.
        //조건에 Where에 ID를 넣어줘서 update를 해준다.
        String sql = "update member set pwd =null, name =null, phone_n =null, " +
                "address =null, dog_T =null, dog_S = null, dog_D =null, join_M = 'y' where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            //conn = 디비연결 클래스.getConnection();
            //pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getPwd());
            pstmt.setString(2, m.getName());
            pstmt.setString(3, m.getPhone_N());
            pstmt.setString(4, m.getAddress());
            pstmt.setString(5, m.getDog_T());
            pstmt.setString(6, m.getDog_S());
            pstmt.setString(7, m.getDog_D());

        }catch (NullPointerException e){ // 잘찾아 들어갔나?
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // (6단계) 사용한 리소스 해제
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } // finally의 끝
    }
    public MemberDTO accountLogin(MemberDTO m){
        MemberDTO mdao = null;
        String sql = "select * from member where id =?, pww =?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            //conn = 디비.getConnection();
            //pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getId());
            pstmt.setString(2, m.getPwd());
            //rs = pstmt.executeQuery(); //빈괄호
            if(rs.next()){
             mdao = new MemberDTO();
             mdao.setId(rs.getString("id"));
             mdao.setPwd(rs.getString("pwd"));
             mdao.setName(rs.getString("name"));
             mdao.setYear(rs.getString("year"));
             mdao.setPhone_N(rs.getString("phone_n"));
             mdao.setAddress(rs.getString("address"));
             mdao.setDog_T(rs.getString("dog_T"));
             mdao.setDog_S(rs.getString("dog_s"));
             mdao.setDog_D(rs.getString("dog_T"));
            }
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mdao;
    }

    public boolean idSearch(String id) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "select * from shopm where id = ?";
         //   conn = DBManager.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
       //     DBManager.close(conn, pstmt, rs);
        }

        return flag;
    }

    public String ForgetLogin(MemberDTO mVo) {
        String sql = "select * from shopm where id=?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String pwd = "x";
        try {
           // conn = DBManager.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mVo.getId());
            rs = pstmt.executeQuery(); // 빈괄호
            if (rs.next()) {
                pwd = rs.getString("pwd");
                return pwd;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pwd;
    }




}
