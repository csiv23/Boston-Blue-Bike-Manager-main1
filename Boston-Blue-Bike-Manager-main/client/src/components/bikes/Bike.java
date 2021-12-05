import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "bikes")
public class Bike {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer bikeID;
  private boolean inUse;
  private Integer lastRider;
  private Integer stationID;

  @OneToOne(mappedBy = "usedBy")
  @JsonIgnore
  private List<User> users;


  public Integer getBikeID() {
    return bikeID;
  }

  public void setBikeID(Integer bikeID) {
    this.bikeID = bikeID;
  }

  public boolean isInUse() {
    return inUse;
  }

  public void setInUse(boolean inUse) {
    this.inUse = inUse;
  }

  public Integer getLastRider() {
    return lastRider;
  }

  public void setLastRider(Integer lastRider) {
    this.lastRider = lastRider;
  }

  public Integer getStationID() {
    return stationID;
  }

  public void setStationID(Integer stationID) {
    this.stationID = stationID;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}