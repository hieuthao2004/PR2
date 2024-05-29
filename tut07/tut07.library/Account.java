/**
 * Account
 */
public class Account {
    private String acc;
    private int ID;
    private String password;
    private Status status;
    private Person person;

    public Account(String acc, int ID, String password, Status status, Person person) throws Exception {
        this.ID = ID;
        this.password = password;
        this.status = status;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getAcc() + " " + getID() + " " + getPassword() + " " + getStatus();
    }

    //validation
    public boolean validAcc() throws Exception {
        if ((acc == null) || (acc.isEmpty())) {
            return false;
        } else return (acc.equals("Member")) || (acc.equals("Librarian"));
    }
    
}