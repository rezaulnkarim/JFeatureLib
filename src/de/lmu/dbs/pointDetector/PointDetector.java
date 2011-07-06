package de.lmu.dbs.pointDetector;

import de.lmu.dbs.Descriptor;
import de.lmu.dbs.ImagePoint;
import java.util.List;

/**
 * Interface for all Point detectors
 * 
 * @author graf
 */
interface PointDetector extends Descriptor {

    List<ImagePoint> getSubPoints();
}