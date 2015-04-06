/**
 * Unit-API - Units of Measurement API for Java
 * Copyright (c) 2014 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package si.uom.quantity;

import javax.measure.Quantity;

/**
 * Extent of something along its greatest dimension or the extent of space
 * between two objects or places. The metric system unit for this quantity is
 * "m" (metre).
 *
 * @author <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 1.1.1
 *
 * @see Area
 * @see Volume
 * @see Angle
 * @see SolidAngle
 * @see Speed
 */
public interface Length extends Quantity<Length> {
	/**
	 * Returns the product of this {@code Length} with the one specified resulting in {@link Area}
	 *
	 *
	 * @param that
	 *            the {@code Length} multiplier.
	 * @return <code>this * that</code>.
	 */
	Area multiply(Length that);
}
