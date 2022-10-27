/*
 * This program creates a jet class.
 *
 * By:      Rodas Nega
 * Version: 1.0
 * Since:   2022-10-27
 */

/**
*  Make an airplane speed class.
*/

public class Jet extends Airplane {
    /**
     * Declaring field for jet speed multiplier.
    */
    private static final int MULTIPLIER = 2;

    /**
     * The getter method for jet acceleration.
    */
    public void acceleration() {
        super.setSpeed(super.getSpeed() * this.MULTIPLIER);
    }

    /**
     * The setter method for the jet speed.
     *
     * @param speed parameter for speed.
    */
    public void setSpeed(int speed) {
        super.setSpeed(speed * this.MULTIPLIER);
    }
}

