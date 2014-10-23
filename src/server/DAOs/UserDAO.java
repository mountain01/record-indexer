package server.DAOs;

import server.models.User;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Matt on 10/22/2014.
 */
public class UserDAO {
    /**
     *
     * @return list of all Users
     */
    public ArrayList<User> getUsers(){

        ArrayList<User> result = new ArrayList<User>();
        String query = "SELECT * FROM user";
        Connection con = null;
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setCurrbatch(rs.getInt("currbatch"));
                u.setEmail(rs.getString("email"));
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setPassword(rs.getString("password"));
                u.setUsername(rs.getString("username"));
                u.setRecordcount(rs.getInt("recordcount"));

                result.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    };

    /**
     *
     * @param newUser
     */
    public void addUser(User newUser){
        String query = "INSERT INTO user (username,password,firstname,lastname,currbatch,recordcount,email) VALUES(?,?,?,?,?,?,?)";
        Connection con = null;
        try {
            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1,newUser.getUsername());
            statement.setString(2,newUser.getPassword());
            statement.setString(3,newUser.getFirstname());
            statement.setString(4,newUser.getLastname());
            statement.setInt(5,newUser.getCurrbatch());
            statement.setInt(6,newUser.getRecordcount());
            statement.setString(7,newUser.getEmail());

            if (statement.executeUpdate() == 1) {
                Statement keyStmt = con.createStatement();
                ResultSet keyRS = keyStmt.executeQuery("select last_insert_rowid()");
                keyRS.next();
                int id = keyRS.getInt(1);
                newUser.setUserid(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    };

    /**
     *
     * @param myUser
     */
    public void updateUser(User myUser){

        String query = "UPDATE user SET username=?,password=?,firstname=?,lastname=?,currbatch=?,recordcount=?,email=? WHERE userid=?";
        Connection con = null;
        try {
            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1,myUser.getUsername());
            statement.setString(2,myUser.getPassword());
            statement.setString(3,myUser.getFirstname());
            statement.setString(4,myUser.getLastname());
            statement.setInt(5,myUser.getCurrbatch());
            statement.setInt(6,myUser.getRecordcount());
            statement.setString(7,myUser.getEmail());
            statement.setInt(8,myUser.getUserid());

            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    };
}
