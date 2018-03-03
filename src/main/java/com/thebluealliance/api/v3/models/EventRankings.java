package com.thebluealliance.api.v3.models;

/** Represents event rankings and tiebreaker information for an event
 *
 */
public class EventRankings {

	private Ranking[] rankings;
	private SortOrderInfo[] sort_order_info;
	
	/** Represents sort order of the rankings for a particular year
	 *
	 */
	public class SortOrderInfo {
		
		private String name;
		private int precision;
		
		/**
		 * @return Name of the field used in the <code>sort_order</code> array.
		 */
		public String getName() {
			return name;
		}
		
		/**
		 * @return Integer expressing the number of digits of precision in the number provided in sort_orders.
		 */
		public int getPrecision() {
			return precision;
		}

	}
	
	/**
	 * @return List of rankings at the event
	 */
	public Ranking[] getRankings() {
		return rankings;
	}
	
	/**
	 * @return List of year-specific values provided in the `sort_orders` array for each team.
	 */
	public SortOrderInfo[] getSortOrderInfo() {
		return sort_order_info;
	}
	


	
}
