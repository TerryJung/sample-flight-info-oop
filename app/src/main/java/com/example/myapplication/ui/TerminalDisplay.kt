class TerminalDisplay {
    private val flights = mutableListOf<Flight>()

    fun addFlight(flight: Flight) {
        flights.add(flight)
    }

    fun removeFlight(flightNumber: String) {
        flights.removeIf { it.flightNumber == flightNumber }
    }

    fun updateFlightStatus(licenseePlateNumber: String, newStatus: String) {
        flights.find { it.licenseePlateNumber == licenseePlateNumber }?.let {
            it.status = newStatus
            flights[flights.indexOf(it)] = it
        }
    }

    fun displayFlights() {
        println("출발 Departures")
        println("예정       도착지     편명      체크인        탑승구        현황")
        for (flight in flights) {
            println("${flight.scheduledTime}  ${flight.destination}  ${flight.flightNumber}  ${flight.checkInCounter}  ${flight.gate}  ${flight.status}")
        }

        val arrayOf
    }


}