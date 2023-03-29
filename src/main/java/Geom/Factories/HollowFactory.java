package Geom.Factories;

import Geom.Circles.Circles;
import Geom.Circles.HollowCircle;
import Geom.Squares.HollowSquare;
import Geom.Squares.Squares;

public class HollowFactory implements FormeFactories{
    @Override
    public Squares createSquare() {
        return new HollowSquare();
    }

    @Override
    public Circles createCircle() {
        return new HollowCircle();
    }
}
