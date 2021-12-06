import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "eightd_station_services")
class EightdStationServices {
  private Integer serviceID;
  private Integer stationID;
  private String service;
  @ManyToOne(mappedBy = "stationsServiced")
  @JsonIgnore
  private List<Station> stations;

  public Integer getServiceID() {
    return serviceID;
  }

  public void setServiceID(Integer serviceID) {
    this.serviceID = serviceID;
  }

  public Integer getStationID() {
    return stationID;
  }

  public void setStationID(Integer stationID) {
    this.stationID = stationID;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public List<Station> getStations() {
    return stations;
  }

  public void setStations(List<Station> stations) {
    this.stations = stations;
  }






  }


