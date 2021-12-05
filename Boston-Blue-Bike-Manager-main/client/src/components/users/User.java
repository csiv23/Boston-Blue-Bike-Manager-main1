import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

enum Membership {
  CHILD, STUDENT, SENIOR, ADULT
}

public class Date {

  String month,
  String day,
  String year,

  public Date(String month, String day, String year) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public String toString() {
    //2/23/2002
    return month + "/" + day + "/" + year;
  }
}

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;
  private String firstName;
  private String lastName;
  private String username;
  private String password;
  private String email;
  private Date dateOfBirth;
  private Membership membership;
  @OneToOne(mappedBy = "isRiding")
  @JsonIgnore
  private List<Bike> bikes;

  public List<Like> getBikes() {
    return bikes;
  }

  public void setBikes(List<Bike> bikes) {
    this.bikes = bikes;
  }

  public List<Bikes> getBikes() {
    return bikes;
  }

  public void setBikes(List<Bikes> bikes) {
    this.bikes = bikes;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDateOfBirth() {return dateOfBirth;}

  public void setDateOfBirth(Date birthdate) { this.dateOfBirth = birthdate;}

  public Membership getMembership() {return membership;}

  public void setMembership(Membership newMembership) { this.membership = newMembership;}

}
