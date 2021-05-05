/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballplayerposition;

/**
 *
 * @author User
 */
public class Model {
    
  // Multidimentional array that contains weight[position][stat]
  private final double[][] weight = {
        {85, 92, 42, 71, 25, 40},
        {73, 71, 90, 64, 47, 87},
        {51, 37, 72, 43, 97, 68}
    };
  
  // Array to store sum of weight from position
  // and to store final score for return value
  private double[] positionScore;
  
  // Multidimentional array to store normalized weight,
  // and sto store player score
  private double[][] normalizedWeight; 
    
  // Normalize weight value
  private void normalizeWeight() {
      
    double[] positionWeightSum = {0,0,0};
    double[][] nw = {
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
    };
      
    // Sum each position value
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            positionWeightSum[row] += weight[row][column];
        }
    }
    
    // Store normalized weight to a new array variable
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            nw[row][column] = weight[row][column]/positionWeightSum[row];
        }
    }
    
    normalizedWeight = nw;
  }
  
  // Multiply weight with player stat
  private void countScore(double[] playerStat) {
    
    double[] ps = {0,0,0};
    double[][] sc = {
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
    };
      
    // Multiply weight with player stat
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            sc[row][column] = normalizedWeight[row][column]*playerStat[column];
        }
    }
    
    // Sum every position score and store it to positionScore
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            ps[row] += sc[row][column];
        }
    }
    
    positionScore = ps;
  }

  // get position score and return its value
  public double[] getPositionScore(double[] playerStat){
      normalizeWeight();
      countScore(playerStat);
      return positionScore;
  }
}
