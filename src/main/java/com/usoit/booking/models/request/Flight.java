package com.usoit.booking.models.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.usoit.booking.models.Departure;
import com.usoit.booking.models.Identifier;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "id",
    "FlightRef",
    "distance",
    "stops",
    "duration",
    "carrier",
    "number",
    "operatingCarrier",
    "operatingCarrierName",
    "equipment",
    "Identifier",
    "Departure",
    "Arrival",
    "IntermediateStop"
})
public class Flight {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("FlightRef")
    private String flightRef;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("stops")
    private Integer stops;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("carrier")
    private String carrier;
    @JsonProperty("number")
    private String number;
    @JsonProperty("operatingCarrier")
    private String operatingCarrier;
    @JsonProperty("operatingCarrierName")
    private String operatingCarrierName;
    @JsonProperty("equipment")
    private String equipment;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("Departure")
    private Departure departure;
    @JsonProperty("Arrival")
    private Arrival arrival;
    @JsonProperty("IntermediateStop")
    private List<IntermediateStop> intermediateStop = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Flight() {
    }

    /**
     * 
     * @param operatingCarrier
     * @param flightRef
     * @param operatingCarrierName
     * @param departure
     * @param number
     * @param equipment
     * @param type
     * @param id
     * @param stops
     * @param distance
     * @param duration
     * @param intermediateStop
     * @param arrival
     * @param carrier
     * @param identifier
     */
    public Flight(String type, String id, String flightRef, Integer distance, Integer stops, String duration, String carrier, String number, String operatingCarrier, String operatingCarrierName, String equipment, Identifier identifier, Departure departure, Arrival arrival, List<IntermediateStop> intermediateStop) {
        super();
        this.type = type;
        this.id = id;
        this.flightRef = flightRef;
        this.distance = distance;
        this.stops = stops;
        this.duration = duration;
        this.carrier = carrier;
        this.number = number;
        this.operatingCarrier = operatingCarrier;
        this.operatingCarrierName = operatingCarrierName;
        this.equipment = equipment;
        this.identifier = identifier;
        this.departure = departure;
        this.arrival = arrival;
        this.intermediateStop = intermediateStop;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("FlightRef")
    public String getFlightRef() {
        return flightRef;
    }

    @JsonProperty("FlightRef")
    public void setFlightRef(String flightRef) {
        this.flightRef = flightRef;
    }

    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @JsonProperty("stops")
    public Integer getStops() {
        return stops;
    }

    @JsonProperty("stops")
    public void setStops(Integer stops) {
        this.stops = stops;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("operatingCarrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operatingCarrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("operatingCarrierName")
    public String getOperatingCarrierName() {
        return operatingCarrierName;
    }

    @JsonProperty("operatingCarrierName")
    public void setOperatingCarrierName(String operatingCarrierName) {
        this.operatingCarrierName = operatingCarrierName;
    }

    @JsonProperty("equipment")
    public String getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("Departure")
    public Departure getDeparture() {
        return departure;
    }

    @JsonProperty("Departure")
    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    @JsonProperty("Arrival")
    public Arrival getArrival() {
        return arrival;
    }

    @JsonProperty("Arrival")
    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("IntermediateStop")
    public List<IntermediateStop> getIntermediateStop() {
        return intermediateStop;
    }

    @JsonProperty("IntermediateStop")
    public void setIntermediateStop(List<IntermediateStop> intermediateStop) {
        this.intermediateStop = intermediateStop;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
