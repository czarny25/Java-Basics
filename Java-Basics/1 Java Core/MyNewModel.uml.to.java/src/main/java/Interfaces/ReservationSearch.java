/*******************************************************************************
 * 2014, All rights reserved.
 *******************************************************************************/
package Interfaces;

import Behaviours.Actors.Customer;
import Reservation;
import Travel;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of ReservationSearch.
 * 
 * @author Marcin
 */
public interface ReservationSearch {
	// Start of user code (user defined attributes for ReservationSearch)
	
	// End of user code
	
	/**
	 * Description of the method get.
	 * @param customer 
	 * @return 
	 */
	public Reservation get(Customer customer);
	
	/**
	 * Description of the method findByTravel.
	 * @param travel 
	 * @return 
	 */
	public Reservation findByTravel(Travel travel);
	
	// Start of user code (user defined methods for ReservationSearch)
	
	// End of user code


}
