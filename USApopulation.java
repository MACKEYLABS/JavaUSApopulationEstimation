Java USA Population Estimation Program

public class PopulationFiveYears {
//Defining class type above
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     int currentPop, totalSecYear, yearOnePop, yearTwoPop, yearThreePop, yearFourPop, yearFivePop;
	     // Defining integer types used for the equation and printing to the screen.
	     double birthsPerYear, immigrantsPerYear, deathsPerYear; 
	     //Defining double types for the population euqations.
	       
	       currentPop = 312032486; //Defining Population Size
         
         totalSecYear = 365 * 24 * 60 * 60; //Equation to get seconds in a year by days of year * 24hrs * 60 sec * 60. Mins.
         birthsPerYear = totalSecYear / 7.0; //Equation for births per year
         deathsPerYear = totalSecYear / 13.0; //Equation for deaths per year
         immigrantsPerYear = totalSecYear / 45.0; //Equation for Immigrants per year
           
         yearOnePop = (int) ((currentPop) + (birthsPerYear + immigrantsPerYear - deathsPerYear) / 1);
         //ABOVE is the equation for the population after one year.
         //I had to insert (int) into the equation to transfer the float type back to integer. 
         yearTwoPop = (int) ((currentPop) + (2 * (birthsPerYear + immigrantsPerYear - deathsPerYear)) / 1);
         //ABOVE is the equation for the population after two years.
         yearThreePop = (int) ((currentPop) + (3 * (birthsPerYear + immigrantsPerYear - deathsPerYear)) / 1);
         //ABOVE is the equation for the population after three years.
         yearFourPop = (int) ((currentPop) + (4 * (birthsPerYear + immigrantsPerYear - deathsPerYear)) / 1);
         //ABOVE is the equation for the population after four years.
         yearFivePop = (int) ((currentPop) + (5 * (birthsPerYear + immigrantsPerYear - deathsPerYear)) / 1);
         //ABOVE is the equation for the population after five years.
        		   
	     System.out.println("Starting population: " + currentPop); //Print to screen Starting Population
	     System.out.println("Population Year One: " + yearOnePop); //Print to screen Starting Population
	     System.out.println("Population Year Two: " + yearTwoPop); //Print to screen Starting Population
	     System.out.println("Population Year Three: " + yearThreePop); //Print to screen Starting Population
	     System.out.println("Population Year Four: " + yearFourPop); //Print to screen Starting Population
	     System.out.println("Population Year Five: " + yearFivePop); //Print to screen Starting Population
	      
		}

}

