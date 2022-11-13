package com.ct.Loan.Model;



public class EligibiltyCalculator {
	
		private Double monthlyIncome;
		private Double rOI;

		public EligibiltyCalculator(){
			
		}
		public Double getmonthlyIncome() {
			return monthlyIncome;
		}
		public void setmonthlyIncome(Double monthlyIncome) {
			this.monthlyIncome = monthlyIncome;
		}
		public Double getrOI() {
			return rOI;
		}
		public void setrOI(Double rOI) {
			this.rOI = rOI;
		}
		

		@Override
		public String toString() {
			return "EligibiltyCalculator [monthlyIncome=" + monthlyIncome + ", rOI=" + rOI + "]";
		}
		
		
}
