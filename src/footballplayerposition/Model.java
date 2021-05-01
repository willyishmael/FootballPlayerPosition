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
    
  double acceleration, shooting, passing, dribbling, defence, physics;
  double strikerScore, centerScore, defenceScore;

  public void listPlayerStat(double[] stat) {
    acceleration = stat[0];
    shooting = stat[1];
    passing = stat[2];
    dribbling = stat[3];
    defence = stat[4];
    physics = stat[5];
     
  }
  
  public void position() {
    double[] strikerWeight = {0.23943662, 0.25915493, 0.118309859, 0.2, 0.070422535, 0.112676056};
    double[] centerWeight = {0.168981481, 0.164351852,0.208333333, 0.148148148,0.108796296, 0.201388889};
    double[] defenceWeight = {0.138586957, 0.100543478,	0.195652174, 0.116847826, 0.263586957, 0.184782609};

    strikerScore = ((acceleration*strikerWeight[0])+
            (shooting*strikerWeight[1])+
            (passing*strikerWeight[2])+
            (dribbling*strikerWeight[3])+
            (defence*strikerWeight[4])+
            (physics*strikerWeight[5]));
    
    centerScore = ((acceleration*centerWeight[0])+
            (shooting*centerWeight[1])+
            (passing*centerWeight[2])+
            (dribbling*centerWeight[3])+
            (defence*centerWeight[4])+
            (physics*centerWeight[5]));
    
    defenceScore = ((acceleration*defenceWeight[0])+
            (shooting*defenceWeight[1])+
            (passing*defenceWeight[2])+
            (dribbling*defenceWeight[3])+
            (defence*defenceWeight[4])+
            (physics*defenceWeight[5]));

    
  }
}
