import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rental_methods")
public class RentalMethods {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer methodID;
  private Integer stationID;
  private String method;

  @ManyToOne(mappedBy = "relatedRentalStations")
  @JsonIgnore
  private List<Station>relatedRentalStations;

  public Integer getMethodID() {
    return methodID;
  }

  public void setMethodID(Integer methodID) {
    this.methodID = methodID;
  }

  public Integer getStationID() {
    return stationID;
  }

  public void setStationID(Integer stationID) {
    this.stationID = stationID;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public List<Station> getRelatedRentalStations() {
    return relatedRentalStations;
  }

  public void setRelatedRentalStations(List<Station> relatedRentalStations) {
    this.relatedRentalStations = relatedRentalStations;
  }
}