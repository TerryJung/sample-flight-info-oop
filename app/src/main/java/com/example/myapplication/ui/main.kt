fun main() {
    val terminalDisplay = TerminalDisplay()

    terminalDisplay.addFlight(Flight("","10:00", "","뉴욕/케네디", "KE081", mutableListOf("AR7861"), mutableListOf("C"), "268", "탑승중"))
    terminalDisplay.addFlight(Flight("","10:00", "", "우한", "KE9881",  mutableListOf(),  mutableListOf("A", "B", "D", "E", "G"), "", "결항"))
//    terminalDisplay.addFlight(Flight("10:05", "하노이", "KE483", "A", mutableListOf("DL9032"), "탑승중"))
//    terminalDisplay.addFlight(Flight("10:05", "하노이", "VN3417", "A", mutableListOf(), "탑승중"))
//    terminalDisplay.addFlight(Flight("10:05", "니가타", "KE763", "A", mutableListOf("AF7898"), "탑승중"))

    terminalDisplay.displayFlights()

    // Flight status update example
    terminalDisplay.updateFlightStatus("KE9881", "지연")
    terminalDisplay.displayFlights()


}



