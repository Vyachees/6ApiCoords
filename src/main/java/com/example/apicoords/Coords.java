package com.example.apicoords;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import javax.persistence.*;

@Slf4j
@Entity
@Table(name = "coords")
public class Coords {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private long id;

	@Column(name = "msg_num")
	@Getter
	@Setter
	private long msgNum;

    @Column(name = "create_date_time")
	@Getter
	@Setter
    private String createDateTime;

	@Column(name = "date_time")
	@Getter
	@Setter
	private String dateTime;

	@Column(name = "id_truck")
	@Getter
	@Setter
	private String idTruck;

	@Column(name = "lat")
	@Getter
	@Setter
	private Double lat;

	@Column(name = "lon")
	@Getter
	@Setter
	private Double lon;

	@Column(name = "trip_number")
	@Getter
	@Setter
	private Long tripNumber;

}
