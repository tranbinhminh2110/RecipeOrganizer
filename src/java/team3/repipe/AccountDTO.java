/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.repipe;

/**
 *
 * @author AS
 */
public class AccountDTO {
    private int planID;
    private int userID;
    private String userName;
    private String password;
    private String fullName;
    private long phone;
    private int status;
    private int role;
    private String token;

    public AccountDTO() {
    }

    public AccountDTO(int planID, int userID, String userName, String password, String fullName, long phone, int status, int role, String token) {
        this.planID = planID;
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.token = token;
    }

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "AccountDTO{" + "planID=" + planID + ", userID=" + userID + ", userName=" + userName + ", password=" + password + ", fullName=" + fullName + ", phone=" + phone + ", status=" + status + ", role=" + role + ", token=" + token + '}';
    }
    
}
