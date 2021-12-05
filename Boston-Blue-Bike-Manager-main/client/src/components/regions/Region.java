import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity@Table(name = "regions")
public class Region {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer regionID;
  private String area;

  @OneToMany(mappedBy = "relatedStations")
  @JsonIgnore
  private List<Station> stations;

  public Integer getRegionID() {
    return regionID;
  }

  public void setRegionID(Integer regionID) {
    this.regionID = regionID;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public List<Station> getStations() {
    return stations;
  }

  public void setStations(List<Station> stations) {
    this.stations = stations;
  }
}