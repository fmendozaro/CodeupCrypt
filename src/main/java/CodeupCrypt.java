public class CodeupCrypt {
    private String password;
    private String hash;

    public CodeupCrypt(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getHash() {
        return "str0ngP4ss";
    }
}
