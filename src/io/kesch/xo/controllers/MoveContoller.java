package io.kesch.xo.controllers;

import io.kesch.xo.model.Field;
import io.kesch.xo.model.Figure;
import io.kesch.xo.model.exceptions.AlreadyOccupiedException;
import io.kesch.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveContoller {

    public void applyFigure(final Field field,
                            final Figure figure,
                            final Point point)throws InvalidPointException,
                                                     AlreadyOccupiedException {
        if (field.getFigure(point)!= null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point,figure);

    }

}
