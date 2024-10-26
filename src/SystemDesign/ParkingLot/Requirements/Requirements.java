package SystemDesign.ParkingLot.Requirements;
/**
 * The parking lot should have multiple floors where customers can park their cars.
 *
 * The parking lot should have multiple entry and exit point
 *
 * Customers can collect a parking ticket from the entry points and can pay the parking fee at the exit points on their way out.
 *
 * Customers can pay the tickets at the automated exit panel or to the parking attendant.
 *
 * Customers can pay via both cash and credit cards.
 *
 * The system should not allow more vehicles than the maximum capacity of the parking lot. If the parking is full, the system should be able to show a message at the entrance panel and on the parking display board on the ground floor.
 *
 * Each parking floor will have many parking spots. The system should support multiple types of parking spots such as Compact, Large, Handicapped, Motorcycle, etc.
 *
 * The Parking lot should have some parking spots specified for electric cars. These spots should have an electric panel through which customers can pay and charge their vehicles.
 *
 * The system should support parking for different types of vehicles like car, truck, van, motorcycle, etc.
 *
 * Each parking floor should have a display board showing any free parking spot for each spot type.
 *
 * The system should support a per-hour parking fee model. For example, customers have to pay $4 for the first hour, $3.5 for the second and third hours, and $2.5 for all the remaining hours.
 */

//------------------------------------Schema design----------------------------------

/**
 * ParkingLot
 * ----------
 * id
 * name
 * address
 */

/**
 * Floor
 * ----------
 * id
 * parking_lot_id
 * floor_no
 */

/**
 * ParkingSpot
 * ----------
 * id
 * floor_id
 * spot_type -->ENUM('Compact', 'Large', 'Handicapped', 'Motorcycle', 'Electric')
 * is_available
 */


/**
 * Vehicle
 * ----------
 * id
 * license_plate
 * vehicle_type -->ENUM('Car', 'Truck', 'Motorcycle')
 */

/**
 * Ticket
 * ----------
 * id
 * vehicle_id
 * parking_spot_id
 * entry_time
 * exit_time
 * is_paid
 * amount_paid
 *
 */


/**
 * Payment
 * ----------
 * id
 * ticket_id
 * payment_type -->ENUM('Cash', 'Credit Card')
 * payment_time
 * amount
 *
 */

/**
 * ElectricPanel
 * ----------
 * id
 * parking_spot_id
 * is_charging
 *
 */





