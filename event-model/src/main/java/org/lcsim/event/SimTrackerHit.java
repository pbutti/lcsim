package org.lcsim.event;

/**
 * The interface for a MC TrackerHit generated by the detector simulation.
 * @author Jeremy McCormick
 * @version $Id: SimTrackerHit.java,v 1.21 2011/08/24 18:51:17 jeremy Exp $
 */
public interface SimTrackerHit extends Hit {
    
   /** 
    * Get the layer number of the hit.
    * @return The layer number of the hit. 
    */
   public int getLayer();

   /** 
    * Get the center of the hit in Cartesian coordinates.
    * @return The center point of the hit.
    */
   double[] getPoint();
   
   /** returns dE/dx energy deposition */
   double getdEdx();

   // @Deprecated
   // @deprecated
   // Use {@link #getCellID64()} instead.
   int getCellID();
   
   /**
    * Get the full 64-bit ID of this hit.
    * @return The ID.
    */
   long getCellID64();  
   
   /**
    * Get the time of the hit [ns].
    * @return The time of the hit [ns].
    */
   double getTime();
   
   /**
    * Get the associated MCParticle that made this hit.
    * @return The hit's MCParticle.
    */
   MCParticle getMCParticle();
   
   /** 
    * Get the 3-momentum of the particle at the hit's position [GeV].
    * Optional, only if bit LCIOConstants.THBIT_MOMENTUM is set.
    * @return The 3-momentum of the particle at the hit's position.
    */
   double[] getMomentum();
   
   /** 
    * The path length of the particle in the sensitive material that resulted in this hit.
    * This is only stored together with momentum, i.e. if  LCIO::THBIT_MOMENTUM is set.
    * @return The path length of the hit.
    */
   double getPathLength();
   
   /**
    * Get the start point of the hit.
    * @return The start point.
    */
   double[] getStartPoint();
   
   /**
    * Get the end point of the hit.
    * @return The end point.
    */   
   double[] getEndPoint();
}
