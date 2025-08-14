package com.practice.interfaces;

import java.io.IOException;

public class CheckMarker {

    public static void main(String[] args) throws IOException {

        InterfaceImplementation impl = new InterfaceImplementation();

        /*
         Checking instance of Marker interface
         */
        if (impl instanceof CustomMarkerInterface) {
            CustomMarkerInterface customMarkerInterface = impl;
        } else
            throw new IOException("CustomMarkerInterface not implemented");

    }
}
