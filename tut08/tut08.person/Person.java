import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Person
 */
public class Person {

    private int id;
    private String name;
    private String dateOfBirth;
    private String email;
    private String tel;
    private String address;

    public Person(int id, String name, String dateOfBirth, String email, String tel, String address) throws Exception {
        if (!isValidName(name)) {
            throw new Exception("Invalid name");
        }

        if (!isValidDoB(dateOfBirth)) {
            throw new Exception("Invalid DOB");
        }

        if (!isValidTel(tel)) {
            throw new Exception("Invalid telephone number");
        }

        if (!isValidEmail(email)) {
            throw new Exception("Invalid email");
        }

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name.trim();
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws Exception {
        if (isValidDoB(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth.trim();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email.trim();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return getId() + " " + getName() + " " + getDateOfBirth() + " " + getEmail() + " " + getTel() + " " + getAddress();
    }


    // //Data validation
    public boolean isValidName(String name) {
        String regex = "[a-zA-Z\s]+";
        if (name.trim().matches(regex)) {
            return true;
        } else if ((name == null) || (name.trim() == "") || (name.trim() == " ")) {
            return false;
        }
         else {
            return false;
        }
    }

    public boolean isValidDoB(String dateOfBirth) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateOfBirth);
            return true;
        } catch (Exception e) {
            System.out.println("error parsing date: " + e.getMessage());
            return false;
        }
    }

    public boolean isValidTel(String tel) {
        String regex = "[0-9]+";
        if (tel.matches(regex)) {
            if ((tel.length() <= 12) && (tel.length() >= 10)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
        Matcher matcher = pattern.matcher(email.trim());
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        } else {
            return false;
        }
    }
}