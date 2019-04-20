package Lottery;

/**
 * This class represents a user to be selected in the lottery
 * @author Mark Chen
 */
public class User {

    private String username;
    private String email;

    /**
     * Constructs a new account
     * @param username account username
     * @param email account email address
     */
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    /**
     * Returns the account holder's username
     * @return the account holder's username.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Sets the username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the account holder's email
     * @return the account holder's email.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Sets the email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

}


