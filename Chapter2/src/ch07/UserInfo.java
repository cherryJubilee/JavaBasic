package ch07;

public class UserInfo {
    public String userID;
    public String userPassWord;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo(){}

    public UserInfo(String userID, String userPassWord, String userName) {
        this.userID = userID;
        this.userPassWord = userPassWord;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userID + "이고, 등록된 이름은 " + userName + "입니다.";
    }
}
