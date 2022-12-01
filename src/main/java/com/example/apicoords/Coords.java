package com.example.apicoords;

import lombok.extern.slf4j.Slf4j;
import javax.persistence.*;

@Slf4j
@Entity
@Table(name = "coords")
public class Coords {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "msg_num")
	private long msgNum;

    @Column(name = "create_date_time")
    private String createDateTime;
	@Column(name = "date_time")
	private String dateTime;
	@Column(name = "id_truck")
	private String idTruck;

	@Column(name = "lat")
	private Double lat;

	@Column(name = "lon")
	private Double lon;

	@Column(name = "trip_number")
	private Long tripNumber;


	public Coords() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMsgNum() {
		return msgNum;
	}

	public void setMsgNum(long msgNum) {
		this.msgNum = msgNum;
	}

	public String getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getIdTruck() {
		return idTruck;
	}

	public void setIdTruck(String idTruck) {
		this.idTruck = idTruck;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Long getTripNumber() {
		return tripNumber;
	}

	public void setTripNumber(Long tripNumber) {
		this.tripNumber = tripNumber;
	}

	public Coords(int msg_num, String create_date_time, String date_time, String id_truck, Double lat, Double lon
				  ,Long tripNumber
	) {
		this.msgNum=msg_num;
		this.createDateTime=create_date_time;
		this.dateTime=date_time;
		this.idTruck=id_truck;
		this.lat=lat;
		this.lon=lon;
		this.tripNumber=tripNumber;
	}


	@Override
	public String toString() {
		return "Coords{" +
				"id=" + id +
				", msgNum=" + msgNum +
				", createDateTime='" + createDateTime + '\'' +
				", dateTime='" + dateTime + '\'' +
				", idTruck='" + idTruck + '\'' +
				", lat=" + lat +
				", lon=" + lon +
				", tripNumber=" + tripNumber +
				'}';
	}
}
