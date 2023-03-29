package Geom.Factories;

import Geom.Circles.Circles;
import Geom.Circles.FilledCircle;
import Geom.Squares.FilledSquare;
import Geom.Squares.Squares;

public class FilledFactory implements FormeFactories{
    @Override
    public Squares createSquare() {
        return new FilledSquare();
    }

    @Override
    public Circles createCircle() {
        return new FilledCircle();
    }
}
