package com.example.myapplication

open class Flight(
    val flightInfo: FlightInfo,
    val scheduledTime: String,
    var changedTime: String,
    val coopFlightCodes: List<String>,
    var flightStatus: String,
    private val flightCreatedTime: String,
    private val updatedTIme: String,
)

data class FlightInfo(
    val id: String,
    val airplaneUniqueCode: String,
    val airlineCode: String,
    val flightCode: String
)

class DepartureFlight(
    flightInfo: FlightInfo, // cceb7393ccc846c19c01825eb3da0
    scheduledTime: String,
    changedTime: String,
    val destination: String,
    coopFlightCodes: List<String>,
    var checkinCounters: List<String>,
    var gateNumber: Int,
    flightStatus: String,
    flightCreatedTime: String,
    updatedTIme: String,
) : Flight(
    flightInfo,
    scheduledTime,
    changedTime,
    coopFlightCodes,
    flightStatus,
    flightCreatedTime,
    updatedTIme
) {

}

class ArrivalFlight(
    private val id: String, // cceb7393ccc846c19c01825eb3da0
    private val airplaneUniqueCode: String, // HL7080
    val scheduledTime: String,
    var changedTime: String,
    val from: String,
    val airlineCode: String,
    val flightCode: String,
    val coopFlightCodes: List<String>,
    var flightStatus: String,
    private val flightCreatedTime: String,
    private val updatedTIme: String,
)


// 인천-도쿄 가는 항공편 대한항공
// 대한항공과 협력하는 일본항공회사가
// 대한항공 편의 티켓을 파는것