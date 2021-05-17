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
  private final double[][] WEIGHT = {
        {85, 92, 42, 71, 25, 40},
        {73, 71, 90, 64, 47, 87},
        {51, 37, 72, 43, 97, 68}
    };
  
  // Array to store final score for return value
  private double[] positionScore = new double[3];
  
  // Array to store summed position weight
  private double[] positionWeightSum = new double[3];
  
  // Multidimensional array to store normalized weight
  private double[][] normalizedWeight = new double[3][6]; 
  
  // Multidimensional array to store score each item of stats
  private double[][] scoreEachStat = new double[3][6]; 
  
  
  
  // get best score
  public int getBestScore() {
    double str = positionScore[0];
    double cen = positionScore[1];
    double def = positionScore[2];
    
    double bs = Math.max(Math.max(str,cen),def);
    
    if (bs == str) {
        return 0;
    } else if (bs == cen) {
        return 1;
    } else {
        return 2;
    }
  }
    
  // Normalize weight value
  private void normalizeWeight() {
      
    // Sum each position value
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            this.positionWeightSum[row] += WEIGHT[row][column];
        }
    }
    
    // Store normalized weight to a new array variable
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            this.normalizedWeight[row][column] = WEIGHT[row][column]/positionWeightSum[row];System.out.println(this.normalizedWeight[row][column]);
        }
    }
  }
  
  // Multiply weight with player stat
  private void countScore(double[] playerStat) {
      
    // Multiply weight with player stat
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            this.scoreEachStat[row][column] = normalizedWeight[row][column]*playerStat[column];
        }
    }
    
    // Sum every position score and store it to positionScore
    for (int row = 0; row < 3; row++) {
        for (int column = 0; column < 6; column++) {
            this.positionScore[row] += this.scoreEachStat[row][column];
        }
    }
  }

  // get position score and return its value
  public double[] getPositionScore(double[] playerStat){
      normalizeWeight();
      countScore(playerStat);
      return positionScore;
  }

    public double[][] getWEIGHT() {
        return WEIGHT;
    }

    public double[] getPositionScore() {
        return positionScore;
    }

    public double[] getPositionWeightSum() {
        return positionWeightSum;
    }

    public double[][] getNormalizedWeight() {
        return normalizedWeight;
    }

    public double[][] getScoreEachStat() {
        return scoreEachStat;
    }
}
