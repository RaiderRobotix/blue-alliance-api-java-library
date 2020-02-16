package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * The event rankings and tiebreaker information for an event
 */
@Value
public class EventRankings {

	/**
	 * List of rankings at the event
	 */
	Ranking[] rankings;
	/**
	 * List of year-specific values provided in the `sort_orders` array for each team.
	 */
	SortOrderInfo[] sort_order_info;

	/**
	 * The Sort order of the rankings for a particular year
	 */
	@Value
	public class SortOrderInfo {

		/**
		 * Name of the field used in the <code>sort_order</code> array.
		 */
		String name;
		/**
		 * Integer expressing the number of digits of precision in the number provided in sort_orders.
		 */
		int precision;

	}

}
