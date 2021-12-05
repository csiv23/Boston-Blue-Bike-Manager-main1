import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


enum paymentMethod {
  KEY, CREDITCARD;
}
@Entity
@Table(name = "stations")
public class Station {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private double lat;
  private double externalID;
  private Integer capacity;
  private Integer stationID;
  private double lon;
  private List<EightdStationServices> stationsServices;
  private String stationType;
  private List<paymentMethod> rentalMethods;
  private boolean electricBikeSubchargeWaiver;
  private String rentalURL;
  private Integer regionID;
  private boolean hasKiosk;
  private String name;
  private String shortName;
  private int legacyID;
  private boolean eightdHasKeyDispenser;

  @OneToMany(mappedBy = "BikeBelonging")
  @JsonIgnore
  private List<Bike> stationBikes;

  @OneToMany(mappedBy = "RentalMethodsBy")
  @JsonIgnore
  private List<RentalMethods> rentalMethods;

  @OneToMany(mappedBy = "EightdStationServicesBy")
  @JsonIgnore
  private List<EightdStationServices> eightdStationServicesList;

  @ManyToOne(mappedBy = "regionsBy")
  @JsonIgnore
  private List<Region> regionList;

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getExternalID() {
    return externalID;
  }

  public void setExternalID(double externalID) {
    this.externalID = externalID;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Integer getStationID() {
    return stationID;
  }

  public void setStationID(Integer stationID) {
    this.stationID = stationID;
  }

  public double getLon() {
    return lon;
  }

  public void setLon(double lon) {
    this.lon = lon;
  }

  public List<EightdStationServices> getStationsServices() {
    return stationsServices;
  }

  public void setStationsServices(List<EightdStationServices> stationsServices) {
    this.stationsServices = stationsServices;
  }

  public String getStationType() {
    return stationType;
  }

  public void setStationType(String stationType) {
    this.stationType = stationType;
  }

  public List<paymentMethod> getRentalMethods() {
    return rentalMethods;
  }

  public void setRentalMethods(List<paymentMethod> rentalMethods) {
    this.rentalMethods = rentalMethods;
  }

  public List<EightdStationServices> getEightdStationServicesList() {
    return eightdStationServicesList;
  }

  public void setEightdStationServicesList(List<EightdStationServices> eightdStationServicesList) {
    this.eightdStationServicesList = eightdStationServicesList;
  }

  public List<Region> getRegionList() {
    return regionList;
  }

  public void setRegionList(List<Region> regionList) {
    this.regionList = regionList;
  }

  public boolean isElectricBikeSubchargeWaiver() {
    return electricBikeSubchargeWaiver;
  }

  public void setElectricBikeSubchargeWaiver(boolean electricBikeSubchargeWaiver) {
    this.electricBikeSubchargeWaiver = electricBikeSubchargeWaiver;
  }

  public String getRentalURL() {
    return rentalURL;
  }

  public void setRentalURL(String rentalURL) {
    this.rentalURL = rentalURL;
  }

  public Integer getRegionID() {
    return regionID;
  }

  public void setRegionID(Integer regionID) {
    this.regionID = regionID;
  }

  public boolean isHasKiosk() {
    return hasKiosk;
  }

  public void setHasKiosk(boolean hasKiosk) {
    this.hasKiosk = hasKiosk;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public int getLegacyID() {
    return legacyID;
  }

  public void setLegacyID(int legacyID) {
    this.legacyID = legacyID;
  }

  public boolean isEightdHasKeyDispenser() {
    return eightdHasKeyDispenser;
  }

  public void setEightdHasKeyDispenser(boolean eightdHasKeyDispenser) {
    this.eightdHasKeyDispenser = eightdHasKeyDispenser;
  }

  public List<Bike> getStationBikes() {
    return stationBikes;
  }

  public void setStationBikes(List<Bike> stationBikes) {
    this.stationBikes = stationBikes;
  }
}