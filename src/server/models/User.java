package server.models;

/**
 * Created by Matt on 10/14/2014.
 */
public class User {
    int userid;
    String firstname;
    String lastname;
    String username;
    String password;
    String recordcount;
    String currbatch;
    String email;

    /**
     * get user id from User
     * @return
     */
    public int getUserid() {
        return userid;
    }

    /**
     * sets user id for User
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * get first name from user
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * set first name for user
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * get user's last name
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * set user's last name
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * get user's username
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set user's username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get user's password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set user's password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * return number of completed records from user
     * @return
     */
    public String getRecordcount() {
        return recordcount;
    }

    /**
     * set number of completed records for user
     * @param recordcount
     */
    public void setRecordcount(String recordcount) {
        this.recordcount = recordcount;
    }

    /**
     * get current batch from user
     * @return
     */
    public String getCurrbatch() {
        return currbatch;
    }

    /**
     * set current batch for user
     * @param currbatch
     */
    public void setCurrbatch(String currbatch) {
        this.currbatch = currbatch;
    }

    /**
     * get email from user
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set email for user
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}